package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// 표준입력객체
		int num1, num2;
		
		// 1. 숫자 하나를 입력받아 양수인지 음수인지 판별하시오
		System.out.print("양수/음수 판별 : ");
		num1 = sc.nextInt();
		
		if(num1 > 0) {
			System.out.println("양수입니다");
		} else if(num1 < 0){
			System.out.println("음수입니다");
		} else {
			System.out.println("0입니다");			
		}
		

		// 2. 입력한 데이터가 3의 배수인지 판별하시오
		System.out.print("3의 배수 판별 : ");
		num2 = sc.nextInt();
		
		String result = ( ((num2 % 3) == 0) && (num2 != 0) ) ? "은/는 3의 배수입니다" : "은/는 3의 배수가 아닙니다";
		System.out.println("num[ "+ num2 +" ]" + result);
		
//		if( ((num2 % 3) == 0) && (num2 != 0) ) {
//			System.out.println("3의 배수입니다");
//		} else {			
//			System.out.println("3의 배수가 아닙니다");
//		}
		
		
		// 3. 두 수를 입력 받아 큰 수를 출력하시오
		System.out.print("첫번째 숫자 입력 : ");
		num1 = sc.nextInt();

		System.out.print("두번째 숫자 입력 : ");
		num2 = sc.nextInt();
		
//		int result = (compareNum1 >= compareNum2) ? compareNum1 : compareNum2;
		
		System.out.println( Math.max(num1, num2) + " 이 더 큰 수");

	}

}
