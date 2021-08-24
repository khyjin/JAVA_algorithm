package array;

import java.util.Scanner;

public class PrimeNumber {
	public void solution(int num) {
		int answer = 0;
		int[] check = new int[num+1];
		
		for(int i=2;i<=num;i++) {
			if(check[i]==0) {
				answer++;
				for(int j=i;j<=num;j=j+i) {
					check[j] = 1;
				}
			}		
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		PrimeNumber test = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		test.solution(num);
	}
}
