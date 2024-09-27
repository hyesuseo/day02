package if_;

import java.util.Scanner;

public class Ex01 {

	public static void main (String [] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("1.쉬운 게임");
		System.out.println("2.어려운 게임");
		System.out.println("3.종료");
		System.out.print(">>> : ");
		num = sc.nextInt(); //num에 입력받은 값을 저장한다
		if (num == 1) 
			System.out.println("쉬운게임 동작합니다!!!");
		// ; 가 나와야 문장이 종료되는 것이므로, if문은 여기까지
		if (num == 2) 
			System.out.println("어려운게임 동작합니다!!!");
		
		if (num == 3) 
			System.out.println("게임을 종료합니다");
		
			

	}

}
