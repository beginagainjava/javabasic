package java07_inherit;

class Parent4 {
	public int num = 111;
//	protected int num = 111;
//	private int num = 111; // private�� ��� �ڽ� Ŭ�������� ��� �Ұ���
	
	public Parent4() {
		System.out.println("�θ� ����Ʈ ������");
		
		//this - �ڱ� ���� ��ü
		System.out.println(this.num);
	}
	
}

class Child4 extends Parent4 {
	private int num = 222;
	
	public Child4() {
		System.out.println("�ڽ� ����Ʈ ������");
		
		System.out.println("this.num : " + this.num);
		System.out.println("super.num : " + super.num);
	}
}

public class InheritEx_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent4 p = new Parent4();
		
		System.out.println("------------------");
		
		Child4 c = new Child4();
		//	�θ� �����ڸ� ȣ���ϰ�
		//	�ڽ� �����ڸ� ȣ���Ѵ�


		
	}

}
