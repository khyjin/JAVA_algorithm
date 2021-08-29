package array;

import java.util.Scanner;

public class TempLeader {

	public void solution(int[][] student) {
		int answer = 0;
		int[][] temp = new int[student.length][6];
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<student.length;j++) {
				if(student[j][i]==student[j+1][i]) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		TempLeader test = new TempLeader();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] student = new int[num+1][6];
		for(int i=1;i<=num;i++) {
			for(int j=1;j<6;j++) {
				student[i][j] = sc.nextInt();
			}
		}
		
		test.solution(student);

	}

}
