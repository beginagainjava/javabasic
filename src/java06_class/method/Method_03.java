package java06_class.method;

import java.util.Arrays;

public class Method_03 {
	
	
	

	//매개변수가 배열변수 (참조형)
	public void arrayTest01(int[] arr) {
		arr[2] = 200;
	}
	
	//매개변수가 int변수 (기본형)
	//arrayTest02 메소드의 변수 영역
	//stack 메모리 영역
	public void arrayTest02(int num) {

		num = 70;
	}
	
}
