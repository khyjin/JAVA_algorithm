package TwoPointerSlidingWindow;

import java.util.Scanner;

public class SumOfNumbers {

	public void solution(int n) {
		int answer = 0;
		int[] arr = new int[n-1];
		for(int i=0;i<n-1;i++) {
			arr[i] = i+1;
		}
		
		for(int j=0;j<n-1;j++) {
			int sum = arr[j];
			for(int k=j+1;k<n-1;k++) {
				sum = sum+arr[k];
				if(sum==n) answer++;
			}
		}
		System.out.println(answer);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SumOfNumbers test = new SumOfNumbers();
		
		int n = sc.nextInt();
		test.solution(n);
	}

}
