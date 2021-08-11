package string;

import java.util.Scanner;

public class WordInSentence {

	public String solution(String str) {
		String[] word = str.split(" ");
		String answer =null;
		int max = Integer.MIN_VALUE;
		
		for(String x:word) {
			int len = x.length();
			if(len>max) {
				max=len;
				answer = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		WordInSentence main = new WordInSentence();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(main.solution(str));
	}

}
