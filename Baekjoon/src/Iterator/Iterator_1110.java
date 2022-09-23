package Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iterator_1110 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// N의 1의 자릿수 => 새로운 수의 10의 자리로,
		// N의 1의 자릿수와 10의 자릿수를 더한 값의 1의 자릿수 => 새로운 수의 1의 자리로
		int N = Integer.parseInt(br.readLine());
		
		int copyN = N; // N을 복사한 변수 copyN
		int count = 0;
		
//		(1) while문
//		while(true) {
//			int newLeft = N/10;
//			int newRight = N%10;
//			N = newRight*10 + (newLeft+newRight)%10;
//			count++;
//			if(N==copyN) {
//				break;
//			}
//		}
		
//		(2)do-while문(최소 한번은 반복)
		do {
			// 새로운 수의 10의 자리 + 새로운 수의 1의 자리
			N = ((N%10)*10)+(((N/10)+(N%10))%10);
			count++;
		}while(N != copyN); // N과 copyN이 같을 때까지 반복(조건식이 false이면 종료)
		
		System.out.println(count);
	}
}
