package java06_class.overloading;

public class Overloading_01 {
	
	//����ʵ�
	private int x;
	private int y;
	
	//����ʵ� ���
	public void display() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	//����ʵ� x,y�� ���� �����ϰ� �� �ڿ� ����ϱ�
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	//-------------------------------------
	
	// �����ε��� ������ Ư��
	
	public void display(double d) {
		
		
	}
	
	public void display(String str) {
		
	}

	
	// �Ű����������� ������ ����Ÿ�Ը� �ٸ� ��쿡��
	// �����ε��� �������� �ʴ´�
	
//	public int display() {
//		
//		return 0;
//	}

}
