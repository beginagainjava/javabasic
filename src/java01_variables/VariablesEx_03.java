package java01_variables;


public class VariablesEx_03 {
	public static void main(String[] args) {
		
		// ���� ���� - double�� height ����
		double height; // Ű
		
		// ������ �� ����
		height = 200.5;
		
		// ������ �� ���
		// ������ ����� ���� Ȱ���Ѵ�
		System.out.println("height ������ ���� : " + height);
		
		// height ���� Ȱ�� - ������ ���� �ҷ��ͼ� ġȯ��
		System.out.println("height ������ ���� : " + 200.5);
		
		// ���ڿ��� 200.5 �� �ϳ��� ���ڿ��� ���� ��Ŵ
		System.out.println("height ������ ���� : 200.5");
		
		// + ��ȣ : ����(���ڿ�) ���� ���
		
		// --------------------------------------------------------
		
		double data;
		
		data = height + 100; // ����
//		data = 200.5 + 100;
//		data = 300.5;
		
		System.out.println(data);
		
		// --------------------------------------------------------
		
		char alpha;
		alpha = 'T'; // 84
		// char�� ���� ���� 1���� ǥ���� �� ' '�� �����ش�
		
		System.out.println(alpha);

		// --------------------------------------------------------
		
		boolean isEmpty;
		isEmpty = true; // ��
		isEmpty = false; // ����
		// boolean���� true / false �� ���� ���� ������ �� �ִ�
		
		System.out.println(isEmpty);

	}

}