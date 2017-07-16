import java.math.BigInteger;

/**
 * Created by abmodi on 7/16/17.
 */
public class Problem020 {
    public static void main(String[] args) {
        BigInteger val = new BigInteger("1");
        for (int i=2; i < 101; ++i) {
            val = val.multiply(new BigInteger(Integer.toString(i)));
        }
        String s = val.toString();
        long res = 0;
        for (char c : s.toCharArray()) {
            res += Character.getNumericValue(c);
        }
        System.out.println(res);
    }
}
