package java08_abstract.interfaceEx;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();	// �������̽��� ������� �θ�Ŭ���� �ڵ� ������
		
		System.out.println("---------------");
		
		Parent p; // �θ�Ŭ���� ��ü ����
		p = new Child(); // �ڽ�Ŭ���� ��ü ����
		
		// �θ�Ŭ����Ÿ�� <- �ڽ�Ŭ����Ÿ��
		
		System.out.println("---------------");

		// implements�� �������̽��� �θ�����Ÿ������ �����޴´�
		
		Inter_01 i01 = new Child();
		Inter_01 i02 = new Child();
		
		i01.out();	// �ڽ�Ÿ�� �ν��Ͻ��� ���� ���ε�
		i02.out();	// �ڽ�Ÿ�� �ν��Ͻ��� ���� ���ε�
		
		
		
		
	}

}
