package if_;

public class Ex02 {

	public static void main(String[] args) {
		int num; 
		num = 20; 
		if( num > 10) {
			System.out.println(num+" : 10보다 크다");
			System.out.println(num+" : 10보다 크다고!!");
		}// 종속문장이 여러개 필요한 경우 중괄호로 묶어주면 된다
// num이 10보다 크지 않으므로, false 이므로 종속문장은 실행되지 않음
		System.out.println("1.다음 문장들 실행~");
		System.out.println("2.다음 문장들 실행~");
		System.out.println("3.다음 문장들 실행~");
		System.out.println("4.다음 문장들 실행~");
		
// 위의 if 식이 거짓인 경우 다음문장들만 실행된다.
//만약 해당 조건이 참이면 종속문장도 표현된다
		
		System.out.println();
		if (num %2 ==0) {
			System.out.println(num +"은/는 짝수다");
		}
		System.out.println("5. 다음 문장");
		if (num %2 !=0) {// 같은 의미 num % 2 ==1
			System.out.println(num +"은 홀수다");
		}
		System.out.println("6. 다음 문장");
	}

}
