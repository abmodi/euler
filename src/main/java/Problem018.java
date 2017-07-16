/**
 * Created by abmodi on 7/16/17.
 */
public class Problem018 {
    static String s = "75\n" +
            "95 64\n" +
            "17 47 82\n" +
            "18 35 87 10\n" +
            "20 04 82 47 65\n" +
            "19 01 23 75 03 34\n" +
            "88 02 77 73 07 63 67\n" +
            "99 65 04 28 06 16 70 92\n" +
            "41 41 26 56 83 40 80 70 33\n" +
            "41 48 72 33 47 32 37 16 94 29\n" +
            "53 71 44 65 25 43 91 52 97 51 14\n" +
            "70 11 33 28 77 73 17 78 39 68 17 57\n" +
            "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
            "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
            "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    static class Val {
        int val;
        int maxSum;
        int level;
    };

    static Val[] arr = new Val[200];
    static final int MAX_LEVEL = 15;

    static int getMaxSum(int index) {
        Val v = arr[index];
        if (v.maxSum != 0) {
            return v.maxSum;
        }
        if (v.level == MAX_LEVEL) {
            v.maxSum = v.val;
            return v.maxSum;
        }
        v.maxSum = v.val + Math.max(getMaxSum(index + v.level), getMaxSum(index + v.level + 1));
        return v.maxSum;
    }

    public static void main(String[] args) {
        String[] ss = s.split("\n");
        int arrIndex = 0;
        for (int i=0; i < ss.length; ++i) {
            String[] xx = ss[i].split(" ");
            for (String x : xx) {
                arr[arrIndex] = new Val();
                arr[arrIndex].level = i + 1;
                arr[arrIndex].val = Integer.parseInt(x);
                arrIndex += 1;
            }
        }
        System.out.println(getMaxSum(0));
    }
}
