package java04_control.condition;

import java.util.Arrays;
import java.util.Scanner;

public class IfBasicQuiz_02 {

//	 + ������ �Է� �޾� ���� ū ���� ����Ͻÿ�
//
//	 + �μ��� �Է� �޾� ���� ¦���̰�
//	  3�� ������� �Ǻ��Ͻÿ�
//
//	 + �� ������ ������ �Է� �޾� �հ�� ����� ���ϰ�
//	  ����� 90�̻��̸� ��A��, 80�̻��̸� ��B��,
//	  70 �̻��̸� ��C��, 60 �̻��̸� ��D��,
//	  60�̸��̸� ��F���� ����Ͻÿ�.

	public static void main(String[] args) {

		int num1, num2, num3;
		int sum;
		double avg;
		int arr[] = new int[3];
		String result;

		Scanner sc = new Scanner(System.in);

//		if( arr[0] > arr[1] ) {
//			if( arr[0] > arr[2] ) {
//				System.out.println("���� ū ����" + arr[0]);
//			} else {
//				System.out.println("���� ū ����" + arr[2]);
//			}
//		} else {
//			if ( arr[1] > arr[2] ) {				
//				System.out.println("���� ū ����" + arr[1]);
//			} else {
//				System.out.println("���� ū ����" + arr[2]);				
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ���ڸ� �Է��ϼ��� : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("1. ���� ū ���� : " + Math.max(Math.max(arr[0], arr[1]), arr[2]));

//		Arrays.sort(arr);
//		System.out.println("���� ū ���� [ " + arr[2] + " ] �Դϴ�.");
//		
		System.out.println("--------------------------------------");

		System.out.print("Input number1 : ");
		num1 = sc.nextInt();
		System.out.print("Input number2 : ");
		num2 = sc.nextInt();

		sum = num1 + num2;

		result = (sum % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println("[ " + num1 + " ]�� [ " + num2 + " ]�� ���� [ " + sum + " ]�� " + result + "�Դϴ�.");

		result = (sum % 3 == 0 && sum != 0) ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.";
		System.out.println("[ " + num1 + " ]�� [ " + num2 + " ]�� ���� [ " + sum + " ]�� " + result);

		// 2�� 3 �� ������� 6���� ó���ϸ� �� ������
		result = (sum % 6 == 0 && sum != 0) ? "¦���̸� 3�ǹ���Դϴ�." : "¦���� �ƴϰų� 3�ǹ���� �ƴմϴ�.";
		System.out.println("[ " + num1 + " ]�� [ " + num2 + " ]�� ���� [ " + sum + " ]�� " + result);

//		if(sum % 2 == 0) {
//			System.out.println("[ "+ num1 +" ]�� [ " + num2 + " ]�� ���� [ " + sum + " ]�� ¦���Դϴ�.");
//		} else {
//			System.out.println("[ "+ num1 +" ]�� [ " + num2 + " ]�� ���� [ " + sum + " ]�� Ȧ���Դϴ�.");
//		}

//		if(sum % 3 == 0 && sum != 0) {
//			System.out.println("[ "+ num1 +" ]�� [ " + num2 + " ]�� ���� [ " + sum + " ]�� 3�� ����Դϴ�.");
//		} else {
//			System.out.println("[ "+ num1 +" ]�� [ " + num2 + " ]�� ���� [ " + sum + " ]�� 3�� ����� �ƴմϴ�.");
//		}
		System.out.println("--------------------------------------");

//		System.out.print("Input number1 : ");
//		num1 = sc.nextInt();
//		System.out.print("Input number2 : ");
//		num2 = sc.nextInt();
//		System.out.print("Input number3 : ");
//		num3 = sc.nextInt();
//		
//		sum = num1 + num2 + num3;	
//		avg = sum / 3.0;

		sum = 0;
		for (int i = 0; i < arr.length; i++) {

			int warning = 0;
			do {
				if (warning == 1) {
					System.out.println("�� 0 ~ 100�� ������ ������ �Է��ϼ��� ��");
				}
				System.out.print((i + 1) + "��° ������ �Է��ϼ��� : ");
				arr[i] = sc.nextInt();
				warning = 1;
			} while (arr[i] < 0 || arr[i] > 100);

			sum += arr[i];
			warning = 0;
		}
		avg = sum / 3.0;

		System.out.println("���� : " + sum + ", ��� : " + Math.round(avg * 100) / 100.0);

		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
