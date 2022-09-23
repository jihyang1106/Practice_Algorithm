package Iterator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Iterator_10871 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); // N개 수열
		int X = Integer.parseInt(st.nextToken()); // 정수 X
		
		st = new StringTokenizer(br.readLine()," ");
		
//		(1) StringBuilder를 이용해서 출력
//		StringBuilder sb = new StringBuilder();
//		for(int i=0;i<N;i++) { //수열보다 X가 작으면 Stringbuilder안에 넣기
//			int arrNum = Integer.parseInt(st.nextToken());
//			if(arrNum<X) {
//				sb.append(arrNum+" ");
//			}
//		}
//		System.out.println(sb);
		
//		(2) BufferedWriter를 이용해서 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<N;i++) {
			int arrNum = Integer.parseInt(st.nextToken());
			if(arrNum<X) {
				bw.write(arrNum+" ");
			}
		}
		bw.flush();
		bw.close();
	}
}
