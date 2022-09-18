package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class function_10430 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 입력받은 숫자를 Tokenizer로 A,B,C로 나누기
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		// remain이라는 정수배열에 계산식을 차례로 넣기
		int[] remain = new int[4];

		remain[0] = (A+B)%C;
		remain[1] = ((A%C)+(B%C))%C;
		remain[2] = (A*B)%C;
		remain[3] = ((A%C)*(B%C))%C;
		
		for(int i=0; i<remain.length; i++) {
			System.out.println(remain[i]);
		}
		
	}
}
