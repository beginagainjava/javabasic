package java05_array;

import java.util.Scanner;

public class ArrayQuiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "���� ��� �ο��� ? ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("------------------------------");
		
		int costSum = 0;
		for(int i = 0; i < arr.length; i++) {
			int cost = arr[i] * 12000;
			System.out.println(i+1 + "���� �� ������ : " + cost + "��");
			costSum += cost;
		} System.out.println();
		
		System.out.println("�ǹ��� ��� �� �ο��� " + sum + "���Դϴ�. ");
		System.out.println("�������� �� �ݾ��� " + costSum + "�� �Դϴ�. ");
	}

}
