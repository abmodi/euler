import java.math.BigInteger;

/**
 * Created by abmodi on 7/17/17.
 */
public class Problem025 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        long index = 2;
        while(true) {
            ++index;
            BigInteger c = a.add(b);
            a = b;
            b = c;
            if (c.toString().length() >= 1000) {
                System.out.println(index);
                return;
            }
        }
    }
}
