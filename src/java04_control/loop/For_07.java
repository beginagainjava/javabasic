package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		���� �ؾ��ϴ��� 
//			a. ���ݾ� �ι�� �ø���
//			b. �� �ݾ׿� ���ݾ��� ���ϱ�
		
		int money = 10;
		int account = 0;
		
		for(int i = 0; i < 15; i++) {
			
			account += money;
			money *= 2;
			
		}
		
		System.out.println("������ �� �ݾ� : " + account + "��");

	}

}
