package java04_control.switchEx;

public class Switch_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 20;
		
		//비교대상은 연산식으로 넣을 수 있다
		
		switch( num - 5 ) {
		case 10:
			System.out.println("AAA");
			break;
		case 15:
			System.out.println("BBB");
			break;
		case 20:
			System.out.println("CCC");
			break;
		}

	}

}
