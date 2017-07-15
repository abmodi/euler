import java.util.List;
import java.util.Vector;

/**
 * Created by abmodi on 7/16/17.
 */
public class Problem010 {
    public static void main(String[] args) {
        List<Long> primes = new Vector<Long>(10002);
        long res = 0;
        for (long i=2; i < 2000000; ++i) {
            boolean isPrime = true;
            for (long prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
                if (prime * prime > i) {
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
                res += i;
            }
        }
        System.out.println(primes.size());
        System.out.println(res);
    }
}
