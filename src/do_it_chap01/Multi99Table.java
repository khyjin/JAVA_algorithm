package do_it_chap01;

import java.util.Scanner;

public class Multi99Table {

	//p36. 곱셈표 출력하기
	public static void main(String[] args) {
		System.out.println("===곱셈표===");
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}
		
		
		//p38. 직각 이등변 삼각형
		System.out.println("----이등변 삼각형----");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("양수를 입력하세요");
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
