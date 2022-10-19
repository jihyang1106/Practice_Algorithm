package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sort_10989 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
//		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
//		list.sort(Comparator.naturalOrder()); 메모리 초과
//		Collections.sort(list); 메모리 초과
	
		StringBuilder sb = new StringBuilder();
		for(int val:arr) {
			sb.append(val).append("\n");
		}
		System.out.println(sb);
	}
}
