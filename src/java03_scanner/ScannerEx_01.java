package java03_scanner;

import java.util.Scanner;

public class ScannerEx_01 {
	public static void main(String[] args) {
		
		//	class Scanner ( ��ĳ�� Ŭ����)
		//	Ű������ �Է��� �޾��ִ� ���
		
		//---------------------------------
		
		int num;	// ���� ����
		num = 123;	// ������ ����
		
		//---------------------------------
		
		//��Ű���� ������ Ŭ������ Ǯ����(Full Name)�� �̿��ؼ� ���
		Scanner input;	// �Է� ��ü ���� ����
		input = new Scanner(System.in); // �Է� ��ü ����
		
		int data;
		
		// Ű����� �Է��� �������� data ������ ����(����)�Ѵ�
		data = input.nextInt();
		
		System.out.println("�Է��� �� : " +data);
		
	}
}
