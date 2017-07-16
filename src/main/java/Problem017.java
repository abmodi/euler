import java.util.HashMap;
import java.util.Map;

/**
 * Created by abmodi on 7/16/17.
 */
public class Problem017 {
    static Map<Integer, Integer> wordL = new HashMap<Integer, Integer>();

    static int getWordLen(int x) {
        if (wordL.containsKey(x)) {
            return wordL.get(x);
        }
        if (x == 1000) {
            return 3 + 8;
        }
        if (x < 100) {
            return wordL.get(x % 10) + wordL.get((x/10)*10);
        }
        else {
            if (x%100 == 0) {
                return wordL.get(x/100) + 7;
            }
            return wordL.get(x/100) + 10 + getWordLen(x%100);
        }
    }

    public static void main(String[] args) {
        wordL.put(1, 3);
        wordL.put(2, 3);
        wordL.put(3, 5);
        wordL.put(4, 4);
        wordL.put(5, 4);
        wordL.put(6, 3);
        wordL.put(7, 5);
        wordL.put(8, 5);
        wordL.put(9, 4);
        wordL.put(10, 3);
        wordL.put(11, 6);
        wordL.put(12, 6);
        wordL.put(13, 8);
        wordL.put(14, 8);
        wordL.put(15, 7);
        wordL.put(16, 7);
        wordL.put(17, 9);
        wordL.put(19, 8);
        wordL.put(20, 6);
        wordL.put(30, 6);
        wordL.put(40, 5);
        wordL.put(50, 5);
        wordL.put(60, 5);
        wordL.put(70, 7);
        wordL.put(80, 6);
        wordL.put(90, 6);

        int res = 0;
        for (int i=1; i<=1000; ++i) {
            res += getWordLen(i);
        }
        System.out.println(res);
    }
}
