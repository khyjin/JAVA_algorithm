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
	
	//p64 배열 b의 모든 요소를 배열 a에 복사하는 메서드
	static void copy(int[] a, int[] b) {
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		
		for(int x : b) {
			System.out.println(x);
		}
	}
	
	//p64 역순으로 복사
	static void rcopy(int[]a, int[] b) {
		int len = a.length-1;
		for(int i = len; i>=0; i--) {
			b[len-i] = a[i];
		}
		
		for(int x : b) {
			System.out.println(x);
		}
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
		
		int[] a = {1,2,3,6,8,10};
		int[] b = new int[a.length];
		
		copy(a,b);
		
		System.out.println("======================");
		
		rcopy(a,b);
		
	}

}
