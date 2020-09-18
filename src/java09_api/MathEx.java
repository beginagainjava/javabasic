package java09_api;

public class MathEx {

	public static void main(String[] args) {

		
		//원주율 출력
		System.out.println(Math.PI);
		
		//-10의 절대값
		System.out.println(Math.abs(-10));
		
		// 3.7의 올림값
		System.out.println(Math.ceil(3.7));
		
		// 3.7의 내림값
		System.out.println(Math.floor(3.7));
		
		// -3.7의 반올림값
		System.out.println(Math.round(-3.7));
		
		//2.1의 3제곱값
		System.out.println(Math.pow(2.1, 3));
		
		//3.14와 3.141592 중 큰 값
		System.out.println(Math.max(3.14, 3.141592));
		
		System.out.println();
		
		// 0.0(포함) ~ 1.0(제외) 사이의 난수(랜덤)
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 5); // 0.0(포함) ~ 5.0(제외)
		System.out.println((int)(Math.random() * 5)); // 0 ~ 4
		System.out.println((int)(Math.random() * 5)); // 1 ~ 5
		
		
		
	}

}
