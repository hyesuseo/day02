package operator;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("-----산술연산자-----");
		
		int n1 = 9, n2 = 2;
		System.out.println( n1 / n2); //정수나누기 정수는 몫도 정수값만
		System.out.println( n1 / (double)n2);
		//실수의 값을 원하면, 하나라도 실수값을 갖고있으면 실수가 나옴
		//형변환을 사용해서 n2를 실수로 변경해주면 실수값을 얻을 수 있음
		//형 변환을 n1에 써도 되고, n2에 써도 됨
		System.out.println( n1 % n2);

		System.out.println("-----복합대입연산자-----");
	//결과값이 어떻게 출력될지 생각하면서 실행해보기
		n1 = n2 = 5;

		n1 += 1;
		System.out.println(n1); // 결과가 몇이 나올까?6
		n1 -= 1;
		System.out.println(n1); // 결과가 몇이 나올까?5
		n1 *= n2;
		System.out.println(n1); // 결과가 몇이 나올까?25
		n1 /= n2;
		System.out.println(n1); // 결과가 몇이 나올까?5
		n1 %= n2;
		System.out.println(n1); // 결과가 몇이 나올까?0?
	
	
	
	}

}
