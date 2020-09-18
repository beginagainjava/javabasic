package java04_control.condition;

import java.util.Arrays;
import java.util.Scanner;

public class IfBasicQuiz_02 {

//	 + 세수를 입력 받아 가장 큰 수를 출력하시오
//
//	 + 두수를 입력 받아 합이 짝수이고
//	  3의 배수인지 판별하시오
//
//	 + 세 과목의 성적을 입력 받아 합계와 평균을 구하고
//	  평균이 90이상이면 “A”, 80이상이면 “B”,
//	  70 이상이면 “C”, 60 이상이면 “D”,
//	  60미만이면 “F”를 출력하시오.

	public static void main(String[] args) {

		int num1, num2, num3;
		int sum;
		double avg;
		int arr[] = new int[3];
		String result;

		Scanner sc = new Scanner(System.in);

//		if( arr[0] > arr[1] ) {
//			if( arr[0] > arr[2] ) {
//				System.out.println("가장 큰 수는" + arr[0]);
//			} else {
//				System.out.println("가장 큰 수는" + arr[2]);
//			}
//		} else {
//			if ( arr[1] > arr[2] ) {				
//				System.out.println("가장 큰 수는" + arr[1]);
//			} else {
//				System.out.println("가장 큰 수는" + arr[2]);				
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요 : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("1. 가장 큰 수는 : " + Math.max(Math.max(arr[0], arr[1]), arr[2]));

//		Arrays.sort(arr);
//		System.out.println("가장 큰 수는 [ " + arr[2] + " ] 입니다.");
//		
		System.out.println("--------------------------------------");

		System.out.print("Input number1 : ");
		num1 = sc.nextInt();
		System.out.print("Input number2 : ");
		num2 = sc.nextInt();

		sum = num1 + num2;

		result = (sum % 2 == 0) ? "짝수" : "홀수";
		System.out.println("[ " + num1 + " ]와 [ " + num2 + " ]의 합인 [ " + sum + " ]은 " + result + "입니다.");

		result = (sum % 3 == 0 && sum != 0) ? "3의 배수입니다." : "3의 배수가 아닙니다.";
		System.out.println("[ " + num1 + " ]와 [ " + num2 + " ]의 합인 [ " + sum + " ]은 " + result);

		// 2와 3 의 공배수인 6으로 처리하면 더 빠르다
		result = (sum % 6 == 0 && sum != 0) ? "짝수이며 3의배수입니다." : "짝수가 아니거나 3의배수가 아닙니다.";
		System.out.println("[ " + num1 + " ]와 [ " + num2 + " ]의 합인 [ " + sum + " ]은 " + result);

//		if(sum % 2 == 0) {
//			System.out.println("[ "+ num1 +" ]와 [ " + num2 + " ]의 합인 [ " + sum + " ]은 짝수입니다.");
//		} else {
//			System.out.println("[ "+ num1 +" ]와 [ " + num2 + " ]의 합인 [ " + sum + " ]은 홀수입니다.");
//		}

//		if(sum % 3 == 0 && sum != 0) {
//			System.out.println("[ "+ num1 +" ]와 [ " + num2 + " ]의 합인 [ " + sum + " ]은 3의 배수입니다.");
//		} else {
//			System.out.println("[ "+ num1 +" ]와 [ " + num2 + " ]의 합인 [ " + sum + " ]은 3의 배수가 아닙니다.");
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
					System.out.println("※ 0 ~ 100점 사이의 점수를 입력하세요 ※");
				}
				System.out.print((i + 1) + "번째 성적을 입력하세요 : ");
				arr[i] = sc.nextInt();
				warning = 1;
			} while (arr[i] < 0 || arr[i] > 100);

			sum += arr[i];
			warning = 0;
		}
		avg = sum / 3.0;

		System.out.println("총합 : " + sum + ", 평균 : " + Math.round(avg * 100) / 100.0);

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
