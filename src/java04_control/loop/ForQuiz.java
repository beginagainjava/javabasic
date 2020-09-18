package java04_control.loop;

import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		    ....
//
//	- � ���� ����� ���ϴ� ���α׷��� �ۼ��Ͽ���
//		��� = � ���� ������ ���� �� �ִ� ��
//
//	- 1���� 1000������ �����߿��� 4�� �����
//	 6���� ����� �������� 1�� ���� ���� ����϶�.
//		> 41916
//
//	- �Է¹��� �μ��� �ּ� ������� �ִ� ������� ���ϴ�
//	 ���α׷��� �ۼ��϶�.
//		�ּҰ���� = ����� �߿��� ���� ���� ����
//		�ִ����� = ����� �߿��� ����ġ�� ���� ū ��
//
//	- 1�������� �Էµ� � ������ ���� �ִ� �Ҽ���
//	 ã�� ���α׷��� �ۼ��϶�.
//		* �Ҽ� = 1 �� �ڽ��� ���ڷθ� ������ �������� ��
//		* ex) 2,3,5,7,11,13, ...
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
//		- ������ �� �Է¹��� ���� �ܼ��� ����Ͽ���
//		ex) Input >> 4
//
//		    4 x 1 = 4
//		    4 x 2 = 8
//		    4 x 3 = 12
		System.out.print("���� �Է����ּ��� : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
		
		System.out.println("--------------------------------");
		
		System.out.print("����� ���� ���ڸ� �Է����ּ��� : ");
		num = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			if( num % i == 0) {
				System.out.print(i + " ");
			}
		} System.out.println();
		
		System.out.println("--------------------------------");

		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			if(i % 4 == 1 && i % 6 == 1) {
				sum += i;
			}
		} System.out.println(sum);
		
		System.out.println("--------------------------------");
	
		System.out.print("Input Number1 : "); // 12 18 
		int num1 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int num2 = sc.nextInt();
		
		int result;
		for(int i = Math.min(num1, num2); i > 0 ; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(num1 + "�� " + num2 + "�� �ִ����� : " + i);
				System.out.println(num1 + "�� " + num2 + "�� �ּҰ���� : " + num1*num2/i);
				break;
			}
		}
		
		System.out.println("--------------------------------");

		System.out.print("Input Number : ");
		num = sc.nextInt();
		
		for(int i = 2; i <= num; i++) {
			for(int j = 2; j <= i; j++) {
				if(i % j == 0 && i != j) {
					break;
				}
				
				if(i == j) {
					System.out.print(i + " ");
				}
				
			}
		}

	}

}
