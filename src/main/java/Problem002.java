/**
 * Created by abmodi on 7/15/17.
 */
public class Problem002 {
    public static void main(String[] args) {
        long result = 0;
        long prev1 = 1;
        long prev2 = 1;
        long i = 1;
        while(true) {
            i = prev1 + prev2;
            prev1 = prev2;
            prev2 = i;
            if (i > 4000000) {
                break;
            }
            if (i % 2 == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
