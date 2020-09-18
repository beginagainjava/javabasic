package java06_class.field;

public class MemberFieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null;
		
//		System.out.println( mf01.num );
		System.out.println( mf01.getNum());
		System.out.println( mf01.getName());
		mf01.printNum();
		
		mf02.setNum(777);
		System.out.println(mf02.getNum());
		
//		System.out.println(mf03.getNum());
		
		
		// NullPointerException 발생
		// null 참조값을 이용하여 멤버에 접근할 때 발생한다
		// 엄청엄청 자주 보이는 예외!! - 꼭 기억할것
//		System.out.println( mf03.getNum());
		
		//-----------------------------------------------------
		
		System.out.println();
		System.out.println("------ 클래스변수 테스트 ------");
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();

//static 멤버 필드는 class 자체로 접근해야한다.

//		System.out.println( mf04.city );
//		System.out.println( mf05.city );
//		
//		mf04.city = "Busan";
//		System.out.println("--- Busan 대입 ---");
//		
//		System.out.println( mf04.city );
//		System.out.println( mf05.city );
//		
//		MemberField_02.city = "Incheon";
//		System.out.println( MemberField_02.city );
		
		
		//정적 변수를 일반 메소드(getter)를 통해 접근하기
		System.out.println(mf04.getCity());
//		
		//멤버 메소드는 꼭 객체를 이용해서 호출
		
		//정적 메소드 호출 ( 클래스를 이용해 호출이 가능해짐)
		System.out.println( MemberField_02.getCity() );
		
		
		MemberField_03 mf031 = new MemberField_03();
		
		mf031.method(0);

	}

}
