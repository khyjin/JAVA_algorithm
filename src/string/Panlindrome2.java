package string;

import java.util.Scanner;

public class Panlindrome2 {
	public String solution(String str) {
		String answer = "NO";
		char[] word = str.toCharArray();
		String realWord="";
		for(char x:word) {
			if(Character.isAlphabetic(x)) {
				realWord = realWord+String.valueOf(x);
			}
		}
		
		realWord = realWord.toUpperCase();
		String[] compWord = realWord.split("");
		
		int i = 0;
		int len = realWord.length()-1;
		int count = 0;
		
		while(i<len) {
			if(compWord[i].equals(compWord[len])) {
				i++;
				len--;
			} else {
				count++;
				break;
			}
		}
		
		if(count==0) {answer="YES";}
		
		return answer;
	}
	public static void main(String[] args) {
		Panlindrome2 test = new Panlindrome2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(test.solution(str));

	}
}
