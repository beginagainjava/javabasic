package java01_variables;

public class VariablesEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(777); //int�� ���ͷ� ��� 777
		
		// ������ ���ȭ
		final int Max;
		
//		** final Ű���� : ������ ���ȭ ��Ų��
//		������ ���� �� �ѹ��� �ʱ�ȭ�� �� �ֵ��� �����
		
		Max = 100; // �ѹ��� ���� �����ϴ�, ���Ŀ� 100 ������ ������
//		Max = 200; // ���� �ٽ� ���� �Ұ�
//		Max = 300; // ���� �ٽ� ���� �Ұ�

//		���������� �̸��ִ� ����� �̸��� ��� �빮�ڷ� �ۼ��Ѵ�
//		������� �ܾ� ������ _ �� �Ѵ�
//		ex) final int MAX_PEOPLE_COUNT;
//		
//		
//		---------------------------------
//		
//		�л����� ������ ���ϴ� ���α׷�
		
		final int STUDENT_NUM = 50; // ���ο�
		double avg = 1000 / STUDENT_NUM; // ���
		
	}

}
