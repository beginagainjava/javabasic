package java06_class.overloading;

public class Overloading_01 {
	
	//멤버필드
	private int x;
	private int y;
	
	//멤버필드 출력
	public void display() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	//멤버필드 x,y에 값을 저장하고 난 뒤에 출력하기
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	//-------------------------------------
	
	// 오버로딩의 문법적 특성
	
	public void display(double d) {
		
		
	}
	
	public void display(String str) {
		
	}

	
	// 매개변수형식은 같은데 리턴타입만 다를 경우에는
	// 오버로딩이 성립하지 않는다
	
//	public int display() {
//		
//		return 0;
//	}

}
