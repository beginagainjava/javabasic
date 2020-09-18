package java04_control.condition;

public class IfElse_03 {
	public static void main(String[] args) {
		
		int num = 11;
		if( num > 0 && num <= 100) {
			// num은 1~100사이의 정수
		}
		
		if ( num > 0) { // 양수, positive
			System.out.println("0보다 크다");
			
			if( num <= 100 ) {
				System.out.println("100보다 작거나 같다");
				
				System.out.println("1~100사이의 정수");
			}
			
		} else { // !(num>0), num <= 0, 양수가 아닌 숫자
			// 음수거나 0인 숫자
			System.out.println("0보다 크지 않다");
			
			if( num == 0 ) {
				System.out.println("0입니다");
			} else {
				System.out.println("음수입니다");				
			}
			
		}
		
	}

}
