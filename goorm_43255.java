import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i++) {
			if(n%i==0) sb.append(i+" ");
		}
		System.out.println(sb);
	}
}
