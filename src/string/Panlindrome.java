package string;

import java.util.Scanner;

public class Panlindrome {

	public String solution(String str) {
		String answer = "";
		String[] word = str.split("");
		int len = str.length()-1;
		int count =0;
		
		for(int i=0;i<=len;i++) {
			if(word[i].equals(word[len])) {
				len--;
			} else {
				count++;
			}
		}
		
		if(count==0) answer="YES";
		else answer="NO";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Panlindrome test = new Panlindrome();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(test.solution(str));

	}

}
