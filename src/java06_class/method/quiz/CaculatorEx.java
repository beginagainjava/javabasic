package java06_class.method.quiz;

import java.util.Scanner;

public class CaculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
//		  2. ���� Ŭ���� ( class CaculatorEx )
//			- ��� : ���� ���Ŭ������ �̿�
//				����2���� ������ 1���� �Է¹���
//				switch�� �����Ͽ� ����Ŭ���� �̿��ϱ�
	//
//		ex) switch( operator ) {
//		    case '+':
//		      System.out.println(n1+"+"+n2+"="+calc.sum(n1,n2));
//		      break;
		
		Calculator calc = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		
		System.out.print("������ �����ڸ� �Է� >> ");
		sc.nextLine();
		char operator = sc.nextLine().charAt(0);

		System.out.print("�ι�° ���� �Է� >> ");
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
