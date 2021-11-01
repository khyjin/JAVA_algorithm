package do_it_chap02;

import java.util.Scanner;

public class CardConvRev {
	//p67 입력받은 10진수를 2진수 ~ 36진수로 기수 변환하여 나타냄
	//x = 10진수
	//r = 변환할 기수
	
	public static String cardConvR(int x, int r) {
		String answer = "";
		
		while(x>0) {
			answer += x%r;
			x/=r;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	//10진수 숫자
		int r = sc.nextInt();	//변환할 진수
		
		System.out.println("answer = "+cardConvR(x, r));
	}

}
