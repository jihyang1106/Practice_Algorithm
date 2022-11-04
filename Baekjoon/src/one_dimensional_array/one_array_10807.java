package one_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class one_array_10807 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
//		1. br.readLine()번 만큼 for문을 돌아서 배열에 넣는다. 
//		2. 배열에서 마지막 br.readLine()한 것과 동일하면 출력
		int[] arr = new int[Integer.parseInt(br.readLine())];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int v = Integer.parseInt(br.readLine()); 
		int result = 0;
		for(int i=0;i<arr.length;i++) {
			if(v==arr[i]) {
				result++;
			}
		}
		System.out.println(result);


	}
}
