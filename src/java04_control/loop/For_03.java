package java04_control.loop;

public class For_03 {

	public static void main(String[] args) {
		
		for(int num = 10; num >=1; num--) {
			System.out.println(num);
		}
		
		//	반복횟수 : 10
		//	반복구간 : 10 ~ 1 내림차순
		
		System.out.println("---");
		
		for(int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		
		//	i변수가 0부터 10보다 작은 동안에 2씩 증가하면서 반복
		//	반복횟수 : 5
		//	반복구간 : 0 2 4 6 8
		
		
	}
}
