package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class IO_1330 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 받은 입력 값을 띄어쓰기를 구분자로 해서 A과 B로 나눈다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A>B) System.out.println(">");
		else if(A<B) System.out.println("<");
		else System.out.println("==");
		
	}
}
