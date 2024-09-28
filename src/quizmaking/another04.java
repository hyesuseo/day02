package quizmaking;

import java.util.Scanner;

public class another04 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("두 정수를 입력하세요:");
		int a = input.nextInt();
		int b = input.nextInt();
		
		if (a%2==0 && b%2==0) {
			System.out.println("sum="+ (a + b));
		}else {
			System.out.println("홀수가 포함되어 있습니다");
		}

	}

}
