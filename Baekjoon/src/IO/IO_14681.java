package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_14681 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(0 < x) // x가 양수일 때
			if( 0 < y ) System.out.println(1); // y도 양수
			else System.out.println(4); // y는 음수
		
		else // x가 음수일 때
			if (y > 0) System.out.println(2); // y는 양수
			else System.out.println(3); // y도 음수
	}
}
