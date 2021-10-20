import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int k = 0;
		int t = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			int now = Integer.parseInt(st.nextToken());
			if(now-t<=c){
				k++;
			}else{
				k = 1;
			}
			t = now;
		}
		System.out.println(k);
	}
}
