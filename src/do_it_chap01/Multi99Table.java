package do_it_chap01;

import java.util.Scanner;

public class Multi99Table {

	//p36. ����ǥ ����ϱ�
	public static void main(String[] args) {
		System.out.println("===����ǥ===");
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		
		
		//p38. ���� �̵ �ﰢ��
		System.out.println("----�̵ �ﰢ��----");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("����� �Է��ϼ���");
			n = sc.nextInt();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
