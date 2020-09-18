package java05_array;

import java.util.Iterator;

public class Array_02 {
	public static void main(String[] args) {
		
		int num = 100; // 변수의 선언과 동시에 초기화
		
		//----------------------------------------------\
		
		//배열의 선언과 동시에 초기화
		
		int[] arr = { 1, 2, 3, 4, 5 };
		
		//위 코드와 같은 코드
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	
		//----------------------------------------------\

		char[] chArr = { 'a', 'p', 'p', 'l', 'e' };
		double[] dbArr = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		boolean[] bArr = { true, true, false, false, true };
		
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		for (boolean b : bArr) {
			System.out.println(b);
		}
	
	
	}

}
