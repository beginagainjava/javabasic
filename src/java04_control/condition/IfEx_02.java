package java04_control.condition;

public class IfEx_02 {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		if( num == 10 ) {
			System.out.println("HI");
		}
		
		System.out.println("Hello");
		
		System.out.println("---------------------");
		// { } �߰�ȣ�� �ڵ带 �����ִ� ������ �Ѵ�
		// ���α׷� ���� ������ ������ ���� �ʴ´�
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		System.out.println("---------------------");
		
		// ����� ��� ������ ���� �� ���� ��ҿ��� ������ �ش�
		
		if(false) {
			System.out.println("if�� �ڵ� 1");			
		}
		System.out.println("if�� �ڵ� 2");
		
		System.out.println("---------------------");

		if(false) {
			System.out.println("if�� �ڵ� 1");			
			System.out.println("TEST 1");			
			System.out.println("TEST 2");			
			System.out.println("TEST 3");			
		}
		System.out.println("if�� �ڵ� 2");
		
		System.out.println("---------------------");
		
		// ��� �ڿ� ; ���̴� �� ����!
		if(false); {
			System.out.println("HI");
			System.out.println("Hello");
			System.out.println("Hola");
		}
		
	}

}
