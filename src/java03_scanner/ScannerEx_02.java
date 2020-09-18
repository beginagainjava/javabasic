package java03_scanner;

import java.util.Scanner;

public class ScannerEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열 입력받기
		
		// 1. 입력객체 변수 선언 (java.util.Scanner)
		
		Scanner in;
		
		// 2.입력 객체 생성(new)
		in = new Scanner(System.in);
		
		// 3. 문자열 입력받기 (String)
		System.out.print("문자열을 입력하세요 : ");
		String str = in.nextLine();
		
		// 4. 입력받은 문자열 출력하기
		System.out.println("입력한 내용 : " + str);
		
		//--------------------------------------------
		
		// 기본 데이터타입들을 입력받기 위해 사용하는 메소드(기능)들
		
//		int intNum = in.nextInt();
//		double doubleNum = in.nextDouble();
//		boolean bData = in.nextBoolean();
		
		// char형 전용 입력 메소드는 없음
	}

}
