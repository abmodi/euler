import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by abmodi on 7/17/17.
 */
public class Problem023 {
    static Map<Integer, Set<Integer>> factorMap = new HashMap<Integer, Set<Integer>>();
    static Set<Integer> abundantInts = new HashSet<Integer>();

    static Set<Integer> getFactor(int x) {
        if (factorMap.containsKey(x)) {
            return factorMap.get(x);
        }

        Set<Integer> res = new HashSet<Integer>();
        res.add(1);
        res.add(x);
        for (int i=2; i * i <= x; ++i) {
            if (x % i == 0) {
                Set<Integer> sFactors = getFactor(i);
                Set<Integer> lFactors = getFactor(x/i);

                for (int a : sFactors) {
                    for (int b : lFactors) {
                        res.add(a*b);
                    }
                }
                break;
            }
        }
        factorMap.put(x, res);
        return res;
    }

    public static void main(String[] args) {
        for (int i=3; i <= 28123; ++i) {
            Set<Integer> factors = getFactor(i);
            int sumF = 0;
            for (int factor : factors) {
                sumF += factor;
            }
            if (sumF > 2*i) {
                abundantInts.add(i);
            }
        }

        Set<Integer> nonResInts = new HashSet<Integer>();
        for (int a : abundantInts) {
            for (int b : abundantInts) {
                nonResInts.add(a+b);
            }
        }

        long res = 0;
        for (int i = 1; i <= 28123; ++i) {
            if (!nonResInts.contains(i)) {
                res += i;
            }
        }

        System.out.println(res);
    }
}
