package round_1;

import java.io.*;

// https://codeforces.com/contest/598/problem/B
public class QueriesOnAString {

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

    public static void main(String[] args) throws Exception {
        String s = nextString();
        char[] arr = s.toCharArray();
        int m = nextInt();
        for (int i = 0; i < m; i++) {
            int start = nextInt();
            int end = nextInt();
            int pos = nextInt();
            rotate(arr, start-1, end-1, pos % (end - start + 1));
        }
        for (char c : arr) pw.print(c);
        pw.println();
        pw.flush();
    }

    private static void rotate(char[] arr, int start, int end, int num) {
        if (num == 0) return;
        swap(arr, start, end - num);
        swap(arr, end - num + 1, end);
        swap(arr, start, end);
    }

    private static void swap(char[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            char c = arr[i];
            arr[i] = arr[j];
            arr[j] = c;
        }
    }

}
