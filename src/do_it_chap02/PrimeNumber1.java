package do_it_chap02;

public class PrimeNumber1 {
	////1,000 이하의 소수를 열거
	
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
			if(i==j) {	//for문 벗어났을 때 두개의 수가 같다면 소수라는 의미
				System.out.println(i);
			}
		}
		
		System.out.println("나눗셈을 수행한 횟수 : "+ count);
	}

}
