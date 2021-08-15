package string;

import java.util.Scanner;

public class NumberOnly {

	public int solution(String str) {
		String temp = "";
		
		for(int i=0; i<str.length();i++) {
						
			if(!Character.isAlphabetic(str.charAt(i))) {
				temp = temp+str.charAt(i);
			}
		}
		
		int answer = Integer.parseInt(temp);
		return answer;
	}
	
	public static void main(String[] args) {
		NumberOnly test = new NumberOnly();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(test.solution(str));

	}

}
