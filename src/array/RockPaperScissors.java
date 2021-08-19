package array;

import java.util.Scanner;

public class RockPaperScissors {

	public void solution(int[] A, int[] B) {
		char[] answer = new char[A.length];
		
		for(int i=0;i<A.length;i++) {
			if(A[i]==B[i]) {
				answer[i] = 'D';
			} else if(A[i]==1&&B[i]==2) {
				answer[i] = 'B';
			} else if(A[i]==1&&B[i]==3) {
				answer[i] = 'A';
			} else if(A[i]==2&&B[i]==1) {
				answer[i] = 'A';
			} else if(A[i]==2&&B[i]==3) {
				answer[i] = 'B';
			} else if(A[i]==3&&B[i]==1) {
				answer[i] = 'B';
			} else if(A[i]==3&&B[i]==2) {
				answer[i] = 'A';
			} 
		}
		
		for(char x:answer) {
			System.out.println(x);
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
