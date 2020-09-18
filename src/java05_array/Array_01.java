package java05_array;

public class Array_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\
		
		int num;
		
		num = 123;
		
		//----------------
		// int형 배열 변수 선언

		int[] arr;	// 배열 변수 선언 (참조형)
		arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60;	//ArrayIndexOutOfBoundsException : 5
		
		
		//반복문을 이용한 배열값 대입
		for(int i = 0; i < 5; i++) {	// i, 0~4, 5번
			arr[i] = (i+1) * 100;
		}

		
		//반복문을 이용한 배열값 출력
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
		
		
		//배열의 이름을 출력하기
		System.out.println(arr); //[I@2a139a55 int형 배열이 at 주소 - 참조값, Reference
		
		
	}

}
