package java07_inherit;


class Parent {
	String name;
	int num;
	
	public void display() {
		System.out.println("�θ� Ŭ������ �޼ҵ�");
	}
}

class Child extends Parent{
	int score;
	
	public void print() {
		System.out.println("�ڽ� Ŭ������ �޼ҵ�");
	}
	
	//�������� �޼ҵ� �����
	public void display() {
		System.out.println("��ӹ��� �޼ҵ��� ������");

	}
	//@Override - �������̵� ������̼�
	// �޼ҵ� ���� �������ָ� �ش� �޼ҵ尡 ��ҹ��� �޼ҵ带
	// �������ϴ� �ùٸ� �ڵ����� �����Ѵ�(�ƴϸ� ������)
	
}

public class InheritEx_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		
		p.name = "Alice";
		p.num = 123;
		p.display();
		
		System.out.println("----------");
		
		Child c = new Child();

		//��ӹ��� �����
		c.name = "Bob";
		c.num = 555;
		c.display();
		
		//�ڽ�Ŭ������ ������ �����
		c.score = 9999;
		c.print();
		

	}

}
