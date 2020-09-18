package java06_class.method.quiz;

import java.util.Scanner;

public class CaculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
//		  2. 실행 클래스 ( class CaculatorEx )
//			- 기능 : 계산기 기능클래스를 이용
//				정수2개와 연산자 1개를 입력받음
//				switch로 구분하여 계산기클래스 이용하기
	//
//		ex) switch( operator ) {
//		    case '+':
//		      System.out.println(n1+"+"+n2+"="+calc.sum(n1,n2));
//		      break;
		
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("연산할 연산자를 입력 >> ");
		sc.nextLine();
		char operator = sc.nextLine().charAt(0);

		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		
		
		
		switch (operator) {
		
		case '+':
		      System.out.println(num1+" + "+num2+" = "+calc.sum(num1,num2));
		      break;
		      
		case '-':
		      System.out.println(num1+" - "+num2+" = "+calc.sub(num1,num2));
		      break;
		      
		case '*':
		      System.out.println(num1+" * "+num2+" = "+calc.mul(num1,num2));
		      break;
		      
		case '/':
		      System.out.println(num1+" / "+num2+" = "+calc.div(num1,num2));
		      break;
		
		}


	}

}
