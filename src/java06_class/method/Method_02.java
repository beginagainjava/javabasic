package java06_class.method;

public class Method_02 {
	
	//�Ű����� X, ����Ÿ�� X
	public void method01() {
		System.out.println("�޼ҵ� ȣ��");
	}
	
	//------------------------------------
	//�Ű����� O, ����Ÿ�� X
	public void method02(int parameter) { // �Ű����� == parameter
		
		System.out.println("���޵� �� : " + parameter);

	}
	
	//-------------------------------------
	
	//�Ű����� X, ����Ÿ�� O
	public int returnNum() {
		return 777;
	}

	//-------------------------------------

	//�Ű����� O, ����Ÿ�� O
	public int plus(int n1, int n2) {
		return n1+n2;
	}

}
