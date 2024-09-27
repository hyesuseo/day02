package operator;

import java.util.Scanner;

public class quiz01 {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int num0;
	 System.out.print("수 입력: ");
	 num0 = input.nextInt();
	 String str1= (num0%2 == 0)? num0+" = 짝수":num0+" = 홀수";
	 System.out.println(str1);
	 
	 String str2 = (num0%3 ==0)? "3의 배수이다": "3의 배수가 아니다";
	 System.out.println(num0 + " = "+str2);
	 
	 int num1, num2; 
	 System.out.print("두 수 입력: ");
	 num1 = input.nextInt();
	 num2 = input.nextInt(); 
	 
	 System.out.println("num1 : " + num1+",num2 :" + num2);
	 String str3 = (num1>num2)?"num1이 num2보다 크다": "num2가 num1보다 크다";
	 System.out.println(str3);
	 

	}

}
