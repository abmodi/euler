/**
 * Created by abmodi on 7/15/17.
 */
public class Problem009 {
    public static void main(String[] args) {
        for (int a = 1; a < 400; ++a) {
            for (int b = a + 1; b < 500; ++b) {
                int c = 1000 - a - b;
                if (checkTriplet(a , b, c)) {
                    System.out.println(a * b * c);
                    return;
                }
            }
        }
    }

    static boolean checkTriplet(int a, int b, int c) {
        return (((a * a) + (b * b)) == (c * c));
    }
}
