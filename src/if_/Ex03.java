package if_;

public class Ex03 {

	public static void main(String[] args) {
		int num = 11 ;
		if (num>10) { //11은 10보다 크므로
			System.out.println("if 실행"); //종속문장 실행
		}else {// 참이므로 else는 실행되지 않음
			System.out.println("else 실행");
		}
		System.out.println("다음 문장들 실행!!");
		
		//초기화
	int n1, ret; //그냥 변수를 만들면 어떠한 값도 저장안되어서
	//연산도 안되고 출력도 안된다!
	int n2 =10;
	//ret = n1 + n2;//현재 n1에 어떠한 값도 저장되어있지 않으므로
				//에러가 발생하게 됨!
	if(n2>=10) 	
		n1=100;
	else //if(n2<10)
		n1=10;
	//일단n1 을 선언해놓고, 조건에 따라 100 혹은 10이 들어가게끔
	System.out.println(n1); //이런 경우 저장이 안되기도 하여 에러발생
	
	
	//if else는 둘 중에 하나는 무조건 실행된다.
	int k=0,e=0,m=0,sum=0 ;
	//변수를 만들자마자 초기화하는 습관을 들이는 것이 좋다
	
	//첫번째 글자가 소문자 = 0으로 초기화
	//첫번째 글자가 대문자로 = null로 초기화
	int i = 0;
	double d = 0;
	String s = null; //첫번째 글자가 대문자인 자료형은 무조건 null로 초기화한다.

	if (d ==0)
		System.out.println("d에 입력하세요");
	if (s == null)
		System.out.println("s에 입력하세요");
	}		
}

