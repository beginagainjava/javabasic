package java02_operator;

public class BinaryEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 이항연산자 - 대입(Assign)
		// =
		// 오른쪽에 있는 값을 왼쪽에 있는 공간에 저장
		// 연산방향이 오른쪽에서 왼쪽
		
		// 연산자 우선순위가 거의 최하위에 있는 연산자
		
		int num1 = 10;
		int num2 = 20;
		
		num1 = 11;
		num2 = 22;
		
		int num3 = num1;
		// int num3 = 11;
		
		int num4, num5, num6;
		
		// 대입 연산자는 연산 수행 후 대입한 값을 리턴한다
		num6 = num5 = num4 = num3;
//		num6 = num5 = num4 = 11;
//		num6 = num5 = 11;
//		num6 = 11;
//		11;
		
		
		// ------------------------------------
		
		// 복합대입연산자 - 산술대입
		// += -= *= /= %=
		
		// 왼쪽에 있는 변수의 값과 오른쪽에 있는 값을 연산하고
		// 그 결과를 왼쪽에 있는 변수에 대입한다
		
		num1 = 13;
		num2 = 14;
		
		System.out.println("---산술대입 연산 전---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 += num1; // num2 = num2 + num1;
	
		System.out.println("---산술대입 연산 전---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// 복합대입연산자의 대입연산기호는 항상 오른쪽
		
		num2 -= 7;		// -= 산술복합대입연산자 (이항연산자)
		num2 =   -7;	// - 음수변환 연산자 (단항연산자)

		
	}

}
