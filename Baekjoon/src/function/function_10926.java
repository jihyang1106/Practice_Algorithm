package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class function_10926 {

	public static void main (String[] args) throws IOException {
		
		// BufferedReader로 입력을 받은 다음 출력시 ??!를 붙여주었다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str+"??!");
		
	}
}
