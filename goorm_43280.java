import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().replaceAll("x", " ");
        StringTokenizer st = new StringTokenizer(str);
        int s = 0;
        while (st.hasMoreTokens()) {
            int t = st.nextToken().length();
            s += (t * (t + 1)) / 2;
        }
        System.out.println(s);
    }
}
