package string;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDupl {

	public String solution(String str) {
		String answer="";
		String[] word = str.split("");
		
		int i =0;
		int len = str.length()-1;
				
		while(i<=len) {

			if(!word[i].equals(word[len])) {
				len--;
			} else {
				
			}
		}
		
		for(String x:word) {
			answer = answer+x;
		}			
		return answer;
	}
	
	public static void main(String[] args) {
		RemoveDupl test = new RemoveDupl();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(test.solution(str));

	}

}
