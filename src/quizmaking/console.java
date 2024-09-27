package quizmaking;

import java.util.Scanner;

public class console {
	public static void main(String [] args) {
	Scanner input = new Scanner (System.in);
	int num;
		System.out.println("0~100까지 점수를 입력해 주세요: ");
	num = input.nextInt();
	System.out.println("입력하신 수는 "+num);
	if(num%2==0) {
		System.out.println("입력하신 수는 짝수입니다");
	}else System.out.println("입력하신 수는 홀수입니다");
		
	if (num>=50){
	System.out.println("입력하신 수는 50이상입니다");
	}else System.out.println("입력하신 수는 50미만입니다");
		
	int a = (num/10);
	int b = (num%10);
	int c = a+b;
	System.out.println("입력한 자리수를 모두 합치면 "+c+"입니다");
	if (c==7)
		System.out.println("행운의 숫자네요!");
	

	}
}

