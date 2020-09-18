package java09_api;

public class MathEx {

	public static void main(String[] args) {

		
		//������ ���
		System.out.println(Math.PI);
		
		//-10�� ���밪
		System.out.println(Math.abs(-10));
		
		// 3.7�� �ø���
		System.out.println(Math.ceil(3.7));
		
		// 3.7�� ������
		System.out.println(Math.floor(3.7));
		
		// -3.7�� �ݿø���
		System.out.println(Math.round(-3.7));
		
		//2.1�� 3������
		System.out.println(Math.pow(2.1, 3));
		
		//3.14�� 3.141592 �� ū ��
		System.out.println(Math.max(3.14, 3.141592));
		
		System.out.println();
		
		// 0.0(����) ~ 1.0(����) ������ ����(����)
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 5); // 0.0(����) ~ 5.0(����)
		System.out.println((int)(Math.random() * 5)); // 0 ~ 4
		System.out.println((int)(Math.random() * 5)); // 1 ~ 5
		
		
		
	}

}
