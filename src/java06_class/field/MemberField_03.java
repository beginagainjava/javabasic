package java06_class.field;

public class MemberField_03 {

	private int num = 777; //  인스턴스 변수
	private static int num2 = 555; //클래스 변수, 정적 변수

	public void method(int var) { //var -> 매개변수, 지역변수
		System.out.println(num);
		System.out.println(num2);

		//--------------------------------

		int num = 101; // 지역변수
		int num2 = 202; // 지역변수

		System.out.println(num);
		System.out.println(num2);

		//--------------------------------
		System.out.println(this.num); //멤버필드 출력
		System.out.println(this.num2); //멤버필드 출력

		//정적 변수에 대한 접근은 클래스명. 으로 하는게 좋다
		System.out.println(MemberField_03.num2);

		//정적 메소드 - 메인메소드는 정적메소드이다
		//		public static void method2() {
		//			System.out.println(num);  // 인스턴스 변수, 불가
		System.out.println(num2); // 정적 변수, 가능

	}
}

