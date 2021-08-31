package TwoPointerSlidingWindow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CombineArrays {
	
	public void solution(List arr1, List arr2) {
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(arr1);
		list.addAll(arr2);

		list.sort(Comparator.naturalOrder());
		
		for(int x:list) {
			System.out.println(x);
		}
		
	}
	
	public static void main(String[] args) {
		CombineArrays test = new CombineArrays();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		List<Integer> arr1 = new ArrayList<Integer>();
		
		for(int i=0;i<n1;i++) {
			int n = sc.nextInt();
			arr1.add(n);
		}
		
		int n2 = sc.nextInt();
		List<Integer> arr2 = new ArrayList<Integer>();
		for(int j=0;j<n2;j++) {
			int n = sc.nextInt();
			arr2.add(n);
		}
		
		test.solution(arr1, arr2);
	}

}
