/**
 * Created by abmodi on 7/15/17.
 */
public class Problem003 {
    public static void main(String[] args) {
        long val = 600851475143L;
        long result = 2;
        while (val != 1) {
            if (val % result == 0) {
                val /= result;
            }
            else {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
