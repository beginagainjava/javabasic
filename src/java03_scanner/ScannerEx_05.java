package java03_scanner;

import java.io.PrintStream;
import java.util.Scanner;

public class ScannerEx_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //	�Է� ��ü
		PrintStream ps = new PrintStream(System.out); // ��� ��ü
		
		ps.println("hi");
		
		System.out.println("--- �Է� ---");
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		sc.nextLine();	//	���� ����
		
		System.out.print("Input String : ");
		String str = sc.nextLine();
		
		System.out.println();
		System.out.println("--- ��� ---");
		System.out.println("���� : " + num);
		System.out.println("���ڿ� : " + str);
		

	}

}
