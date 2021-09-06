package do_it_chap01;

import java.util.Scanner;

public class JudgeSign {

	//p22. 입력한 정숫값의 부호(양수/음수/0)를 판단하여 출력하는 프로그램
	public static void judgesing(int num) {
		if(num>0) {
			System.out.println("양수 입니다.");
		} else if(num<0) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0입니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		judgesing(num);

	}

}
