package Iterator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Iterator_2739  {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
}
