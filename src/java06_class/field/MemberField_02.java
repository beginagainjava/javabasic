package java06_class.field;

public class MemberField_02 {
	
	private static String city = "Seoul";
//	public static String city = "Seoul";
	
	
	// city Getter
//	public String getCity() {
//		return city;
//	}
	
	//정적 메소드, static 메소드
//	정적 메소드 호출 ( 클래스를 이용해 호출이 가능해짐)
	public static String getCity() {
		return city;
	}
	
	//------------------------------------------
	
	private int num; //인스턴스 변수
	
//	public static void test() { //정적 메소드
//		System.out.println( num );
//	}
	
	//정적메소드에서 인스턴스 변수 사용 불가
	
	//------------------------------------------
	
	private static int num2;
	
	public void test2() {
		System.out.println(num2);
	}
	
	//일반 메소드에서 정적 변수사용하는 것은 문제없음
	
	//-----------------------------------------------
	

}
