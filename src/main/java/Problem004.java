/**
 * Created by abmodi on 7/15/17.
 */
public class Problem004 {
    public static void main(String[] args) {
        long result = 0;
        for (int i = 100; i < 1000; ++i) {
            for (int j= 100; j < 1000; ++j) {
                long prod = i * j;
                if (prod > result && isPallindrome(prod)) {
                    result = prod;
                }
            }
        }
        System.out.println(result);
    }

    static boolean isPallindrome(long y) {
        long nx = 0;
        long x = y;
        while (x != 0) {
            nx *= 10;
            nx += (x%10);
            x /= 10;
        }
        return nx == y;
    }
}
