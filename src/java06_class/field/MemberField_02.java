package java06_class.field;

public class MemberField_02 {
	
	private static String city = "Seoul";
//	public static String city = "Seoul";
	
	
	// city Getter
//	public String getCity() {
//		return city;
//	}
	
	//���� �޼ҵ�, static �޼ҵ�
//	���� �޼ҵ� ȣ�� ( Ŭ������ �̿��� ȣ���� ��������)
	public static String getCity() {
		return city;
	}
	
	//------------------------------------------
	
	private int num; //�ν��Ͻ� ����
	
//	public static void test() { //���� �޼ҵ�
//		System.out.println( num );
//	}
	
	//�����޼ҵ忡�� �ν��Ͻ� ���� ��� �Ұ�
	
	//------------------------------------------
	
	private static int num2;
	
	public void test2() {
		System.out.println(num2);
	}
	
	//�Ϲ� �޼ҵ忡�� ���� ��������ϴ� ���� ��������
	
	//-----------------------------------------------
	

}
