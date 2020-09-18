package java02_operator;

public class BinaryEx_01 {
	
	public static void main(String[] args) {
		
		//이항연산자 - 산술
//		+ - * / %
		
		int num1 = 17, num2 = 4;
		int result = num1 + num2; // 결과 저장 변수
		
		result = num1 + num2; // 변수 활용
		System.out.println(num1 + "과 " + num2 + "의 합계 : " + result); // 덧셈 연산
		
		
		//------------------------------------------------
//		나머지 연산자
//		modular operator
//		mod
		result = num1 % num2;
		System.out.println("나머지 연산 결과 : " + result);
		
		System.out.println("--- 산술 연산자 ---");
		System.out.println("num1 + num2 = " + num1 + num2); // 더하기 X
		System.out.println("num1 + num2 = " + 17 + 4);
		System.out.println("num1 + num2 = 17" + 4);
		System.out.println("num1 + num2 = 174");
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // 더하기
		System.out.println("num1 - num2 = " + (num1 - num2)); // 빼기
		System.out.println("num1 * num2 = " + (num1 * num2)); // 곱하기
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나머지
		
		// 산술연산은 반드시 피연자들이 같은 데이터타입일 때만 연산 가능
		// 산술연산의 결과는 피연산자의 데이터타입으로 나온다
		
		System.out.println("----------형변환 전------------");
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기
		System.out.println("----------형변환 후------------");
		System.out.println("num1 / num2 = " + ((double)num1 / (double)num2)); // 나누기
		
		System.out.println("----------------------");
		System.out.println("num1 / num2 = " + (num1 / (double)num2)); // int / double
//		System.out.println("num1 / num2 = " + (17 / (double)4)); // int / (double)int
//		System.out.println("num1 / num2 = " + (17 / 4.0)); // int / double
//		System.out.println("num1 / num2 = " + (17.0 / 4.0)); // double / double (자동형변환)
//		System.out.println("num1 / num2 = " + (4.25)); // double
		
		System.out.println("----------------------");
		
		double d = 3.14;
		
		System.out.println("d / 2 = " + (d/2));
		System.out.println("d % 2 = " + (d%2));
		System.out.printf("%.2f", d%2);
	}

}
