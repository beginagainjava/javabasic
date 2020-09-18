package java05_array;

public class Array_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열
		String st = "Apple";
		
		//-----------------------
		
		String[] strArr; //문자열 배열 선언
		strArr = new String[3]; //배열 생성
		
		//배열에 값 대입
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		for(String s : strArr) {
			System.out.println(s);
		}
		System.out.println(strArr.length);
		System.out.println("------");

	
	}

}
