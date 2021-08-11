package string;

import java.util.Scanner;

public class ReverseWord {
	public void solution(String str) {
		String[] word = str.split("");
		String answer = "";
		for(int i=word.length-1; i>=0; i--) {
			answer = answer+word[i];
		}
		System.out.println(answer);
	}
	
	
	public static void main(String[] args) {
		ReverseWord main = new ReverseWord();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String str = sc.next();
			main.solution(str);
		}
	}

}
