package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	// ǥ���Է°�ü
		int num1, num2;
		
		// 1. ���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
		System.out.print("���/���� �Ǻ� : ");
		num1 = sc.nextInt();
		
		if(num1 > 0) {
			System.out.println("����Դϴ�");
		} else if(num1 < 0){
			System.out.println("�����Դϴ�");
		} else {
			System.out.println("0�Դϴ�");			
		}
		

		// 2. �Է��� �����Ͱ� 3�� ������� �Ǻ��Ͻÿ�
		System.out.print("3�� ��� �Ǻ� : ");
		num2 = sc.nextInt();
		
		String result = ( ((num2 % 3) == 0) && (num2 != 0) ) ? "��/�� 3�� ����Դϴ�" : "��/�� 3�� ����� �ƴմϴ�";
		System.out.println("num[ "+ num2 +" ]" + result);
		
//		if( ((num2 % 3) == 0) && (num2 != 0) ) {
//			System.out.println("3�� ����Դϴ�");
//		} else {			
//			System.out.println("3�� ����� �ƴմϴ�");
//		}
		
		
		// 3. �� ���� �Է� �޾� ū ���� ����Ͻÿ�
		System.out.print("ù��° ���� �Է� : ");
		num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է� : ");
		num2 = sc.nextInt();
		
//		int result = (compareNum1 >= compareNum2) ? compareNum1 : compareNum2;
		
		System.out.println( Math.max(num1, num2) + " �� �� ū ��");

	}

}
