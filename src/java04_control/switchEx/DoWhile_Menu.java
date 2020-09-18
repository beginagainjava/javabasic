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
			System.out.println("  1. Hello World 출력");
			System.out.println("  2. 이름 출력");
			System.out.println("  3. 성별 출력");
			System.out.println("  4. 종료");
			System.out.println("========================");
			
			System.out.print("원하는 메뉴의 번호를 입력하세요 : ");
			select = sc.nextInt();
			
			switch(select) {
			case HELLO_MENU:
				System.out.println("Hello World");
				break;
			case NAME_MENU:
				System.out.println("신행용");
				break;
			case GENDER_MENU:
				System.out.println("남자");
				break;
			case EXIT_MENU:
				System.out.println("종료합니다.");
				break;
			default:
				System.out.println("1,2,3,4 중 고르세요");
				break;
			} //switch end
			
			
		System.out.println();
		} while(select != EXIT_MENU); //do-while end

	} // main() end

} //class end
