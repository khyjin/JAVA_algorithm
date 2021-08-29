package TwoPointerSlidingWindow;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindCommonElements {
	
	public void solution(List list1, List list2) {
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<list1.size();i++) {
			for(int j=0;j<list2.size();j++) {
				if(list1.get(i)==list2.get(j)) {
					list.add((Integer) list1.get(i));
				}
			}
		}
		
		list.sort(Comparator.naturalOrder());
		for(int x:list) { 
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args) {
		FindCommonElements test = new FindCommonElements();
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		int n1 = sc.nextInt();
		for(int i=0;i<n1;i++) {
			int n = sc.nextInt();
			list1.add(n);
		}
		
		int n2 = sc.nextInt();
		for(int i=0;i<n2;i++) {
			int n=sc.nextInt();
			list2.add(n);
		}
		
		test.solution(list1, list2);
	}

}
