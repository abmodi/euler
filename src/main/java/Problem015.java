/**
 * Created by abmodi on 7/16/17.
 */
public class Problem015 {
    static long dp[][] = new long[21][21];
    static final int GM = 20;

    static long res(int x, int y) {
        if (dp[x][y] != 0) {
            return dp[x][y];
        }

        if (x == GM && y == GM) {
            dp[x][y] = 1;
            return dp[x][y];
        }

        if (x == GM) {
            dp[x][y] = res(x, y+1);
            return dp[x][y];
        }

        if (y == GM) {
            dp[x][y] = res(x+1,y);
            return dp[x][y];
        }

        dp[x][y] = res(x+1,y) + res(x, y+1);
        return dp[x][y];
    }

    public static void main(String[] args) {
        System.out.println(res(0,0));
    }
}
