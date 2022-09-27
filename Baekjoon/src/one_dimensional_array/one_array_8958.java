package one_dimensional_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class one_array_8958 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] arr = new String[Integer.parseInt(br.readLine())];
////		(1) 배열을 이용해서 출력
//		for(int i=0;i<arr.length;i++) { // O와 X로 이루어진 문자열을 arr 배열에 넣기
//			arr[i] = br.readLine();
//		}
//	
//		for(int i=0;i<arr.length;i++) {
//			int count = 0; // O 연속 횟수
//			int total = 0; // 누적 합계 횟수
//			
//			for(int j=0;j<arr[i].length();j++) {
//				if(arr[i].charAt(j)=='O') { // O과 같을 때 count ++ 
//					count++;
//				}
//				else {
//					count = 0;  // X일 때는 0으로 초기화
//				}
//				total += count;
//			}
//			System.out.println(total);
//		}	
		
//		(2) getBytes()를 사용
//		getBytes()는 입력받은 문자열을 byte 형 배열로 변환한다.
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int count = 0; 
			int total = 0;
			for(byte b:br.readLine().getBytes()) {
				if(b == 'O') {
					count ++;
				}else {
					count = 0;
				}
				total += count;
			}
			sb.append(total).append("\n");
		}
		System.out.println(sb);
	}
}
