package java04_control.switchEx;

import java.util.Scanner;

public class DoWhile_Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		
		int select;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("========================");
			System.out.println("        M e n u");
			System.out.println("========================");
			System.out.println("  1. Hello World ���");
			System.out.println("  2. �̸� ���");
			System.out.println("  3. ���� ���");
			System.out.println("  4. ����");
			System.out.println("========================");
			
			System.out.print("���ϴ� �޴��� ��ȣ�� �Է��ϼ��� : ");
			select = sc.nextInt();
			
			switch(select) {
			case HELLO_MENU:
				System.out.println("Hello World");
				break;
			case NAME_MENU:
				System.out.println("�����");
				break;
			case GENDER_MENU:
				System.out.println("����");
				break;
			case EXIT_MENU:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("1,2,3,4 �� ������");
				break;
			} //switch end
			
			
		System.out.println();
		} while(select != EXIT_MENU); //do-while end

	} // main() end

} //class end
