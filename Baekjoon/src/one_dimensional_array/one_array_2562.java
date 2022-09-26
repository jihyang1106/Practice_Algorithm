package one_dimensional_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class one_array_2562 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numArr = new int[9]; // 자연수를 넣을 배열
		int max = 0; // 최댓값을 출력할 변수
		int index = 0; // 몇 번째 수인지 출력할 변수

		// (1)for문을 돌려서 출력
		for(int i=0;i<9;i++) {
			numArr[i] = Integer.parseInt(br.readLine());
			if(max<numArr[i]) max = numArr[i]; // 최댓값 출력
			if(max==numArr[i]) index = i+1; // 몇 번째 수인지 출력
		}
		System.out.println(max + "\n" + index);
		
//		int cnt = 0;
//		for(int i=0;i<9;i++) {
//			numArr[i]=Integer.parseInt(br.readLine());
//		}
//		(2) 향상된 for문을 돌려서 출력
//		for(int num:numArr) {
//			cnt++; cnt를 먼저 ++해서 몇 번째 수인지 알 수 있다. 
//			if(num>max) {
//				max = num;
//				index = cnt;
//			}
//		}
//		System.out.println(max + "\n" + index);
	}
}
