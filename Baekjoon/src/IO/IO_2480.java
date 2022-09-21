package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IO_2480 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		
		int[] dice = new int[3]; // 주사위 눈을 담을 배열
		// 배열안에 주사위 눈 담기
		for(int i=0; i<dice.length; i++) {
			dice[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = dice[0]; // 모두 다른 눈일 때 구하기 위한 최댓값
		
		if(dice[0] == dice[1] && dice[1] == dice[2]) { // 같은 눈 3개일 때
			System.out.println(10000+dice[0]*1000);
		// 같은 눈 2개일 때
		}else if(dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
			if(dice[0] == dice[1]) {
				System.out.println(1000+dice[0]*100);
			}else if(dice[1] == dice[2]) {
				System.out.println(1000+dice[1]*100);
			}else if(dice[0] == dice[2]) {
				System.out.println(1000+dice[2]*100);
			}
		// 모두 다른 눈일 때
		}else if(dice[0]!=dice[1] && dice[1]!=dice[2] && dice[0]!=dice[2]) {
			for(int i=1; i<dice.length; i++) { // 최댓값 구하기
				if(max < dice[i]) max = dice[i];
			}
			System.out.println(max*100);
		}
	}
}
