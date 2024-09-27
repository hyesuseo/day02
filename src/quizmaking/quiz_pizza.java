package quizmaking;

import java.util.Scanner;

public class quiz_pizza {
	public static void main(String []args) {
		Scanner input= new Scanner(System.in);
		int menu, temp, times;
		String option;
		System.out.println("===================");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("===================");
		System.out.print("메뉴 선택: ");
		menu = input.nextInt();
		System.out.println("===================");
		System.out.println("1. ICE 2. HOT");
		System.out.print("온도선택: ");
		temp= input.nextInt();
		System.out.println("===================");
		System.out.println("추가입력사항>>샷추가, 시럽추가, 얼음제외, 얼음추가");
		System.out.print("추가: ");
		option =input.next();
		System.out.print("몇 번? ");
		times =input.nextInt();
		if (menu ==1) {
			if(temp==1)
				System.out.println("선택하신 메뉴는 아이스 아메리카노 입니다.");
			else 	
				System.out.println("선택하신 메뉴는 따뜻한 아메리카노 입니다");
		} 
		else {
			if(temp==1)
				System.out.println("선택하신 메뉴는 아이스 카페라떼 입니다.");
			else 	
				System.out.println("선택하신 메뉴는 따뜻한 카페라떼 입니다");
		}
		if (option.equals("샷추가")||option.equals("시럽추가")) {
			if (times>=3) {
			System.out.println("몸에 안좋습니다. 적당히 넣으세요");
			}else {	
			System.out.println("음료 나왔습니다. 맛있게 드세요");
			}
		}else { 
			System.out.println("음료 나왔습니다. 맛있게 드세요");
	}
	}
}

