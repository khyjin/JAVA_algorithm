package MapAndSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Classleader {

	public void solution(String[] arr) {
		Map<String, Integer> vote = new HashMap<String, Integer>();

		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Classleader test = new Classleader();
		int n = sc.nextInt();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.next();
		}
		
		test.solution(arr);
	}

}
