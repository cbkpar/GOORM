import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] stack = new int[10];
        while (n-- > 0) {
            int task = Integer.parseInt(br.readLine());
            if (task == 0) {
                if (cnt == 10) {
                    sb.append("overflow\n");
                } else {
                    stack[cnt++] = Integer.parseInt(br.readLine());
                }

            } else if (task == 1) {
                if (cnt == 0) {
                    sb.append("underflow\n");
                } else {
                    cnt--;
                }
            } else {
                break;
            }
        }
        if (cnt == 0) {
            System.out.printf("%s", sb.toString());
        } else {
            for (int i = 0; i < cnt; i++) sb.append(stack[i] + " ");
            System.out.println(sb);
        }
    }
}
