package array;

import java.util.Scanner;

public class RockPaperScissors {

	public void solution(int[] A, int[] B) {
		for(int i=0;i<A.length;i++) {
			switch(A[i]) {
			case 1:
			}
		}
	}
	
	
	public static void main(String[] args) {
		RockPaperScissors test = new RockPaperScissors();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] A = new int[num];
		int[] B = new int[num];
		
		for(int i=0;i<num;i++) {
			A[i] = sc.nextInt();
		}
		
		for(int i=0;i<num;i++) {
			B[i] = sc.nextInt();
		}
		
		test.solution(A, B);

	}

}
