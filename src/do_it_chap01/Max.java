package do_it_chap01;

import java.util.Scanner;

public class Max {
	
	//p13 �ǽ�1-1 3���� ������ �� �ִ��� ���ϴ� ���α׷�
	public static int max3(int a, int b, int c) {
		int answer = a;
		
		if(answer<b) answer = b;
		if(answer<c) answer = c;
				
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(max3(a, b, c));

	}

}
