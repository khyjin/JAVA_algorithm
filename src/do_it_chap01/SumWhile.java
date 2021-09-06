package do_it_chap01;

import java.util.Scanner;

public class SumWhile {

	//p27. 1부터 n까지 정수 합 구하기(while)
	public static int sumWhile(int num) {
		int answer = 0;
		int i = 1;
		
		while(i<=num) {
			answer += i;
			i++;
		}
		return answer;
	}
	
	//p29. 1부터 n까지 정수 합 구하기(for)
	public static int sumFor(int num) {
		int answer = 0;
		for(int i=1;i<=num;i++) {
			answer += i;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("while문 이용 = "+sumWhile(num));
		System.out.println("for문을 이용 = "+sumFor(num));
	}

}
