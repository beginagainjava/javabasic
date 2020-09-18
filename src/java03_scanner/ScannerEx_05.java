package java03_scanner;

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //	입력 객체
		PrintStream ps = new PrintStream(System.out); // 출력 객체
		
		ps.println("hi");
		
		System.out.println("--- 입력 ---");
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		sc.nextLine();	//	끊김 방지
		
		System.out.print("Input String : ");
		String str = sc.nextLine();
		
		System.out.println();
		System.out.println("--- 출력 ---");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
		

	}

}
