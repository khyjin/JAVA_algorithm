package do_it_chap02;

public class PrimeNumber1 {
	////1,000 ������ �Ҽ��� ����
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i=2; i<=1000; i++) {
			int j;
			for(j=2;j<i;j++) {
				count++;
				if(i%j==0) {
					break;
				} 
			}
			if(i==j) {	//for�� ����� �� �ΰ��� ���� ���ٸ� �Ҽ���� �ǹ�
				System.out.println(i);
			}
		}
		
		System.out.println("�������� ������ Ƚ�� : "+ count);
	}

}
