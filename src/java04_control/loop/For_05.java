package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//	1부터 10까지 총합을 구하기
		
		//	반복횟수 : 10
		//	반복구간 : 1 ~ 10
		
		//	초기식 : int i = 1;
		//	조건식 : i <= 10;
		//	증감식 : i++
		
		// ** 필요한 변수 : int sum = 0;
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
 		System.out.println(sum);
 		
	}

}
