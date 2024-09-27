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

		n1 += 1; // n1(6) = n1(5) + 1
		System.out.println(n1); // 결과가 몇이 나올까?6
		n1 -= 1; // n1(5) <= n1(6) -1
		System.out.println(n1); // 결과가 몇이 나올까?5
		n1 *= n2;	// n1(25) = n1 (5) * n2(5)
		System.out.println(n1); // 결과가 몇이 나올까?25
		n1 /= n2;	// n1(5) <=n1(25) /n2(5)
		System.out.println(n1); // 결과가 몇이 나올까?5
		n1 %= n2;	//  나머지는 0 <= n1(5)/n2(5)
		System.out.println(n1); // 결과가 몇이 나올까?0?
	
System.out.println("---관계연산자---");
n1 = 5;
n2 = 4; 
System.out.println(n1>n2);	
System.out.println(n1<=n2);	
System.out.println(n1==n2);	
System.out.println(n1!=n2);	
// 이 결과값을 변수에 저장하고 싶을때?

boolean result = (n1 != n2);
System.out.println("result : "+ result);
System.out.println();
System.out.println("---논리연산자---");
int n3 = 10;
n1 = 5; n2 = 7; //위에서 이미 선언함
System.out.println(n1>n2);
System.out.println(n1>n3);

//아래의 식이 true가 나오면 , 그 기준이 되는 숫자가 가장 크다는 뜻!
System.out.println(n1>n2 && n1>n3); // n1이 가장 큰 숫자가 아니라는 뜻
System.out.println(n2>n1 && n2>n3); // 
System.out.println(n3>n1 && n3>n1); // n3가 가장 큰 숫자라는 뜻

System.out.println();
System.out.println("---Or연산자---");
System.out.println( true || true ); //true
System.out.println( true || false );//true
System.out.println( false || true );//true
System.out.println( false || false );//false

System.out.println();
System.out.println("---and연산자---");
System.out.println( true && true ); //true
System.out.println( true && false );//f
System.out.println( false && true );//f
System.out.println( false && false );//false


System.out.println();
System.out.println("---not연산자---"); // 결과를 반전시켜준다
System.out.println( !true ); //f
System.out.println( !false );//t
System.out.println( !(10>20) );//t

System.out.println();
System.out.println("---증감 연산자---");
n1 =5; 
++n1; 
System.out.println("n1: " + n1); 

n2 =5; 
n2++;
System.out.println("n2: " + n2); 
System.out.println("------");
n1=10; 
n2=++n1;
System.out.println("n1 : " +n1);
System.out.println("n2 : " +n2);

System.out.println("------");
n1=10; 
n2=n1++;
System.out.println("n1 : " +n1);
System.out.println("n2 : " +n2);

System.out.println("---조건연산자---");
n1=31; n2=20;
String r = (n1 > n2)?"n1이 n2보다 크다":"n2가 n1보다 크다"; //결과값이 r이라는 변수에 저장된다.
//이때 자료형은 문자열이므로 string에 저장해야한다
System.out.println(r);
//이런식으로 사용가능 ( n1>n2 && n1%2 ==0 )?"n1은 n2보다 큰 짝수이다":


}

}
