package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeNumOutput {
	
	public void solution(int num, String num2) {
		
		String[] number = num2.split(" ");
		List<String> answer = new ArrayList<String>();
		answer.add(number[0]);
		for(int i=1;i<=number.length-1;i++) {
			if(Integer.parseInt(number[i-1])<Integer.parseInt(number[i])) {
				answer.add(number[i]);
			}
		}
		
		for(String x:answer) {
			System.out.print(x+" ");
		}
		
	}

	public static void main(String[] args) {
		LargeNumOutput test = new LargeNumOutput();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String num2 = "";
		
		for(int i=0;i<num;i++) {
			num2 += sc.next()+" ";
		}
		test.solution(num, num2);

	}

}
