package string;

import java.util.Scanner;

public class RemoveDupl {

	public String solution(String str) {
		String answer="";
		
		for(int i=0;i<str.length();i++) {
			if(i==str.indexOf(str.charAt(i))) {
				answer = answer+str.charAt(i);
			}
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
