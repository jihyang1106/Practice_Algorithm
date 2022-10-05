package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class String_2675 {

	public static void main(String[] args) throws IOException {
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();  
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			int R = Integer.parseInt(st.nextToken());
			char[] S = st.nextToken().toCharArray();
			
//			String S = st.nextToken();
//			(1)for문으로 string s의 j번째를 R번 반복해서 출력
//			for(int j=0;j<S.length();j++) {
//				for(int k=0;k<R;k++) {
//					sb.append(S.charAt(j));
//				}
//			}
//			sb.append("\n");
//			(2) getBytes()로 숫자로 변환한뒤에 다시 char로 변환
//			for(byte ans:S.getBytes()) {
//				for(int j=0;j<R;j++) {
//					sb.append((char)ans);
//				}
//			}
//			sb.append("\n");
			
			
//			(3)toCharArray()로 해서 사용 
			for(int j=0;j<S.length;j++) {
				for(int k=0;k<R;k++) {
					sb.append(S[j]); 
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}



