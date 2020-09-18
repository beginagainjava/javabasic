package java04_control.loop;

public class For_06 {
	public static void main(String[] args) {
		
		// 구구단 2단을 출력하기
		
		for(int i = 1; i < 10; i++) {
			System.out.println( "2 X " + i + " = " + 2*i);
		}
		
		System.out.println("===========================");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j <10; j++) {
				System.out.print(j + " X " + i +" = " + j*i + "\t");
			} System.out.println();
		}
		
		
		
	}

}
