package java08_abstract.interfaceEx;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();	// 인터페이스와 상관없이 부모클래스 코드 실행함
		
		System.out.println("---------------");
		
		Parent p; // 부모클래스 객체 변수
		p = new Child(); // 자식클래스 객체 생성
		
		// 부모클래스타입 <- 자식클래스타입
		
		System.out.println("---------------");

		// implements한 인터페이스도 부모데이터타입으로 인정받는다
		
		Inter_01 i01 = new Child();
		Inter_01 i02 = new Child();
		
		i01.out();	// 자식타입 인스턴스로 동적 바인딩
		i02.out();	// 자식타입 인스턴스로 동적 바인딩
		
		
		
		
	}

}
