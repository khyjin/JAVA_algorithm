package string;

import java.util.Scanner;

public class CompressionString {

	public void solution(String str) {
		String answer = "";
		str = str+" ";
		int count = 1;
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;				
			} else {
				answer = answer+str.charAt(i);
				if(count>1) answer+=String.valueOf(count);
				count = 1;
			}
		}

		
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		CompressionString test = new CompressionString();
		Scanner sc = new Scanner(System.in);
		test.solution(sc.next());
	}

}
