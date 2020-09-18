package java05_array;

import java.util.Scanner;

public class ArrayQuiz_01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		5층인 건물의 인원을 입력 받도록 만든후 전체 인원이
//		나오도록 하게 하여라.
//		그후 각 층마다 관리비를 측정한다.
//		(관리비는 인원당 12000원 이다.)
//
//		힌트 . 
//		- 필요한 배열
//		 1. 각층의 사는 인원을 담는 배열 arr[6]
//		   // 1~5층 과 총인원 
//		   (마지막 배열공간은 입력받은 인원의 총 합으로 사용) 
//
//		 2. 각층의 관리비 배열 arr2[6]
//		   // 1~5층 과 총 관리비 금액 
//		   (마지막 배열공간은 관리비의 총 합계금액으로 사용)

		
		int arr[] = new int[6];
		int arr2[] = new int[6];

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length -1; i++) {
			System.out.print(i+1 + "층에 사는 인원은 ? ");
			arr[i] = sc.nextInt();
			arr[5] += arr[i];
		}
		
		System.out.println("------------------------------");
		
		for(int i = 0; i < arr2.length -1; i++) {
			arr2[i] = arr[i] * 12000;
			System.out.println(i+1 + "층의 총 관리비 : " + arr2[i] + "원");
			arr2[5] += arr2[i];
		} System.out.println();
		
		System.out.println("건물에 사는 총 인원은 " + arr[5] + "명입니다. ");
		System.out.println("관리비의 총 금액은 " + arr2[5] + "원 입니다. ");
	}

}
