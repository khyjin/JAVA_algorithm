package string;

import java.util.Scanner;

public class Find_String {
	
	public static int solution(String word, String key) {
		int answer =0;
		for(int i=0;i<word.length();i++) {
		String str = word.substring(i, i+1);
		if(str.equalsIgnoreCase(key)) {
				answer++;
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String word = sc.next();
		 String key = sc.next();
		 
		 System.out.println(solution(word, key));
	}
}
