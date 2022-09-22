package Iterator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Iterator_10950 {

	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine()); // testCase 수 받기

//		(1) 그냥 for을 돌려서 출력
//		for(int i=0;i<testCase;i++) {
//			// 입력 수 A와 B를 분할하고 더하기
//			StringTokenizer st = new StringTokenizer(br.readLine()," ");
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			System.out.println(A+B);
//		}
//		
//		(2) StringBuilder 안에 넣어서 출력
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i=0;i<testCase;i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())
					+Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}	
		System.out.println(sb);
	}
}
