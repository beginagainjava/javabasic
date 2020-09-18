package java04_control.loop;

public class For_01 {
	public static void main(String[] args) {
		
		// 반복문, Loop
		// for문, while문, do-while문
		
//		for( 초기식; 조건식; 증감식 ) {
//			// 조건식이 true 라면 수행하는 코드
//			// 반복적으로 수행한다
//		}
		
		int i;
		for( i = 0; i < 5; i++) {
			System.out.println("Hi : " + i);
		}
		// 초기식 : i = 0;
		// 조건식 : i < 5;
		// 증감식 : i++;
		
		// for문 읽는 방법
		//	i 변수가 0부터 시작해서 5보다 작은 동안에 1씩 증가하면서 반복한다
		
		// for문의 수행 순서
		//		 1. 초기식 수행
		//		 2. 조건식 판별
		//		 	2-1. true 일 때, 3번 수행
		//		 	2-2. false일 때, for문 종료
		//		 3. 반복코드 1회 수행
		//		 4. 증감식 수행
		//		 5. 2번 수행
		
	}
}
