package quizmaking;

import java.util.Scanner;

public class another03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("--------[아이스크림 할인점]--------");
		System.out.print("가지고 있는 돈: ");
		int money = input.nextInt();
		System.out.println("아이스크림 메뉴");
		System.err.println("설레임 2,000원, 월드콘 1,500원, 죠스바 500원");
		System.err.println("따옴 700원, 투게더 5,000원, 하겐다즈 4,500원");
		int sul, world, joes, dda, tog, hgdz, sum;
		sul = 2000; world=1500; joes=500; dda=700; tog=5000; hgdz=4500;
		System.out.println("------------------------------");
		System.out.println("먹고싶은 아이스크림 개수는?(0개도 가능)");
		
		System.out.print("설레임: ");
		int sul2=input.nextInt(); 
		System.out.print("월드콘: ");
		int world2=input.nextInt(); 
		System.out.print("죠스바: ");
		int joes2=input.nextInt(); 
		System.out.print("따옴: ");
		int dda2=input.nextInt(); 
		System.out.print("투게더: ");
		int tog2=input.nextInt(); 
		System.out.print("하겐다즈: ");
		int hgdz2=input.nextInt(); 
		
		System.out.println("------------------------------");
		sum= (sul*sul2 + world*world2 + joes*joes2 + dda*dda2 + tog*tog2 + hgdz*hgdz2);
		System.out.println("총 결제금액 "+ sum);
		if (money < sum) {
			System.out.println("잔액이 부족합니다");
		}else {
			System.out.println("결제완료. 거스름돈: "+ (money-sum));
		}
	

	}

}
