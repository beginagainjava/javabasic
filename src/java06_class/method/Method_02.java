package java06_class.method;

public class Method_02 {
	
	//매개변수 X, 리턴타입 X
	public void method01() {
		System.out.println("메소드 호출");
	}
	
	//------------------------------------
	//매개변수 O, 리턴타입 X
	public void method02(int parameter) { // 매개변수 == parameter
		
		System.out.println("전달된 값 : " + parameter);

	}
	
	//-------------------------------------
	
	//매개변수 X, 리턴타입 O
	public int returnNum() {
		return 777;
	}

	//-------------------------------------

	//매개변수 O, 리턴타입 O
	public int plus(int n1, int n2) {
		return n1+n2;
	}

}
