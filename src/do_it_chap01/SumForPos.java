package do_it_chap01;

import java.util.Scanner;

public class SumForPos {
	//p31. 양수만 입력하여 더하기

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("n의 값 :");
			n = sc.nextInt();
		} while(n<=0);
		
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum +=i;
		}
						
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		
		
	}

}
