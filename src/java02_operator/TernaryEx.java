package java02_operator;

public class TernaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	���׿����� - ����
		//	���ǿ�����
		//	�������ǿ�����
		
		//	���ǽ�	? ���϶� ��ȯ�� : �����϶� ��ȯ��;
		//	**���ǽ� : true / false�� �Ǻ��� �� �ִ� �����
		
		int num1 = 10, num2 = 20;
		System.out.println( num1 > num2 ? "num1�� ũ��" : "num1�� �۴�" );
		
		//result�� ����Ǵ� ���� �ǹ̴�?
		int result = num1 > num2 ? num1 : num2 ; //	num1 �� num2 �� ū ���� ���
		System.out.println(result);

	}

}
