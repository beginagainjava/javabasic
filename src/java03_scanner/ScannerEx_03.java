package java03_scanner;

import java.util.Scanner;

public class ScannerEx_03 {

	public static void main(String[] args) {
		
		//Scanner�� �̿��Ͽ� char�Է� ó���ϱ�
		//	String�� char���� ���� ��Ƴ��� Ÿ��
		
		//	String���� �Է��� �ް� �� ����(����)�� ����� -> char
		
		//--------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); // ���ڿ��� �Է¹޾� str��ü�� ����
		
		// �Է��� ���ڿ� Ȯ��
		System.out.println("�Էµ� ���ڿ� : " + str);
		
		char ch = str.charAt(0);
//		char low = str.toLowerCase().charAt(0);
		System.out.println("ù��° �Էµ� ���ڿ� : " + ch);
		
		System.out.println("-------------------------");
		
		System.out.print("������ �Է��ϼ��� : ");
		
//		String genderString = sc.nextLine();
//		char gender = genderString.charAt(0);
		
		char gender = sc.nextLine().charAt(0);
		System.out.println("�Է��� ���� : " + gender);


	}

}
