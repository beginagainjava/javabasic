package java02_operator;

public class UnaryEx_02 {
	public static void main(String[] args) {
		
		//	단항연산자 - 증감
		//	++ : 증가연산자
		//	-- : 감소연산자
		
		//	피연산자로 적용된 변수의 값을 1 증가(감소)시킨다
		
		int num = 15;
		System.out.println(num);	// 원본값
		System.out.println(num--);	// 활용		후위 감소, 후치 감소
		System.out.println(num);	// 연산 후
		
		
		num = 15;
		System.out.println(num);	// 원본값
		System.out.println(--num);	// 활용		전위 감소, 전치 감소
		System.out.println(num);	// 연산 후
		
		
		num = 13;
		
		System.out.println( num++ - 10 + ++num ); 	// num == 13 인 상태
//		num = 14; System.out.println( 13 - 10 + ++num );		//num == 14 인 상태
//		System.out.println( 13 - 10 + 15 );			//num == 15 인 상태
//		System.out.println( 18 );			//num == 15 인 상태
		
	}
}
