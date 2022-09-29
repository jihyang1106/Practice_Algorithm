package function;

public class function_4673 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // 출력을 위한 sb
		for(int i=1;i<numArr.length;i++) {
			int n = f(i);
            // n이 10001보다 적을 때 생성자 있는 수 true
			if(n<numArr.length) numArr[n] = true; // 생성자 있는 수 true
			// 배열에서 false이면 생성자 없는 수로 간주하고 출력
			if(numArr[i]==false) sb.append(i).append("\n"); 
		}
		System.out.println(sb);
	}

	static boolean[] numArr = new boolean[10001]; // 생성자가 있는 수: true, 없는 수: false
	public static  int f(int n) { // 셀프 넘버를 구하는 수
		int notSelfNum = n; 
		while(n!=0) {
			notSelfNum += n%10; // 첫째자리 더하기
			n /= 10; // NotSelfNum에 다음 자릿수를 더해주기위해서 첫째자리 자르기
		}
		return notSelfNum;
	}
}

