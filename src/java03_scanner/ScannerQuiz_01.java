package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {

	public static void main(String[] args) {
//		삼각형넓이 구하기
//		삼각형넓이 = ( 밑변 * 높이) / 2
//		밑변과 높이를 입력받아 계산
		
//		1. 필요한 변수 선언 (데이터타입 생각하기)
//		필요한 데이터 or 필요한 객체 or 계산이 완료된 값 등등
//		
//		필요한 데이터 : 밑변, 높이
		int height, base;
		
//		필요한 객체 : Scanner
		Scanner sc = new Scanner(System.in);
		
//		계산이 완료된 값 : 넓이
		double area = 0;
		
		
//		2. 데이터 입력 ( 밑변, 높이 )
		System.out.print("밑변을 입력하세요 : ");
		base = sc.nextInt();
		
		System.out.print("높이를 입력하세요 : ");
		height = sc.nextInt();
		
//		3. 문제에 주어진 계산 ( 넓이 )
		area = (base * (double)height) / 2;
		
//		4. 결과출력
		System.out.println("\n------ 결과 ------");
		System.out.println("밑변의 길이는 : " + base +
						   "\n높이의 길이는 : " + height +
						   "\n삼각형의 넓이는 : " + area);
		
		
		if(base == height) {
			
			int max = height+1;
			
			for(int i = 0; i <= max; i++) {
				for(int j = 0; j <= i; j++) {
					if((i == 0 || i == max)&& (j == 0|| j == max)) {
						System.out.print("*");
					} else if ((j == 0) && (j != max)) {
						System.out.print("|");
					} else if (j == i) {
						System.out.print("\\");
					} else if (i == max) {
						System.out.print("-");
					} else {
						System.out.print(" ");
					}
					
				} System.out.println();
			}
		}

	}

}
