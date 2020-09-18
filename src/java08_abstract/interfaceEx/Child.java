package java08_abstract.interfaceEx;

// 인터페이스는 여러개 추가할 수 있다
public class Child extends Parent implements Inter_01, Inter_02 {
	
	@Override
	public void out() {
		System.out.println("자식클래스");
	}

}

// ** 자바는 다중상속을 금지하고 있다

//class Parent1 {
//	public void out() {
//		
//	}
//}
//
//class Parent2 {
//	public void out() {
//		
//	}
//}
//
//class Childern extends Parent1, Parent2 {
//	//어떤 부모클래스의 out() 메소드를 상속받아야하는지 모호해진다
//	// out() 메소드를 호출할 때에도 마찬가지로 모호한 상황이 된다
//	// -> 자바는 extends로 상속할 수 있는 부모클래스를
//	// 한 개로 제한한다
//}
