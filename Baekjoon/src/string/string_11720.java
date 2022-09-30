package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class string_11720 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
//		(1) getBytes()
		
		byte[] arr = br.readLine().getBytes();
//		String s = br.readLine();
		int sum = 0;
		
		for(byte b:arr) {
			sum += b-'0';
		}
		
//		(2) charAt
		System.out.println(sum);
//		for(int i=0;i<N;i++) {
//			sum += s.charAt(i)-'0';
//		}
		
		
	}

}
