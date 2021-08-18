package string;

import java.util.Scanner;

public class TextDistance {

	public int[] solution(String s, char t) {
		int [] answer = new int[s.length()];
		int p=1000;
		
		//1. ���ʿ� �ִ� e�κ����� �Ÿ��� ���Ѵ�.(for�� �̿�)
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
		
		//2. �����ʿ� �ִ� e�κ����� �Ÿ��� ���Ѵ�.(for�� �̿�)
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==t) {
				p=0;
			} else {
				p++;				
				answer[i] = Math.min(answer[i], p);// ���� answer[i] ���� p�� ���� ���� �ִ´�
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
