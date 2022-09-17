package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class function_3003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] chess = {1, 1, 2, 2, 2, 8};
		
//		StringBuilder를 이용하지 않고 바로 출력하기
//		for(int i=0; i<chess.length; i++) {
//			int n = Integer.parseInt(st.nextToken());
//			System.out.printf(chess[i]-n + " ");
//		}
		
//		StringBuilder를 이용해서 출력하기
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<chess.length; i++) {
			int n= Integer.parseInt(st.nextToken());
			sb.append(chess[i]-n + " ");
		}
		System.out.println(sb);
	}
}
