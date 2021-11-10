import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if (sum < arr[i] * n) cnt++;
		}
		System.out.printf("%.1f %d", (double) sum / (double) n, cnt);
	}
}
