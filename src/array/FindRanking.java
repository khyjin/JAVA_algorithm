package array;

import java.util.Scanner;

public class FindRanking {
	
	public void solution(int[] kor) {
		int[] rank = new int[kor.length];
		for(int i=0;i<kor.length;i++) {
			int count=0;
			for(int j=0;j<kor.length;j++) {
				if(kor[i]<=kor[j]) count++;
			}
			rank[i] = count;
		}
		
		for(int x:rank) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		FindRanking test = new FindRanking();
		Scanner sc = new Scanner(System.in);
		
		int student = sc.nextInt();
		int[] kor = new int[student];
		for(int i=0;i<student;i++) {
			kor[i] = sc.nextInt();
		}
		
		test.solution(kor);
	}

}
