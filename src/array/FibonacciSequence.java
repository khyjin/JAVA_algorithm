package array;

import java.util.Scanner;

public class FibonacciSequence {
	
	public void solution(int num) {
		int[] answer = new int[num];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2;i<num;i++) {
			answer[i] = answer[i-1]+answer[i-2];
		}
		
		for(int x:answer) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FibonacciSequence test = new FibonacciSequence();
		int num = sc.nextInt();
		test.solution(num);
		
	}

}
