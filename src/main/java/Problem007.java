import java.util.List;
import java.util.Vector;

/**
 * Created by abmodi on 7/15/17.
 */
public class Problem007 {
    public static void main(String[] args) {
        List<Long> primes = new Vector<Long>(10002);
        System.out.println(primes.size());
        for (long i=2; primes.size() < 10001; ++i) {
            boolean isPrime = true;
            for (long prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        System.out.println(primes.get(10000));
    }
}
