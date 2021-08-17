package string;

import java.util.Scanner;

public class Code {
	public String solution(int num, String str) {
		String answer = "";

		for(int i=0;i<str.length();i++) {
			String bi = str.substring(i,i+7);
			String temp = "";
			i+=6;
			for(int j=0;j<bi.length();j++) {
				if(bi.charAt(j)=='*') {
					temp += 0;
				} else temp +=1;
			}
			 char temp2= (char) Integer.parseInt(temp,2);
			 answer = answer+String.valueOf(temp2);
			 
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Code test = new Code();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		System.out.println(test.solution(num,str));
	}

}
