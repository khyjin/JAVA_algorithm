package do_it_chap02;

import java.util.Scanner;

public class ArrayEqual {
	//p62. 모든 요소의 값이 같은가	
	static boolean equals(int[] arr1, int[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len1 = sc.nextInt();
		int[] arr1 = new int[len1];
		for(int i=0;i<len1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		int len2 = sc.nextInt();
		int[] arr2 = new int[len2];
		for(int i=0;i<len2;i++) {
			arr2[i] = sc.nextInt();
		}
		
		boolean result = equals(arr1, arr2);
		
		System.out.println("arr1과 arr2는 "+result);
		
	}

}
