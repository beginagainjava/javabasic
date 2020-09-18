package java04_control.switchEx;

public class Switch_01 {
	public static void main(String[] args) {
		
		//switch문, 선택문
		//	switch-case 문
		
//		switch( 비교대상 ) {
//		
//		case 값1 :
//		case 값2 :
//		case 값3 :
//			...
//		default:
//		}
//		
		int num = 320;
		
		switch( num ) {
		case 10:
			System.out.println("num은 10입니다");
			break;
		case 20:
			System.out.println("num은 20입니다");
			break;
		case 30:
			System.out.println("num은 30입니다");
			break;
		default:
			System.out.println("num은 10, 20, 30 다 아닙니다");
				
		}
		
	}

}
