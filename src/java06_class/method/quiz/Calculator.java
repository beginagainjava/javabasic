package java06_class.method.quiz;

public class Calculator {
	
//	 + package
//	 	java06_class.method.quiz
//
//	 + Ŭ���� �ۼ��ϱ�
//	  1. ��� Ŭ���� ( class Calculator )
//		- ��� : ��Ģ���� ����
//		- �޼ҵ� 4��
//			sum, sub, mul, div
//		- �Ű����� : ���� 2��
//		- return : ���� (��, div�� double)
	
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
