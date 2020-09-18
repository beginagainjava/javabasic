package java08_abstract.interfaceEx;

//인터페이스
interface TestInterface {
	public static final int NUM = 888;
	
	//interface에서는 상수와 추상메소드만 가질 수 있으므로
	//public static final 키워드가 앞에 없어도 자동으로 적용된다
	int NUMBER = 100;
	
	//------------------------
	
	public abstract void out();
	
	//메소드에 abstract 키워드가 없어도 추상 메소드로 정의된다
	public void display();
	
}


// 인터페이스를 상속(구현)하고 있는 클래스
// -> 인터페이스에 정의된 추상메소드를 반드시 구현해야한다(오버라이딩)
class Test implements TestInterface {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}
	
}

//추상클래스에선 상수를 보관하거나 추상메소드를 보관하는 역할
abstract class TestClass {
	public static final int MAX = 999; //	상수
	
	public abstract void method(); //	추상메소드
}

class Childddd extends TestClass {
	public void method() {
		System.out.println("추상클래스 상속받았음");
		
	};
}


public class InterfaceEx_01 {

	public static void main(String[] args) {
		
		TestClass tc1; //  객체 변수 선언
		
//		tc1 = new TestClass(); // Error, 추상클래스는 객체 생성 안됨
		
		
		System.out.println(TestClass.MAX);
		
		System.out.println("-------------------");
		
		// 인터페이스를 사용할경우
		// 클래스와 같이 객체변수를 선언하지 않고 바로 사용할 수 있다
		System.out.println(TestInterface.NUM);
		System.out.println("-------------------");
		
		Childddd ch = new Childddd();
		System.out.println(ch.MAX);
		ch.method();
		
		
	}

}
