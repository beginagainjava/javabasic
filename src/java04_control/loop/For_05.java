package java04_control.loop;

public class For_05 {
	public static void main(String[] args) {
		
		//	1���� 10���� ������ ���ϱ�
		
		//	�ݺ�Ƚ�� : 10
		//	�ݺ����� : 1 ~ 10
		
		//	�ʱ�� : int i = 1;
		//	���ǽ� : i <= 10;
		//	������ : i++
		
		// ** �ʿ��� ���� : int sum = 0;
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
 		System.out.println(sum);
 		
	}

}
