package java04_control.loop;

import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		    ....
//
//	- 어떤 수의 약수를 구하는 프로그램을 작성하여라
//		약수 = 어떤 수를 정수로 나눌 수 있는 수
//
//	- 1에서 1000까지의 정수중에서 4로 나누어도
//	 6으로 나누어도 나머지가 1인 수의 합을 출력하라.
//		> 41916
//
//	- 입력받은 두수의 최소 공배수와 최대 공약수를 구하는
//	 프로그램을 작성하라.
//		최소공배수 = 공배수 중에서 가장 작은 정수
//		최대공약수 = 공약수 중에서 절대치가 가장 큰 수
//
//	- 1에서부터 입력된 어떤 수까지 내에 있는 소수를
//	 찾는 프로그램을 작성하라.
//		* 소수 = 1 과 자신의 숫자로만 나누어 떨어지는 수
//		* ex) 2,3,5,7,11,13, ...
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
//		- 구구단 중 입력받은 수의 단수를 출력하여라
//		ex) Input >> 4
//
//		    4 x 1 = 4
//		    4 x 2 = 8
//		    4 x 3 = 12
		System.out.print("단을 입력해주세요 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + dan*i);
		}
		
		System.out.println("--------------------------------");
		
		System.out.print("약수를 구할 숫자를 입력해주세요 : ");
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
				System.out.println(num1 + "와 " + num2 + "의 최대공약수 : " + i);
				System.out.println(num1 + "와 " + num2 + "의 최소공배수 : " + num1*num2/i);
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
