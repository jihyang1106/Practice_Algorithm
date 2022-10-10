package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_10809 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); 
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[26]; // 출력할 배열

		for(int i=0;i<arr.length;i++) { // 배열을 -1로 초기화
			arr[i] = -1;
		}
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i)-'a']==-1) { // 각 s의 ch를 arr의 인덱스의 값으로
				arr[s.charAt(i)-'a'] = i; // -1이면 중복된 알파벳이 아니므로 i 넣기
			}
		}
		for(int ans:arr) {
			sb.append(ans).append(" ");
		}
		
		System.out.println(sb);
		
//		(2) indexOf 함수 사용 
		for(char ch='a'; ch<='z'; ch++) {
			sb.append(s.indexOf(ch)).append(" ");
		}
		System.out.println(sb);
	}
}
