package array;

import java.util.Scanner;

public class MountainTop {

	public int solution(int arr[][]) {
		int answer = 0;
		int len = arr.length-1;
		for(int i=1;i<len;i++) {
			for(int j=1;j<len;j++) {
				if(arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i][j+1]&&arr[i][j]>arr[i-1][j]&&arr[i][j]>arr[i+1][j]) 
					answer++; 
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		MountainTop test = new MountainTop();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n+2][n+2];
		for(int i=1;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-1;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(test.solution(arr));
	}
}
