package java05_array;

import java.util.Scanner;

public class ArrayQuiz_01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		5���� �ǹ��� �ο��� �Է� �޵��� ������ ��ü �ο���
//		�������� �ϰ� �Ͽ���.
//		���� �� ������ ������ �����Ѵ�.
//		(������� �ο��� 12000�� �̴�.)
//
//		��Ʈ . 
//		- �ʿ��� �迭
//		 1. ������ ��� �ο��� ��� �迭 arr[6]
//		   // 1~5�� �� ���ο� 
//		   (������ �迭������ �Է¹��� �ο��� �� ������ ���) 
//
//		 2. ������ ������ �迭 arr2[6]
//		   // 1~5�� �� �� ������ �ݾ� 
//		   (������ �迭������ �������� �� �հ�ݾ����� ���)

		
		int arr[] = new int[6];
		int arr2[] = new int[6];

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length -1; i++) {
			System.out.print(i+1 + "���� ��� �ο��� ? ");
			arr[i] = sc.nextInt();
			arr[5] += arr[i];
		}
		
		System.out.println("------------------------------");
		
		for(int i = 0; i < arr2.length -1; i++) {
			arr2[i] = arr[i] * 12000;
			System.out.println(i+1 + "���� �� ������ : " + arr2[i] + "��");
			arr2[5] += arr2[i];
		} System.out.println();
		
		System.out.println("�ǹ��� ��� �� �ο��� " + arr[5] + "���Դϴ�. ");
		System.out.println("�������� �� �ݾ��� " + arr2[5] + "�� �Դϴ�. ");
	}

}
