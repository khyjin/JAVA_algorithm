package do_it_chap02;

import java.util.Scanner;

public class ReverseArray {
	
	//p60. �迭 ��ҿ� ���� �о� �鿩 �������� ����
	public static void reverseArray(int arr[]) {
		int reverse[] = new int[arr.length];
		int len = arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			reverse[i] = arr[len];
			len--;
		}
		
		for(int x: reverse) {
			System.out.println(x);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		
		reverseArray(arr);
	}

}
