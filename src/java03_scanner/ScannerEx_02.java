package java03_scanner;

import java.util.Scanner;

public class ScannerEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڿ� �Է¹ޱ�
		
		// 1. �Է°�ü ���� ���� (java.util.Scanner)
		
		Scanner in;
		
		// 2.�Է� ��ü ����(new)
		in = new Scanner(System.in);
		
		// 3. ���ڿ� �Է¹ޱ� (String)
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = in.nextLine();
		
		// 4. �Է¹��� ���ڿ� ����ϱ�
		System.out.println("�Է��� ���� : " + str);
		
		//--------------------------------------------
		
		// �⺻ ������Ÿ�Ե��� �Է¹ޱ� ���� ����ϴ� �޼ҵ�(���)��
		
//		int intNum = in.nextInt();
//		double doubleNum = in.nextDouble();
//		boolean bData = in.nextBoolean();
		
		// char�� ���� �Է� �޼ҵ�� ����
	}

}
