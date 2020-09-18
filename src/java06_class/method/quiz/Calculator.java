package java06_class.method.quiz;

public class Calculator {
	
//	 + package
//	 	java06_class.method.quiz
//
//	 + 클래스 작성하기
//	  1. 기능 클래스 ( class Calculator )
//		- 기능 : 사칙연산 계산기
//		- 메소드 4개
//			sum, sub, mul, div
//		- 매개변수 : 정수 2개
//		- return : 정수 (단, div는 double)
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	public double div(int num1, int num2) {
		return (double) num1 / num2;
	}

}
