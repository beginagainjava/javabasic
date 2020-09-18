package java04_control.loop;

public class DoWhile_01 {
	public static void main(String[] args) {
		
		
		
		// do-while loop
		
		//	메뉴 선택처럼 최초 2회 수행이 필요한 상황에서 do-while적용
		
//		do {
//			
//			반복 수행 코드
//		} while( 조건식 ) ;
//		
//		// 처음 do 키워드를 만난 후 조건 검사없이 반복코드를 수행한다
//		// 그 이후 조건 검사하고 true/ false에 따라 반복 진행한다
//		
//		// - > 최초 1회 무조거 실행하고 반복하는 Loop
//		
//		
//		do {
//			1. 메뉴 보여주기
//			2. 메뉴 선택하기
//			3. 종료 메뉴를 선택하면 종료
//		} while( 종료를 선택하지 않으면 반복 );
//		
		int i =0;
		do {
			
			System.out.println(i);
			i++;
			
		} while(i < 5);
	}
}
