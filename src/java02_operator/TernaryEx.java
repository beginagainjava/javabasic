package java02_operator;

public class TernaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	삼항연산자 - 조건
		//	조건연산자
		//	삼항조건연산자
		
		//	조건식	? 참일때 반환값 : 거짓일때 반환값;
		//	**조건식 : true / false로 판별할 수 있는 연산식
		
		int num1 = 10, num2 = 20;
		System.out.println( num1 > num2 ? "num1이 크다" : "num1이 작다" );
		
		//result에 저장되는 값의 의미는?
		int result = num1 > num2 ? num1 : num2 ; //	num1 과 num2 중 큰 수를 출력
		System.out.println(result);

	}

}
