package java08_abstract.interfaceEx;

//�������̽�
interface TestInterface {
	public static final int NUM = 888;
	
	//interface������ ����� �߻�޼ҵ常 ���� �� �����Ƿ�
	//public static final Ű���尡 �տ� ��� �ڵ����� ����ȴ�
	int NUMBER = 100;
	
	//------------------------
	
	public abstract void out();
	
	//�޼ҵ忡 abstract Ű���尡 ��� �߻� �޼ҵ�� ���ǵȴ�
	public void display();
	
}


// �������̽��� ���(����)�ϰ� �ִ� Ŭ����
// -> �������̽��� ���ǵ� �߻�޼ҵ带 �ݵ�� �����ؾ��Ѵ�(�������̵�)
class Test implements TestInterface {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		
	}
	
}

//�߻�Ŭ�������� ����� �����ϰų� �߻�޼ҵ带 �����ϴ� ����
abstract class TestClass {
	public static final int MAX = 999; //	���
	
	public abstract void method(); //	�߻�޼ҵ�
}

class Childddd extends TestClass {
	public void method() {
		System.out.println("�߻�Ŭ���� ��ӹ޾���");
		
	};
}


public class InterfaceEx_01 {

	public static void main(String[] args) {
		
		TestClass tc1; //  ��ü ���� ����
		
//		tc1 = new TestClass(); // Error, �߻�Ŭ������ ��ü ���� �ȵ�
		
		
		System.out.println(TestClass.MAX);
		
		System.out.println("-------------------");
		
		// �������̽��� ����Ұ��
		// Ŭ������ ���� ��ü������ �������� �ʰ� �ٷ� ����� �� �ִ�
		System.out.println(TestInterface.NUM);
		System.out.println("-------------------");
		
		Childddd ch = new Childddd();
		System.out.println(ch.MAX);
		ch.method();
		
		
	}

}
