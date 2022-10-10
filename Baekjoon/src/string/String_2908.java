package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_2908 {

	public static void main(String[] args)throws IOException {
		// 1. 수를 거꾸로 읽는다.
		// 2. 두 수를 비교해서 큰 수를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

//		1) 문자열 뒤집는 알고리즘을 작성해서 사용
		int A = reverse(Integer.parseInt(st.nextToken()));
		int B = reverse(Integer.parseInt(st.nextToken()));
		
//		2) StringBuilder의 reverse를 사용해서 거꾸로 뒤집음
//		StringBuilder sbA = new StringBuilder(st.nextToken());
//		StringBuilder sbB = new StringBuilder(st.nextToken());
//		int A = Integer.parseInt(sbA.reverse().toString());
//		int B = Integer.parseInt(sbB.reverse().toString());
		
		System.out.println(A>B? A:B); // 삼항연산자 
	}
	
	// 받은 수를 거꾸로 뒤집는 알고리즘
	public static int reverse(int num) {
		int answer = 0;
		while(answer!=0) {
			answer = answer*10 + answer % 10;
			num /= 10;
		}
		return answer;
	}
}
