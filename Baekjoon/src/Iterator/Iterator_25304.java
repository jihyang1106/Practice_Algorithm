package Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Iterator_25304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()); // 총 금액
		int N = Integer.parseInt(br.readLine()); // 물건 종류 수
		StringTokenizer st; 
		int sum = 0; // 금액을 넣을 변수
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sum += (a*b);
		}
		// 총 금액이 일치하면 Yes, 아니면 No
		if(X == sum) System.out.println("Yes");
		else System.out.println("No");
	}
}
