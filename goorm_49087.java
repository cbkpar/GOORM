import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] pos = new int[3][2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		pos[0][0] = Integer.parseInt(st.nextToken());
		pos[0][1] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		pos[1][0] = Integer.parseInt(st.nextToken());
		pos[1][1] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		pos[2][0] = Integer.parseInt(st.nextToken());
		pos[2][1] = Integer.parseInt(st.nextToken());
		int ans = pos[0][0] * pos[1][1] + pos[1][0] * pos[2][1] + pos[2][0] * pos[0][1];
		ans -= pos[0][1] * pos[1][0] + pos[1][1] * pos[2][0] + pos[2][1] * pos[0][0];
		ans = Math.abs(ans);
		System.out.printf("%.02f", ((double) ans) / 2);
	}
}
