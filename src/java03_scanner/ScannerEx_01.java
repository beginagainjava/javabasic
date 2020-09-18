package java03_scanner;

import java.util.Scanner;

public class ScannerEx_01 {
	public static void main(String[] args) {
		
		//	class Scanner ( 스캐너 클래스)
		//	키보드의 입력을 받아주는 기능
		
		//---------------------------------
		
		int num;	// 변수 선언
		num = 123;	// 변수값 대입
		
		//---------------------------------
		
		//패키지를 포함한 클래스의 풀네임(Full Name)을 이용해서 사용
		Scanner input;	// 입력 객체 변수 선언
		input = new Scanner(System.in); // 입력 객체 생성
		
		int data;
		
		// 키보드로 입력한 정수값을 data 변수에 대입(저장)한다
		data = input.nextInt();
		
		System.out.println("입력한 값 : " +data);
		
	}
}
