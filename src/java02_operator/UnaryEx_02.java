package java02_operator;

public class UnaryEx_02 {
	public static void main(String[] args) {
		
		//	���׿����� - ����
		//	++ : ����������
		//	-- : ���ҿ�����
		
		//	�ǿ����ڷ� ����� ������ ���� 1 ����(����)��Ų��
		
		int num = 15;
		System.out.println(num);	// ������
		System.out.println(num--);	// Ȱ��		���� ����, ��ġ ����
		System.out.println(num);	// ���� ��
		
		
		num = 15;
		System.out.println(num);	// ������
		System.out.println(--num);	// Ȱ��		���� ����, ��ġ ����
		System.out.println(num);	// ���� ��
		
		
		num = 13;
		
		System.out.println( num++ - 10 + ++num ); 	// num == 13 �� ����
//		num = 14; System.out.println( 13 - 10 + ++num );		//num == 14 �� ����
//		System.out.println( 13 - 10 + 15 );			//num == 15 �� ����
//		System.out.println( 18 );			//num == 15 �� ����
		
	}
}
