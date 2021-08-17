package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountStuden {
	
	public void solution(int n, int[] height) {
		int count = 1;
		int max = height[0];
		for(int i=0;i<n;i++) {
			if(height[i]>max) {
				max = height[i];
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		CountStuden test = new CountStuden();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] height = new int[n];
		
		for(int i=0;i<n;i++) {
			int student = sc.nextInt();
			height[i] = student;
		}
		
		test.solution(n, height);

	}

}
