package one_dimensional_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class one_array_10818 {
 
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
//		Integer.parseInt(br.readLine()); // 정수의 개수 사용 xx
		int max = -10000000;
		int min = 1000001;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
//		 for문을 통해서 구하기
		for(int i=0;i<n;i++) {
			int value = Integer.parseInt(st.nextToken());
			if(value>max) max = value;
			if(value<min) min = value;
		}
		
//		while문을 통해서 구하기
//		while(st.hasMoreTokens()) {
//			int value = Integer.parseInt(st.nextToken());
//			if(value>max) max = value;
//			if(value<min) min = value;
//		}
		System.out.println(min + " " + max);
	}
}
