package string;

import java.util.Scanner;

public class UpperLower {

	public String solution (String str) {
	
		char[] str2 = str.toCharArray();
	String transeStr="";
	
	for(int i=0; i<str.length();i++) {
		 
		if(str2[i]<96) {
			String word = String.valueOf(str2[i]);
			transeStr = transeStr + word.toLowerCase();
		} else {
			String word = String.valueOf(str2[i]);
			transeStr = transeStr + word.toUpperCase();
		}
	}
		
		
		return transeStr;
	}
	
	public static void main(String[] args) {
		UpperLower main = new UpperLower();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(main.solution(str));

	}

}
