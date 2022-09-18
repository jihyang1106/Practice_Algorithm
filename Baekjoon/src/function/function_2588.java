package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class function_2588 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		// sb에 계산식 넣고 출력(1)
		StringBuilder sb = new StringBuilder();
		sb.append(A*(B%10));
		sb.append("\n");
		
		sb.append(A*(B%100/10));
		sb.append("\n");
		
		sb.append(A*(B/100));
		sb.append("\n");
		
		sb.append(A*B);
		System.out.println(sb);
		
//		String B = br.readLine();
//		multiple 배열에 계산식 넣고 출력(2)
//		int[] multiple = new int[4];
//		
//		charAt(i)-'0'를 하면 원하는 정수형을 사용가능!
//		multiple[0] = (A *(B.charAt(2)-'0'));
//		multiple[1] = (A *(B.charAt(1)-'0'));
//		multiple[2] = (A *(B.charAt(0)-'0'));
//		multiple[3] = (A *(Integer.parseInt(B)));
//		
//		for(int i=0; i<multiple.length; i++) {
//			System.out.println(multiple[i]);
//		}
	}

}
