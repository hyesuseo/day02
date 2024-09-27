package quizmaking;

import java.util.Scanner;

public class another02 {
	public static void main(String[] args) {
	int mode;
	Scanner input = new Scanner(System.in);	
	System.out.println("================");
	System.out.println("1. 쉬움  >>> 1~10");
	System.out.println("2. 보통  >>> 1~100");
	System.out.println("3. 어려움 >>> 1~1000");
	System.out.println("================");
	System.out.print(">>>");
	mode = input.nextInt();
	int num = 0;
	if (mode == 1) {
		num=(int)((Math.random()*11));
	}else if (mode == 2) {
		num=(int)((Math.random()*101));
	}else if (mode ==3) {
		num=(int)((Math.random()*1001));
	}else System.out.println("입력 오류입니다.");
	System.out.println("================");
	System.out.println("숫자를 입력해주세요: ");
	int chance=3;
	int answer=0;
	System.out.println("기회 >>>" + chance);
	System.out.print(">>>");
	answer = input.nextInt();
	for (chance=3; chance>=0; --chance)
		//chance는 0부터 시작하여, 0보다 작거나 같으면 true
		System.out.println("기회 >>>"+ chance);
	answer = input.nextInt();
	if(answer==num) {
		System.out.println("정답입니다!");
		chance=-1;
	}else if (answer > num) {
				System.out.println(answer+"보다 작습니다");
	}else if (answer < num) {
		System.out.println(answer + "보다 큽니다");
	}
		
	}
	}
