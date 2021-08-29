package TwoPointerSlidingWindow;

import java.util.Scanner;

public class MaxSales {
	
	public void solution(int days, int[] sales) {
		int answer = 0;
		
		for(int i=0;i<sales.length-days;i++) {
			int temp = sales[i]+sales[i+1]+sales[i+2];
			if(temp>answer) answer = temp;
		}
		
		System.out.println(answer);
		
	}
	
	public static void main(String[] args) {
		MaxSales test = new MaxSales();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int days = sc.nextInt();
		int[] sales = new int[n];
		
		for(int i=0;i<n;i++) {
			sales[i] = sc.nextInt();
		}
		test.solution(days, sales);
	}
}
