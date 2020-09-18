package java06_class.defaultTest;

import java06_class.Class_02;

public class Main_02_default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class_02 cl = new Class_02();
		
//		System.out.println(cl.num1); // private
//		System.out.println(cl.num2); // default
//		System.out.println(cl.num3); // protected 
		
		//public만 접근가능
		System.out.println(cl.num4); // public
		
	}

}
