package one_dimensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class one_array_3052 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// (1) boolean 배열을 생성해서 42로 나눈수를 바로 true로 해서 넣어준다.
		// 향상된 for문을 사용해서 배열에서 true일 때 cnt ++
//		boolean[] arr = new boolean[42];
//		int cnt = 0;
//		
//		for(int i=0;i<10;i++) {
//			arr[Integer.parseInt(br.readLine())%42] = true;
//		}
//		for(boolean b:arr) {
//			if(b) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		// (2) Hashset을 사용한다.
		// Hashset는 중복되는 값이 없으면 Hashset에 저장되면서 True를 반환,
		// 중복되어 저장되지 않으면 false를 반환한다.
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			// 입력받은 값의 나머지 값을 add 메서드를 통해 HashSet에 저장
			h.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(h.size());
    }
}