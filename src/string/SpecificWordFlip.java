package string;

import java.util.Scanner;

public class SpecificWordFlip {
	
	public String solution(String str) {
		char[] word = str.toCharArray();
		char[] word2 = str.toCharArray();
		
		int len = word.length-1;
		int i = 0;
		
		while(i<=len) {
			if(!Character.isAlphabetic(word[i])) {
				i++;
			} else if(!Character.isAlphabetic(word2[len])) {
				len--;
			} else {
				word2[len] = word[i];
				word2[i] = word[len];
				i++;
				len--;
			}
		}
				
		String answer = String.valueOf(word2);
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		SpecificWordFlip test = new SpecificWordFlip();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(test.solution(str));

	}

}
