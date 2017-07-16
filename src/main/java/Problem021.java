import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by abmodi on 7/16/17.
 */
public class Problem021 {
    static Map<Integer, Set<Integer>> factorMap = new HashMap<Integer, Set<Integer>>();

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
        int[] arr = new int[10000];
        for (int i=2; i < 10000; ++i) {
            Set<Integer> factors = getFactor(i);
            for (int factor : factors) {
                arr[i] += factor;
            }
            arr[i] -= i;
        }
        int res = 0;
        for (int i=2; i < 10000; ++i) {
            if (arr[i] < 10000 && arr[i] != i && arr[arr[i]] == i) {
                res += i;
            }
        }

        System.out.println(res);
    }
}
