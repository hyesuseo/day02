package quizmaking;

import java.util.Scanner;

public class quiz_sd {

	public static void main(String[] args) {
		int num=0;
		Scanner input= new Scanner (System.in);
		System.out.print("숫자: ");
		num = input.nextInt();
		
		if (num%2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다.");
		}

	}

}
