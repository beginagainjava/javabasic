package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {
		
		//break;
		//	제어문을 중단시키는 역할을 수행하는 코드
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			
			if ( i >= 5) { 
				break;	//for문 중단코드
			}
		}
		
		System.out.println("----------------------------");
		
		
		//continue;
		//	반복문에서 사용되는 기타제어문
		
		for(int i = 0; i < 10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
