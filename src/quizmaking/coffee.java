package quizmaking;

import java.util.Scanner;

public class coffee {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String reserve;
	int menu, people=0;
	System.out.println("1. 예약하셨습니까? yes, no 입력해주세요");
	reserve = input.next();
	if(reserve.equals("yes")) {
		System.out.println("예약확인 되었습니다");
	}
		else {
			System.out.println("대기시간이 발생할 수 있습니다.");
		}
	
	System.out.println();
	System.out.println("2. 주문하실 메뉴를 선택해주세요");
	System.out.println("[1] 페퍼로니피자 [2] 고구마피자 [3] 하와이안피자");
	menu=input.nextInt();
	if (menu == 1) 
		System.out.println("페퍼로니 피자의 가격은 17,000원 입니다");
	else if (menu ==2)
		System.out.println("고구마 피자의 가격은 16,000원 입니다");
	else if (menu ==3)
		System.out.println("하와이안 피자의 가격은 15,000원 입니다");
	
	System.out.println("매장을 방문한 인원 수를 입력해 주세요.");
	System.out.println("3배수 이벤트에 자동 참여됩니다");
	people = input.nextInt();
	String cong = (people %3 ==0) 
			? "축하합니다! 3월 맞이 3배수 이벤트에 당첨되어 무료음료쿠폰이 발급되었습니다.":
				people+"명 자리 안내해드리겠습니다.";
	System.out.println(cong);
	
	


	}

}
