package quizmaking;

import java.util.Scanner;

public class quiz_ {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("두 숫자를 입력하세요: ");
		int a,b=0;
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("입력한 값: " + a+","+b);
		if (a%2==0 && b%2==0) {
			System.out.println("두 숫자 모두 짝수이며, 두 숫자의 곱은 "+ a*b);
		}System.out.println("끝입니다.");
		
		}

}
