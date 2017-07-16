import java.math.BigInteger;

/**
 * Created by abmodi on 7/16/17.
 */
public class Problem016 {
    public static void main(String[] args) {
        BigInteger x = new BigInteger("1");
        for(int i=0; i < 1000; ++i) {
            x = x.multiply(new BigInteger("2"));
        }
        String s = x.toString();
        long res = 0;
        for (char c : s.toCharArray()) {
            res += Character.getNumericValue(c);
        }
        System.out.println(res);
    }
}
