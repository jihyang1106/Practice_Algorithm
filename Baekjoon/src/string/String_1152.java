package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_1152 {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		int cnt = 0; // 단어의 개수를 출력하는 것을 세는 변수
//		while(st.hasMoreTokens()) { // 문자열이 있을 동안만 while문 
//			st.nextToken();
//			cnt ++;
//		}
//		System.out.println(cnt);
	
//		(2) countTokens()를 사용
		System.out.println(st.countTokens());
	}
}
