import java.util.*;
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double score = Double.parseDouble(st.nextToken());
		score += Double.parseDouble(st.nextToken());
		score += Double.parseDouble(st.nextToken());
		if(score>=270){
			System.out.printf("%.02f A",score/3);
		}else if(score>=240){
			System.out.printf("%.02f B",score/3);
		}else if(score>=210){
			System.out.printf("%.02f C",score/3);
		}else if(score>=180){
			System.out.printf("%.02f D",score/3);
		}else{
			System.out.printf("%.02f F",score/3);
		}
	}
}
