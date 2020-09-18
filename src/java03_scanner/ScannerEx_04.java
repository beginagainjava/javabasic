package java03_scanner;

import java.util.Iterator;
import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//	문자열 입력 처리 메소드 (기능)
		//	nextLine(), next()
		
		//	입력 객체 생성
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		
		//	문자열 입력
		System.out.println("Input String : ");
		
//		str1 = sc.nextLine();
//		str2 = sc.nextLine();
		
		str1 = sc.next();
		str2 = sc.next();
		
		System.out.print('\n');	// 개행코드
		System.out.println();	// 개행코드
		
		System.out.println("--- 출력 ----");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		
	}
}
