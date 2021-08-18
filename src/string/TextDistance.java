package string;

import java.util.Scanner;

public class TextDistance {

	public int[] solution(String s, char t) {
		int [] answer = new int[s.length()];
		int p=1000;
		
		//1. 왼쪽에 있는 e로부터의 거리를 구한다.(for문 이용)
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i]=p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		p=1000;
		
		//2. 오른쪽에 있는 e로부터의 거리를 구한다.(for문 이용)
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==t) {
				p=0;
			} else {
				p++;				
				answer[i] = Math.min(answer[i], p);// 기존 answer[i] 값과 p중 작은 수를 넣는다
			}			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		TextDistance test = new TextDistance();
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		char t = sc.next().charAt(0);
		
		int[] answer = test.solution(str, t);
		
		for(int x:answer) {
			System.out.println(x);
		}
	}

}
