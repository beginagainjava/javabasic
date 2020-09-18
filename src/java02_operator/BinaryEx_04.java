package java02_operator;

public class BinaryEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	이항연산자 - 논리
		//	&&	||	!	(AND, OR, NOT)
		
		//	! 연산자는 단항연산자
		
		//	AND 연산은 피연산자 모두 true일 때 결과가 true
		//	OR 연산은 피연산자 중 하나라도 true일 때 결과가 true
		//	NOT 연산은 피연산자를 부정(반대로 바꿈)
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("ture && false : " + (b1 && b2));
		System.out.println("ture || false : " + (b1 || b2));
		
		System.out.println("-------사용예시-------");
		
		int num = 88;
		
		System.out.println( num >= 1);
		System.out.println( num <= 100);
		
		//	num 변수의 값이 1~100 사이의 숫자인가
		System.out.println( 1 <= num && num <= 100);
//		System.out.println( 1 <= 88 && 88 <= 100);
//		System.out.println( true && 88 <= 100);
//		System.out.println( true && true );
//		System.out.println( true );
		
		
//		System.out.println( 1 <= num <= 100 );
//		System.out.println( 1 <= 88 <= 100 );
//		System.out.println( true <= 100 );	//	boolean과 int형 비교불가
		
		System.out.println( !((num >= 1) && (num <= 100)) );
//		System.out.println( !(num >= 1) !&& !(num <= 100) );
		System.out.println( num < 1 || num > 100 );
		
		

	}

}
