package do_it_chap01;

import java.util.Scanner;

public class JudgeSign {

	//p22. �Է��� �������� ��ȣ(���/����/0)�� �Ǵ��Ͽ� ����ϴ� ���α׷�
	public static void judgesing(int num) {
		if(num>0) {
			System.out.println("��� �Դϴ�.");
		} else if(num<0) {
			System.out.println("���� �Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		judgesing(num);

	}

}
