package java06_class;

//실행 클래스 - 메인 메소드가 정의되어있는 클래스
public class Main_01 {
	
	//JVM이 메인 메소드를 찾아 한줄씩 실행
	public static void main(String[] args) {
		
		//Class_01 클래스타입의 객체 변수 c01
		Class_01 c01;
		
		//Class_01 클래스타입의 객체 생성(인스턴스 생성)
		c01 = new Class_01();
		
		//멤버필드에 값 대입
		c01.num = 100;
		c01.data = "Apple";
		
		//c01 객체의 멤버필드 num, data 출력
		System.out.println(c01.num);
		System.out.println(c01.data);
		
		//c01 객체 출력
		System.out.println(c01);
		
		//c01 객체의 멤버 메소드 display() 호출
		c01.display(); //메소드명 적고 () 괄호를 붙인다
		
		Class_01 c02 = new Class_01();
		Class_01 c03 = new Class_01();
		Class_01 c04 = new Class_01();
		Class_01 c05 = new Class_01();
		
		c02.num = 100;
		c03.num = 200;
		c04.num = 300;
		c05.num = 400;
	}

}
