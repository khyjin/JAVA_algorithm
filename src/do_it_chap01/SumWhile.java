package do_it_chap01;

import java.util.Scanner;

public class SumWhile {

	//p27. 1���� n���� ���� �� ���ϱ�(while)
	public static int sumWhile(int num) {
		int answer = 0;
		int i = 1;
		
		while(i<=num) {
			answer += i;
			i++;
		}
		return answer;
	}
	
	//p29. 1���� n���� ���� �� ���ϱ�(for)
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
		System.out.println("while�� �̿� = "+sumWhile(num));
		System.out.println("for���� �̿� = "+sumFor(num));
	}

}
