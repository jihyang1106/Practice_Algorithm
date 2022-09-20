package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_2753 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		// year가 4의 배수이고 100의 배수가 아니거나 400의 배수일 때
		if(year%4==0 && year%100!=0 || year%400==0)System.out.println(1);
		else System.out.println(0);
	}
}
