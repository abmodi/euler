import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by abmodi on 7/15/17.
 */
public class Problem005 {
    public static void main(String[] args) {
        Map<Integer, Integer> rf = new HashMap<Integer, Integer>();
        for (int i = 2; i <= 20; ++i) {
            Map<Integer, Integer> factors = getFactors(i);
            for (Integer key : factors.keySet()) {
                if (!rf.containsKey(key) || rf.get(key) < factors.get(key)) {
                    rf.put(key, factors.get(key));
                }
            }
        }
        long result = 1;
        for (Integer key : rf.keySet()) {
            result = result * power(key, rf.get(key));
        }
        System.out.println(result);
    }

    static Map<Integer, Integer> getFactors(long x) {
        Map<Integer, Integer> factors = new HashMap<Integer, Integer>();
        while (x > 1) {
            for (int i = 2; i < 20; ++i) {
                if (x % i == 0) {
                    if (factors.containsKey(i)) {
                        factors.put(i, factors.get(i) + 1);
                    } else {
                        factors.put(i, 1);
                    }
                    x /= i;
                    break;
                }
            }
        }
        return factors;
    }

    static long power(long a, int b) {
        long result = 1;
        for (int i = 0; i < b; ++i) {
            result *= a;
        }
        return result;
    }
}
