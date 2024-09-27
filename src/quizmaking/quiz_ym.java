package quizmaking;

import java.util.Scanner;

public class quiz_ym {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int temp=0;
		System.out.print("지금 몇 도인가요?");
		temp=input.nextInt();
		if(temp>=30) {
			System.out.println("날씨가 너무 더워요");
		}else {
			System.out.println("날씨가 쾌적해요");
			
		}

	}

}
