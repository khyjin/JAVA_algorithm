package array;

import java.util.Scanner;

public class ScoreSum {
	
	public int solution(int num[]) {
		int score = 0;
		int count = 0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]==1) {
				count++;
				score =score+count;
			} else {
				count=0;
			}
		}
		
		return score;
	}
	
	
//	public int solution(int num[]) {
//		int score = 0;
//		
//		if(num[0]==1) score++;
//		
//		for(int i=1;i<num.length;i++) {
//			if(num[i]==1) {
//				score++;
//				for(int j=i-1;j>=0;j--) {
//					if(num[j]==1) {score++;}
//					else if(num[j]==0) {j=-1;}
//				}
//			}
//		}		
//		return score;
//	}

	public static void main(String[] args) {
		ScoreSum test = new ScoreSum();
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] answerOX = new int[count];
		for(int i=0;i<count;i++) {
			answerOX[i] = sc.nextInt();
		}
		
		System.out.println(test.solution(answerOX));
	}

}
