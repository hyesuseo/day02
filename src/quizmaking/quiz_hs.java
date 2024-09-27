package quizmaking;

import java.util.Scanner;

public class quiz_hs {
 public static void main(String []args) {
	 Scanner input =  new Scanner(System.in);
	 //입력받는 기능, input은 입력받기 위한 변수
	 System.out.println("메뉴입니다");
	 System.out.println("[1]맥도날드 [2]라면 [3]닭갈비 [4]돈까스");
	 System.out.print("점심 뭐먹을까요?"); 
	 int ans; // 1,2,3,4중 정수를 입력받는다
	 ans = input.nextInt();
	 if (ans ==1 || ans==2 || ans==3)//ans가 1,2,3 의 값중 어느 하나라면
	 			{
		 System.out.println("흠 그건좀...."); //흠 그건좀을 출력한다
	 }else if (ans ==4 ){
		 System.out.println("먹으러 갑시다!"); //4의 값의 경우에만 옆을 출력한다.
	 }else {
		 System.out.println("올바르지 못한 접근입니다");
	 }
	 	 
 }
 
}
