/**
 * Created by abmodi on 7/15/17.
 */
public class Problem001 {
    public static void main(String[] args) {
        long result = 0;
        for (int i=1; i < 1000; ++i) {
            if (i % 3 == 0 || i %5 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
