/**
 * Created by abmodi on 7/17/17.
 */
public class Problem024 {
    static String swap(String s, int i, int j) {
        char temp;
        char[] chars = s.toCharArray();
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        for (int l= i+1; l < j; ++l) {
            for (int k=l+1;k <= j; ++k) {
                if (chars[l] > chars[k]) {
                    temp = chars[l];
                    chars[l] = chars[k];
                    chars[k] = temp;
                }
            }
        }
        return String.valueOf(chars);
    }

    static int count = 0;


    static void permute(String s, int l, int r) {
        if (l == r) {
            ++count;
            if (count == 1000000) {
                System.out.println(s);
                return;
            }
        }
        else {
            for (int i=l; i <= r; ++i) {
                s = swap(s, l, i);
                permute(s, l+1, r);
                s = swap(s, l, i);
            }
        }
    }

    public static void main(String[] args) {
        String s = "0123456789";
        permute(s, 0, 9);
    }
}
