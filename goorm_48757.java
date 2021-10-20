import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		for(int i=1;i<n;i++){
			int t = i;
			while(t>0){
				if((t%10)==3||(t%10)==6||(t%10)==9) cnt++;
				t/=10;
			}
		}
		System.out.println(cnt);
	}
}
