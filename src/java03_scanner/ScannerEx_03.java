package java03_scanner;

import java.util.Scanner;

public class ScannerEx_03 {

	public static void main(String[] args) {
		
		//Scanner를 이용하여 char입력 처리하기
		//	String은 char형을 여러 모아놓은 타입
		
		//	String으로 입력을 받고 한 글자(문자)를 떼어낸다 -> char
		
		//--------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine(); // 문자열을 입력받아 str객체에 저장
		
		// 입력한 문자열 확인
		System.out.println("입력된 문자열 : " + str);
		
		char ch = str.charAt(0);
//		char low = str.toLowerCase().charAt(0);
		System.out.println("첫번째 입력된 문자열 : " + ch);
		
		System.out.println("-------------------------");
		
		System.out.print("성별을 입력하세요 : ");
		
//		String genderString = sc.nextLine();
//		char gender = genderString.charAt(0);
		
		char gender = sc.nextLine().charAt(0);
		System.out.println("입력한 성별 : " + gender);


	}

}
