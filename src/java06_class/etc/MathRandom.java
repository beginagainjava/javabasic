package java06_class.etc;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// class java.lang.Math
		//	산술적인 연산(계산)을 메소드로 제공한다
		//	메소드들이 전부 static으로 정의되어있다 ...따라서 객체 생성없이 바로 사용가능
		
		//0.0보다 크거나 같고 1.0보다 작은 Pseudorandom double 값 반환
			System.out.println((int) (Math.random() * 10)+1); // 1 ~ 10
			
		// ** Pseudorandom (수도 랜덤, 슈도 랜덤)
//				꾸며낸(가짜) 랜덤
		// ** pseudo (수도, 슈도)
		
			
			System.out.println("-------");
			
			int com = (int) (Math.random() * 3); //0 ~ 2 의 랜덤
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0 ~ 2 중에서 맞춰보세요 >> ");
			int user = sc.nextInt();
			
			
			if(com == user) {
				System.out.println("같은 값");
			} else {
				System.out.println("다른 값");
			}
			
		
	}

}
