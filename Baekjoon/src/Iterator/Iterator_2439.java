package Iterator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Iterator_2439 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

//		(1) StringBuilder로 출력
//		StringBuilder sb = new StringBuilder();
//		for(int i=1;i<=N;i++) {
//			for(int j=1;j<=N-i;j++) {
//				sb.append(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				sb.append("*");
//			}
//			sb.append("\n");
//		}
//		System.out.println(sb);
		
//		(2) BufferedWriter로 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N-i;j++) {
				bw.write(" ");
			}
			for(int k=1;k<=i;k++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
