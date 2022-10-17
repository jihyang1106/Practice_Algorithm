package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
import java.io.IOException;
public class Sort_2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
//		Arrays.sort(arr); 
		// 기본형만, Best:O(NlogN) / Avg: O(NlongN) / Worst: O(n2)
		Collections.sort(list); 
		// 참조형만, Best:O(N) / Avg:O(logN) / Worst: O(NlogN)
		// 역순 Collecctions.reversOrder

		StringBuilder sb = new StringBuilder();
		for(int value:list) {
			sb.append(value).append("\n");
		}
		System.out.println(sb);
	}
}
