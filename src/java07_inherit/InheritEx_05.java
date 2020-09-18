package java07_inherit;

class Parent5 {
	protected int num;
	
	public Parent5() {
		System.out.println("부모 디폴트 생성자");
	}
	
	public Parent5(int num) {
		this.num = num;
		System.out.println("부모 매개변수있는 생성자");
	}
}

class Child5 extends Parent5 {
	public Child5() {
		
//		super(); // 수퍼 생성자, 생략되어있음
		
		System.out.println("자식 디폴트 생성자");
	}
	
	public Child5(int num) {
		
		super(num); // 부모 매개변수있는 생성자를 선택해서 호출가능
//		this.num = num; 
		// Child5에서 멤버필드로 num변수가 없어서
		// super영역(상속받은 필드)에서 num변수를 찾는다
		
		super.num = num;
		// super영역(상속받은 필드)에서 num변수를 찾는다
		
		System.out.println("자식 매개변수있는 생성자");
		
		
	}
	
	
}

public class InheritEx_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent5 p = new Parent5();
		
		System.out.println("-------------");
		
		Child5 c = new Child5();

		System.out.println("-------------");
	
		Parent5 p2 = new Parent5(55);
		System.out.println(p2.num);
		
		System.out.println("-------------");
		
		Child5 c2 = new Child5(123);
		
		
	}

}
