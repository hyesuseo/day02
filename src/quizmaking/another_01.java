package quizmaking;

import java.util.Scanner;

public class another_01 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int score = 0;
		System.out.print("점수를 입력하세요: ");
		score = input.nextInt();
		if (score>= 90) {
			System.out.println("A등급입니다");
		}else if (score >=80) {
			System.out.println("B등급입니다");
		}else if (score >=70) {
			System.out.println("C등급입니다");
		}else if (score >=60) {
			System.out.println("D등급입니다");
		}else {
			System.out.println("재시험입니다");
		}
		
		
		
	}
}
