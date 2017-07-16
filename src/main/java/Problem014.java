import java.util.HashMap;
import java.util.Map;

/**
 * Created by abmodi on 7/16/17.
 */
public class Problem014 {
    static Map<Long, Long> dp = new HashMap<Long, Long>();

    static long rec(long inp) {
        long x = inp;
        if (x == 1) {
            dp.put(1L, 1L);
            return 1;
        }
        if(dp.containsKey(x)) {
            return dp.get(x);
        }
        if (x % 2 == 0) {
            x /= 2;
        } else {
            x = (3 * x) + 1;
        }
        dp.put(inp, rec(x) + 1);
        return dp.get(inp);
    }

    public static void main(String[] args) {
        long res = 1;
        long chain = 1;
        for (long i=1; i < 1000000; ++i) {
            long r = rec(i);
            if (r > chain) {
                chain = r;
                res = i;
            }
        }
        System.out.println(res);
    }
}
