package java02_operator;

public class BinaryEx_01 {
	
	public static void main(String[] args) {
		
		//���׿����� - ���
//		+ - * / %
		
		int num1 = 17, num2 = 4;
		int result = num1 + num2; // ��� ���� ����
		
		result = num1 + num2; // ���� Ȱ��
		System.out.println(num1 + "�� " + num2 + "�� �հ� : " + result); // ���� ����
		
		
		//------------------------------------------------
//		������ ������
//		modular operator
//		mod
		result = num1 % num2;
		System.out.println("������ ���� ��� : " + result);
		
		System.out.println("--- ��� ������ ---");
		System.out.println("num1 + num2 = " + num1 + num2); // ���ϱ� X
		System.out.println("num1 + num2 = " + 17 + 4);
		System.out.println("num1 + num2 = 17" + 4);
		System.out.println("num1 + num2 = 174");
		
		System.out.println("num1 + num2 = " + (num1 + num2)); // ���ϱ�
		System.out.println("num1 - num2 = " + (num1 - num2)); // ����
		System.out.println("num1 * num2 = " + (num1 * num2)); // ���ϱ�
		System.out.println("num1 / num2 = " + (num1 / num2)); // ������
		System.out.println("num1 % num2 = " + (num1 % num2)); // ������
		
		// ��������� �ݵ�� �ǿ��ڵ��� ���� ������Ÿ���� ���� ���� ����
		// ��������� ����� �ǿ������� ������Ÿ������ ���´�
		
		System.out.println("----------����ȯ ��------------");
		System.out.println("num1 / num2 = " + (num1 / num2)); // ������
		System.out.println("----------����ȯ ��------------");
		System.out.println("num1 / num2 = " + ((double)num1 / (double)num2)); // ������
		
		System.out.println("----------------------");
		System.out.println("num1 / num2 = " + (num1 / (double)num2)); // int / double
//		System.out.println("num1 / num2 = " + (17 / (double)4)); // int / (double)int
//		System.out.println("num1 / num2 = " + (17 / 4.0)); // int / double
//		System.out.println("num1 / num2 = " + (17.0 / 4.0)); // double / double (�ڵ�����ȯ)
//		System.out.println("num1 / num2 = " + (4.25)); // double
		
		System.out.println("----------------------");
		
		double d = 3.14;
		
		System.out.println("d / 2 = " + (d/2));
		System.out.println("d % 2 = " + (d%2));
		System.out.printf("%.2f", d%2);
	}

}
