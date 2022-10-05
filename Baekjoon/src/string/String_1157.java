package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class String_1157 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] chArr = br.readLine().toUpperCase().toCharArray(); // 대문자로 만들고, 문자배열로
		int[] arr = new int[26]; // 각 문자들의 빈도수를 나타내기 위한 배열
		int max = -1; // 가장 많이 사용된 알파벳
		char c = ' '; // 출력 문자
		
		for(int i=0;i<chArr.length;i++) {
			arr[chArr[i]-'A'] ++; // chArr의 값이 중복될 때 arr 인덱스의 값 ++
			if(arr[chArr[i]-'A']> max) { // 가장 많이 사용된 알파벳이 max보다 크다? == 많이 사용된 것
				max = arr[chArr[i]-'A']; 
				c = chArr[i];  
			}else if(arr[chArr[i]-'A']==max) { // 가장 많이 사용된 알파벳이 이미 있으면 ? 출력
				c = '?';
			}
		}
		System.out.println(c);
	}
}
