package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {
		
		//break;
		//	����� �ߴܽ�Ű�� ������ �����ϴ� �ڵ�
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
			
			if ( i >= 5) { 
				break;	//for�� �ߴ��ڵ�
			}
		}
		
		System.out.println("----------------------------");
		
		
		//continue;
		//	�ݺ������� ���Ǵ� ��Ÿ���
		
		for(int i = 0; i < 10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
