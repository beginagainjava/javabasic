package java07_inherit;

class Parent2 {
	public int num;
	
	public void display() {
		System.out.println("�θ� �޼ҵ�");
	}
}

class Child2 extends Parent2 {
	private int num;
	
	@Override
	public void display() {
		num = 100;
		
		System.out.println("�������̵� �޼ҵ�");

	}
	
}

public class InheritEx_02 {

	public static void main(String[] args) {

		Parent2 p = new Parent2();
		
		p.num = 333;
		p.display();
		
		Child2 c = new Child2();
//		c.num = 444;
		c.display();

		//ClassCastExceptio �߻�
		// �θ�Ŭ����Ÿ���� �ڽ�Ŭ����Ÿ������ ����ȯ�� �� ����
		// ���Ե� �Ұ�
		
//		Child2 cd = (Child2) new Parent2();
		
		//�θ�Ŭ����Ÿ�Կ� �ڽ�Ŭ����Ÿ���� ������ �� �ִ�
		Parent2 pc = new Child2(); // parengt2 <- child2
		
		// ���� ���ε�
		pc.display(); // ������ �ν��Ͻ��� Ÿ������ �޼ҵ尡 ȣ���

		
		
	}

}
