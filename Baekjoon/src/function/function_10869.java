package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class function_10869 {

	public static void main(String[] args) throws IOException {
		
//	    버퍼는 입출력 속도를 향상시키기 위해 존재하는 임시 메모리 공간이다. 
//	    BufferedWriter는 버퍼가 있어서 반드시 flush, close를 호출해서 출력하고 닫아줘야 한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		(1)
//		String[] str = br.readLine().split(" ");
//		int a = Integer.parseInt(str[0]);
//		int b = Integer.parseInt(str[1]);
		
//		(2)
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " "); 
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	
	}

}
