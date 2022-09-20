package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		if(M<45) { // 분(min)이 45분 보다 작을 때
			H--; // 시(hour) -1 감소
			M = 60-(45-M);  // 분(min) -1 감소
			if(H<0) {
				H = 23;
			}
			System.out.println(H+" "+M);
		}else { // 분(min)이 45분보다 클 때
			System.out.println(H+" "+(M-45));
		}
	}
} 
