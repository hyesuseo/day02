package quizmaking;

import java.util.Scanner;

public class another05_cel {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("갤럭시와 아이폰 중 어떤것?: ");
		String model = scan.next();
		System.out.print("정말 구매하시겠습니까? (네/아니오) ");
		String answer = scan.next();
		
		if(answer.contains("네")) {
			if(model.contains("갤럭시")){
				System.out.println("갤럭시! 기능을 선택하셨군요!");
			}else if (model.contains("아이폰")) {
				System.out.println("아이폰! 갬성을 선택하셨군요!");
			}System.out.print("핸드폰 선택에 만족하시나요?(네/아니요)");
			String sat = scan.next();
			if (sat.equals("네")) {
				System.out.println("만족하셔야죠. 돌리기엔 늦었습니다.....");
			}else if(sat.equals("아니오")) {
				System.out.println("네라고 대답하세요, 아니오는 안돼요");
		} 
		
		}else if (answer.contains("아니오")) {
			System.out.println("둘 다 안팔아요!!!!");
		}
		
		
			
	}

}
