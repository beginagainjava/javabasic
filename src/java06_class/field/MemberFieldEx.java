package java06_class.field;

public class MemberFieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberField_01 mf01 = new MemberField_01();
		MemberField_01 mf02 = new MemberField_01();
		MemberField_01 mf03 = null;
		
//		System.out.println( mf01.num );
		System.out.println( mf01.getNum());
		System.out.println( mf01.getName());
		mf01.printNum();
		
		mf02.setNum(777);
		System.out.println(mf02.getNum());
		
//		System.out.println(mf03.getNum());
		
		
		// NullPointerException �߻�
		// null �������� �̿��Ͽ� ����� ������ �� �߻��Ѵ�
		// ��û��û ���� ���̴� ����!! - �� ����Ұ�
//		System.out.println( mf03.getNum());
		
		//-----------------------------------------------------
		
		System.out.println();
		System.out.println("------ Ŭ�������� �׽�Ʈ ------");
		
		MemberField_02 mf04 = new MemberField_02();
		MemberField_02 mf05 = new MemberField_02();

//static ��� �ʵ�� class ��ü�� �����ؾ��Ѵ�.

//		System.out.println( mf04.city );
//		System.out.println( mf05.city );
//		
//		mf04.city = "Busan";
//		System.out.println("--- Busan ���� ---");
//		
//		System.out.println( mf04.city );
//		System.out.println( mf05.city );
//		
//		MemberField_02.city = "Incheon";
//		System.out.println( MemberField_02.city );
		
		
		//���� ������ �Ϲ� �޼ҵ�(getter)�� ���� �����ϱ�
		System.out.println(mf04.getCity());
//		
		//��� �޼ҵ�� �� ��ü�� �̿��ؼ� ȣ��
		
		//���� �޼ҵ� ȣ�� ( Ŭ������ �̿��� ȣ���� ��������)
		System.out.println( MemberField_02.getCity() );
		
		
		MemberField_03 mf031 = new MemberField_03();
		
		mf031.method(0);

	}

}
