package do_it_chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	//p51. 사람 수대로 키를 입력받아 가장 큰 키를 구하기
	public static void maxOf(int height[]) {
		int max = height[0];
		
		for(int i=1;i<height.length;i++) {
			if(max<height[i]) max = height[i];
		}
		
		System.out.println("가장 큰 키는 "+max+"cm 입니다.");
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
