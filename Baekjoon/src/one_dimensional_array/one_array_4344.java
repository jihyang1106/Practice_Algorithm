package one_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class one_array_4344 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int arr[]; // 성적의 합을 넣을 배열
		StringTokenizer st;
		
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine()," "); // 학생 수 및 성적
			arr = new int[Integer.parseInt(st.nextToken())]; // 학생 수 == 배열 수
			double sum = 0; // 성적 합계
			for(int j=0;j<arr.length;j++) {
				arr[j] = Integer.parseInt(st.nextToken()); // 성적 입력
				sum += arr[j];
			}
			double avg = sum/arr.length; // 평균
			double student = 0; // 평균 넘는 학생을 구하는 변수
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>avg) { // 평균이 넘는 학생인 경우 count++
					student++;
				}
			}
			// %% => %를 출력하기 위해서
			System.out.printf("%.3f%%\n",(student/arr.length)*100);
		}
	}
}
 