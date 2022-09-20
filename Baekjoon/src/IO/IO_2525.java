package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_2525 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int CookTime = Integer.parseInt(br.readLine());
		
		int totalMin = 60 * H + M; // H와 M을 분으로 변환(60*시+분)
		totalMin += CookTime; // 요리하는데 걸린 시간 더하기
		
		int hour = totalMin/60;  // 토탈 더한 분을 구하고자 하는 시간으로 변환(분/60);
		int min = totalMin%60;   // 토탈 더한 분을 구하고자하는 분으로 변환(분%60);
		
		if(hour>=24) hour -= 24; // 24시 이상 될 때 0부터 다시 시작
		
		System.out.println(hour+" "+min);
	}
}
