package java04_control.switchEx;

public class Switch_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리형 데이터를 switch에 사용할 수 없음
//		boolean b = true;
//		
//		switch(b) {
//		case true:
//		case false:
//			
//		}
//		
//		//===========================================
//		
//		//실수형 데이터를 switch에 사용할 수 없음
//		
//		double d = 3.14;
//		switch(d) {
//		
//		}
		
		//===========================================

		// switch에서 char형 다루기
		char alpha = 'A';
		
		switch( alpha ) {
		case 'A':
			System.out.println("A에요");
			break;
		case 'B': // 66
			System.out.println("B에요");
			break;
		case 'C':
			System.out.println("C에요");
			break;
		default:
				System.out.println("A,B,C 모두 다 아니에요");

		}
		

		

	}

}
