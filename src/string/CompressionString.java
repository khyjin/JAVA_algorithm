package string;

public class CompressionString {

	public void solution(String str) {
		String answer = "";
		String[] word = str.split("");
		
		for(int i=0;i<str.length();i++) {
			int count = 0;

			for(int j=0;j<str.length();j++) {
				if(word[i].equals(word[j])) {
					count++;
				}
			}
			
			if(count>1) {
				answer = answer+word[i]+count;
			} else {
				answer = answer+word[i];
			}
		}
		
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		CompressionString test = new CompressionString();
		test.solution("KKHSSSSSSSE");
	}

}
