import java.util.HashMap;
import java.util.Map;

/**
 * Created by abmodi on 7/16/17.
 */
public class Problem012 {
    public static void main(String[] args) {
        for (int num=100; ; ++num) {
            Map<Integer, Integer> factors = new HashMap<Integer, Integer>();
            int a = num;
            int b = num + 1;
            for (int i=2; i <= a; ) {
                if (a % i == 0) {
                    if (factors.containsKey(i)) {
                        factors.put(i, factors.get(i) + 1);
                    }
                    else {
                        factors.put(i, 1);
                    }
                    a /= i;
                } else {
                    ++i;
                }
            }
            for (int i=2; i <= b; ) {
                if (b % i == 0) {
                    if (factors.containsKey(i)) {
                        factors.put(i, factors.get(i) + 1);
                    }
                    else {
                        factors.put(i, 1);
                    }
                    b /= i;
                } else {
                    ++i;
                }
            }
            factors.put(2, factors.get(2) -1);
            if (getNumFactors(factors) > 500) {
                System.out.println((num * (num+1))/2);
                break;
            }
        }
    }

    static int getNumFactors(Map<Integer, Integer> factors) {
        int prod = 1;
        for (Integer factor : factors.keySet()) {
            prod *= (factors.get(factor) + 1);
        }

        return prod;
    }
}
