package java02_operator;

public class BinaryEx_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���׿����� - ����(Assign)
		// =
		// �����ʿ� �ִ� ���� ���ʿ� �ִ� ������ ����
		// ��������� �����ʿ��� ����
		
		// ������ �켱������ ���� �������� �ִ� ������
		
		int num1 = 10;
		int num2 = 20;
		
		num1 = 11;
		num2 = 22;
		
		int num3 = num1;
		// int num3 = 11;
		
		int num4, num5, num6;
		
		// ���� �����ڴ� ���� ���� �� ������ ���� �����Ѵ�
		num6 = num5 = num4 = num3;
//		num6 = num5 = num4 = 11;
//		num6 = num5 = 11;
//		num6 = 11;
//		11;
		
		
		// ------------------------------------
		
		// ���մ��Կ����� - �������
		// += -= *= /= %=
		
		// ���ʿ� �ִ� ������ ���� �����ʿ� �ִ� ���� �����ϰ�
		// �� ����� ���ʿ� �ִ� ������ �����Ѵ�
		
		num1 = 13;
		num2 = 14;
		
		System.out.println("---������� ���� ��---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		num2 += num1; // num2 = num2 + num1;
	
		System.out.println("---������� ���� ��---");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// ���մ��Կ������� ���Կ����ȣ�� �׻� ������
		
		num2 -= 7;		// -= ������մ��Կ����� (���׿�����)
		num2 =   -7;	// - ������ȯ ������ (���׿�����)

		
	}

}
