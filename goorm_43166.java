import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = 0;
		for(int i=n;i>=1;i--){
			if(i%3==0||i%5==0) ans += i;
		}
		System.out.println(ans);
	}
}
