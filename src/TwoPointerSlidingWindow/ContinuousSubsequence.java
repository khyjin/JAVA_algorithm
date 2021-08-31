package TwoPointerSlidingWindow;

import java.util.Scanner;

public class ContinuousSubsequence {

	public void solution(int[] list, int n, int m) {
//		int answer = 0;
//		
//		for(int i=0;i<list.length;i++) {
//			int sum = list[i];
//
//			for(int j=i+1;j<list.length;j++) {
//				sum =sum+list[j];
//				if(sum==m) {answer++;}
//			}
//		}
//		
//		System.out.println(answer);
		
	//lt~rt 사이의 합이 주어진 m과 같은가
		int answer = 0, sum=0, lt=0;
		for(int rt=0;rt<n;rt++) {
			sum +=list[rt];
			if(sum==m) answer++;
			while(sum>=m) {
				sum-=list[lt++];
				if(sum==m) answer++;
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContinuousSubsequence test = new ContinuousSubsequence();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] list = new int[n];
		
		for(int i=0;i<n;i++) {
			list[i] = sc.nextInt();
		}
		
		test.solution(list,n,m);
	}

}
