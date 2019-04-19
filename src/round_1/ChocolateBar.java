package round_1;

import java.io.*;

//https://codeforces.com/contest/598/problem/E
public class ChocolateBar {
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
    static StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

    static long nextLong() throws IOException {
        st.nextToken();
        return (long) st.nval;
    }

    static int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    static String nextString() throws IOException {
        st.nextToken();
        return st.sval;
    }

    static long[][][] dp = new long[32][32][52];


    public static void main(String[] args) throws Exception {
        solve();
        int t = nextInt();

        while (--t >= 0) {
            int n = nextInt();
            int m = nextInt();
            int k = nextInt();
            pw.println(dp[n][m][k]);
        }

        pw.flush();
    }

    private static void solve() {
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 51; k++) {
                    if (i * j == k || k == 0) dp[i][j][k] = 0;
                    else dp[i][j][k] = Integer.MAX_VALUE;

                    for (int h = 0; h <= k; h++) {
                        for (int x = 1; x < i; x++) {
                            dp[i][j][k] = Math.min(dp[i][j][k], dp[i-x][j][k-h] + dp[x][j][h] + j * j);
                        }
                        for (int y = 1; y < j; y++) {
                            dp[i][j][k] = Math.min(dp[i][j][k], dp[i][j-y][k-h] + dp[i][y][h] + i * i);
                        }
                    }
                }
            }
        }
    }
}
