package java01_variables;


public class VariablesEx_03 {
	public static void main(String[] args) {
		
		// 변수 선언 - double형 height 변수
		double height; // 키
		
		// 변수에 값 대입
		height = 200.5;
		
		// 변수의 값 출력
		// 변수에 저장된 값을 활용한다
		System.out.println("height 변수의 값은 : " + height);
		
		// height 변수 활용 - 변수의 값을 불러와서 치환함
		System.out.println("height 변수의 값은 : " + 200.5);
		
		// 문자열과 200.5 를 하나의 문자열로 연결 시킴
		System.out.println("height 변수의 값은 : 200.5");
		
		// + 기호 : 문장(문자열) 연결 기능
		
		// --------------------------------------------------------
		
		double data;
		
		data = height + 100; // 덧셈
//		data = 200.5 + 100;
//		data = 300.5;
		
		System.out.println(data);
		
		// --------------------------------------------------------
		
		char alpha;
		alpha = 'T'; // 84
		// char형 단일 문자 1개를 표현할 땐 ' '로 감싸준다
		
		System.out.println(alpha);

		// --------------------------------------------------------
		
		boolean isEmpty;
		isEmpty = true; // 참
		isEmpty = false; // 거짓
		// boolean형은 true / false 두 가지 값만 저장할 수 있다
		
		System.out.println(isEmpty);

	}

}