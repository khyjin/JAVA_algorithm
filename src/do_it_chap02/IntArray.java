package do_it_chap02;

public class IntArray {
	
	//p44. 구성 요소의 자료셩이 int형인 배열(구성요솟수는 5:new에 의해 본체를 생성
	public static void intArray() {
		int[] a = new int[5];
		a[1] = 37;
		a[3] = 51;
		a[4] = a[1]*2;
		
		for(int x:a) {
			System.out.println(x);
		}
	}	
	
	//p47. 구성 자료형이 int형인 배열(구성요솟수는5 : 배열 초기자에 의해 생성)
	public static void intArrayInit() {
		int[] a = {1,2,3,4,5};	//배열 초기자에 의해 생성
		
		for(int x:a) {
			System.out.println(x);
		}
	}
	
	//p48. 배열복제
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
