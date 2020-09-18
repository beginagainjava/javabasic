package java02_operator;

public class BinaryEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이항연산자 - 관계, 비교
		
		//		<	less than, lt
		//		>	greater than, gt
		//		<=	less than equal, le
		//		>=	greater than equal, ge
		//		==	equal, eq
		//		!=	not equal, ne
		
		// 왼쪽 피연산자와 오른쪽 피연산자를 비교하여
		// 결과를 참 / 거짓으로 반환한다 (boolean타입으로 반환)
		
		// true, false 반환
		
		int num1 = 10, num2 = 20;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));

		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 > num2 : " + (num1 > num2));

		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
	}

}
