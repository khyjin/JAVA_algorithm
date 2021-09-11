package do_it_chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	//p51. ��� ����� Ű�� �Է¹޾� ���� ū Ű�� ���ϱ�
	public static void maxOf(int height[]) {
		int max = height[0];
		
		for(int i=1;i<height.length;i++) {
			if(max<height[i]) max = height[i];
		}
		
		System.out.println("���� ū Ű�� "+max+"cm �Դϴ�.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int height[] = new int[num];
		for(int i=0;i<num;i++) {
			height[i] = sc.nextInt();
		}
		
		maxOf(height);
	}

}
