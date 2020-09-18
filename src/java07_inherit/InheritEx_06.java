package java07_inherit;

class Parent6 {
	public void display() {
		System.out.println("부모 메소드");
	}
	
}

//final class Child6 extends Parent6 { //상속을 줄 수 없는 클래스
class Child6 extends Parent6 {
	
	@Override
	public final void display() { // final - 더 이상 오버라이딩 불가
		
		System.out.println("자식 클래스 오버라이딩 메소드");
	
	}
}

class GrandChild extends Child6 {
//	@Override
//	public void display() {
//		System.out.println("2번 재정의된 메소드");
//	}
	
}

public class InheritEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandChild gc = new GrandChild();
		
		gc.display();
	}

}
