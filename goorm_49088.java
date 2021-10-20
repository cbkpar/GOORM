import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++){
			if(i%2==1){
				b += (a+1)/2;
				a /= 2;
			}else{
				a += (b+1)/2;
				b /= 2;
			}
		}
		System.out.println(a+" "+b);
	}
}
