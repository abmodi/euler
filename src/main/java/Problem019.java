/**
 * Created by abmodi on 7/16/17.
 */
public class Problem019 {
    static int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return (year % 400 == 0);
        }
        return (year % 4 == 0);
    }

    static int days(int year, int month) {
        int days = 0;
        for (int i=1900; i < year; ++i) {
            if (isLeapYear(i)) {
                days += 366;
            }
            else {
                days += 365;
            }
        }

        for (int i=1; i < month; ++i) {
            if (i == 2 && isLeapYear(year)) {
                days += 1;
            }
            days += arr[i];
        }
        return days%7;
    }

    static boolean isSunday(int year, int month) {
        return days(year, month) == 6;
    }

    public static void main(String[] args) {
        int cnt = 0;
        for (int year = 1901; year < 2001; ++year) {
            for (int month = 1; month < 13; ++month) {
                if (isSunday(year, month)) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
