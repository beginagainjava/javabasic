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
			System.out.print(i+1 + "층에 사는 인원은 ? ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		System.out.println("------------------------------");
		
		int costSum = 0;
		for(int i = 0; i < arr.length; i++) {
			int cost = arr[i] * 12000;
			System.out.println(i+1 + "층의 총 관리비 : " + cost + "원");
			costSum += cost;
		} System.out.println();
		
		System.out.println("건물에 사는 총 인원은 " + sum + "명입니다. ");
		System.out.println("관리비의 총 금액은 " + costSum + "원 입니다. ");
	}

}
