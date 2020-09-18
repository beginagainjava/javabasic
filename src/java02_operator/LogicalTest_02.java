package java02_operator;

public class LogicalTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
	
//		OR 연산은 피연산자 둘 중에 하나라도 참이면 연산결과를 참으로 리턴한다
//		-> OR 연산자의 왼쪽 피연산자가 참일 경우 오른쪽 피연산자를 확인(연산)하지 않는다.
		
		
		
		int a = 2, b = 3, c = 5;
		boolean res2;
		
		res2 = c < b++ && c-- > ++a;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
//		AND 연산은 피연산자 둘 중에 하나라도 거짓이면 연산결과를 거짓으로 리턴한다
//		-> AND 연산자의 왼쪽 피연산자가 거짓일 경우 오른쪽 피연산자를 확인(연산)하지 않는다.

	}

}
