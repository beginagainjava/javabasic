package java06_class.method.quiz;

import java.util.Scanner;

public class CalculatoreEx_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		
		String question = sc.nextLine();
		int num1 = (int)question.charAt(0);
		char operator = question.charAt(1);
		int num2 = (int)question.charAt(2);
		
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
