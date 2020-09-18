package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		매일 해야하는일 
//			a. 예금액 두배로 늘리기
//			b. 총 금액에 예금액을 더하기
		
		int money = 10;
		int account = 0;
		
		for(int i = 0; i < 15; i++) {
			
			account += money;
			money *= 2;
			
		}
		
		System.out.println("저축한 총 금액 : " + account + "원");

	}

}
