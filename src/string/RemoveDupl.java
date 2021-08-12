package string;


public class RemoveDupl {

	public String solution(String str) {
		String answer="";
		String[] word = str.split("");
		int i=0, len=word.length-1;
		
		while(i<=len) {
			if(!word[i].equals(word[len])) {
				len--;
			} else {
				String temp = word[len];
				word[len] = word[word.length-1];
				word[word.length-1] = word[len];
				i++;			
			}
			
			
		}
		
			
		return answer;
	}
	
	public static void main(String[] args) {
		RemoveDupl test = new RemoveDupl();
		test.solution("ksekkset");

	}

}
