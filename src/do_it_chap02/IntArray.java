package do_it_chap02;

public class IntArray {
	
	//p44. ���� ����� �ڷ���� int���� �迭(������ڼ��� 5:new�� ���� ��ü�� ����
	public static void intArray() {
		int[] a = new int[5];
		a[1] = 37;
		a[3] = 51;
		a[4] = a[1]*2;
		
		for(int x:a) {
			System.out.println(x);
		}
	}	
	
	//p47. ���� �ڷ����� int���� �迭(������ڼ���5 : �迭 �ʱ��ڿ� ���� ����)
	public static void intArrayInit() {
		int[] a = {1,2,3,4,5};	//�迭 �ʱ��ڿ� ���� ����
		
		for(int x:a) {
			System.out.println(x);
		}
	}
	
	//p48. �迭����
	public static void cloneArray() {
		int [] a = {1,2,3,4,5};
		int [] b = a.clone();
		
		b[3] = 0;
		
		for(int x:a) {
			System.out.println(x);
		}
		System.out.println();
		for(int x:b) {
			System.out.println(x);
		}
	}
	
	

	
	public static void main(String[] args) {
		intArray();
		intArrayInit();
		cloneArray();

	}
}
