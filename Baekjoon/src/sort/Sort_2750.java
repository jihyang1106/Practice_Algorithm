package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class Sort_2750 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
//		Arrays.sort(arr);      // sort() 136
//		selection_sort(arr);   // 선택정렬  144
//		insertion_sort(arr);   // 삽입정렬  148
		quick_sort(arr,0,arr.length-1);       // 퀵정렬 148 
		
		for(int val:arr) {
			System.out.println(val);
		}
	}

	// 선택정렬(첫번째 인덱스부터 시작해 뒤의 인덱스들의 값과 비교)On2
	public static void selection_sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swap(arr,j,i);
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
		}
	}

	// 삽입정렬(선택한 요소를 앞쪽의 알맞은 위치에 삽입하는 작업 반복 정렬)On2(최선일때O(N))
	public static void insertion_sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j;
			for(j=i; j>0 && arr[j-1] > temp; j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = temp;
		}
	}
	
	// 퀵정렬(피벗(기준)을 삼아서 작은 값들을 왼쪽에 큰 값을 오른쪽에 두며 재귀 수행하며 정렬
	public static void quick_sort(int[] a, int start, int end) {
		if(start>=end) return; // left가 right보다 크거나 같으면 정렬할 원소가 1개 이하, 정렬 x
		
		int pl = start;
		int pr = end;
		int pivot = a[(start+end)/2];
		
		while(pl<=pr) {
			while(a[pl]<pivot) {
				pl++;  // 피벗보다 큰 데이터를 찾을 때까지 반복
			}
			while(a[pr]>pivot) {
				pr--;  // 피벗보다 작은 데이터를 찾을 때까지 반복
			}
			if(pl<=pr) { // 작은값이 오른쪽보다 더 커지지 않을 때만
				swap(a,pl,pr); // 서로의 값 교환
				pl++;
				pr--;
			}
		}
		if(start<pr)quick_sort(a,start,pr); 
		if(end>pl) quick_sort(a,pl,end);
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
