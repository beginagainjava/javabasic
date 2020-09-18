package java06_class.method;

import java.util.Arrays;

public class MethodEx {
	public static void main(String[] args) {
		
		Method_01 m01 = new Method_01();
		
		int sum = m01.add(44, 66);
		
		System.out.println(sum);
		
		Method_02 m02 = new Method_02();
		
		m02.method01();
		
		m02.method02(123);
		
		//전달하는 데이터 - 전달인자, 전달인수, 인자, 인수
		//	argument
		
		System.out.println("반환값 : " + m02.returnNum());
		
		System.out.println("덧셈 결과 : " + m02.plus(10,20));
		
		Method_03 m03 = new Method_03();
		
		int[] arr = new int[5];
		arr[2] = 100;
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------ 메소드 후 ------");
		m03.arrayTest01(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-----------------------"
				+ "");

		//main 메소드의 변수 영역
		//---- 값 복사 ----
		//stack 메모리 영역
		int num = 50;
		System.out.println(num);
		System.out.println("------ 메소드 후 ------");
		m03.arrayTest02(num);
		System.out.println(num);
	}

}
