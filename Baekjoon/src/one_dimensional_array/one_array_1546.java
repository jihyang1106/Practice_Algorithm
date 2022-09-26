package one_dimensional_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class one_array_1546 {

//	    최댓값 => M , 모든 점수를 점수/M*100으로 수정.
//	    ex) 최고점 70, 수학점수 50 => 50/70*100 => 71.43점 
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		double[] arr = new double[N];
		double value = 0; // 새로운 평균
//		int max = 0; // 자기 첨수 중 최댓값
//		
//		for(int i=0;i<N;i++) {
//			arr[i] = Double.parseDouble(st.nextToken()); 
//			if(arr[i]>max) {  // 최고점
//				max = (int) arr[i];
//			}
//		}
//		for(int k=0;k<N;k++) { // 새로운 평균 구하기
//			value += ((arr[k]/max))*100;
//		}
//		System.out.println(value/N);
		
		// (2) Arrays.sort를 사용해 오름차순으로 구하기
		for(int i=0;i<N;i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int k=0;k<N;k++) {
			value += (arr[k]/arr[N-1])*100;
		}
		System.out.println(value/N);
	}	
}

