package string;

public class Panlindrome {

	public String solution(String str) {
		String answer = "";
		
		if(str.length()%2!=0) {
			answer = "NO";
		} else {
			String str1 = str.substring(0, str.length()/2);
			String temp = str.substring(str.length()/2);
			String[] word = temp.split("");
			String str2 = "";
			for(int i= temp.length()-1;i>0;i--) {
				str2 = str2+word[i];
			}
			if(str1.equals(str2)) { answer = "YES";}
			else {answer = "NO";}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Panlindrome test = new Panlindrome();
		System.out.println(test.solution("goog"));

	}

}
