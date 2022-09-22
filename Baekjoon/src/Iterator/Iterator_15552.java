package Iterator;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Iterator_15552 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
//		(1)StringBuilder를 이용해서 출력
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+
					Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		System.out.println(sb);
		
//		(2)BufferedWriter를 이용해서 출력((1)번보다 시간이 좀 더 걸림)
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		for(int i=0;i<T;i++) {
//			st = new StringTokenizer(br.readLine(), " ");
//			bw.write(Integer.parseInt(st.nextToken())+
//					Integer.parseInt(st.nextToken())+"\n");
//		}
//		bw.flush();
//		bw.close();
	}
}
