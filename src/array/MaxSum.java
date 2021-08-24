package array;

import java.util.Scanner;

public class MaxSum {

	public void solution(int[][] arr) {
		int answer=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				arr[i][arr.length-1] = arr[i][arr.length-1] + arr[i][j];
				arr[arr.length-1][i] = arr[arr.length-1][i] + arr[j][i];
			}
			arr[arr.length-1][arr.length-1] = arr[arr.length-1][arr.length-1]+ arr[i][i];
			
			if(arr[i][arr.length-1]>answer) {answer=arr[i][arr.length-1];}
			else if(arr[arr.length-1][i]>answer) {answer=arr[arr.length-1][i];}
			else if(arr[arr.length-1][arr.length-1]>answer) {answer=arr[arr.length-1][arr.length-1];}
		}
		
		System.out.println(answer);
	}
	
	
	public static void main(String[] args) {
		MaxSum test = new MaxSum();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n+1][n+1];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
			}
		}
		
		test.solution(arr);
	}
}
