import java.io.*;

public class TemplateIO {
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
        int t = nextInt();

        while (--t >= 0) {

        }

        pw.flush();
    }

}
