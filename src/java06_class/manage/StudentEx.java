package java06_class.manage;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService ss = new StudentService();
		
		ss.insertInfo(); //�̸��� ���� �Է�
		
		ss.insertScore(); //������ ���� �Է�
		
		ss.printStu(); //�л� ���� ���
		
		
//		StudentService[] ssc = new StudentService[5];
//		
//		for(int i = 0; i < ssc.length; i++) {
//			ssc[i] = new StudentService();	// �ʱ�ȭ
//			
//			System.out.println(i+1 + "��° �л� ����");
//			ssc[i].insertInfo();
//			System.out.println(i+1 + "��° �л� ����");
//			ssc[i].insertScore();
//			
//		}
//		
//		System.out.println();
//		System.out.println("-----------------------------------------------------");
//		System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
//		for(int i = 0; i < ssc.length; i++) {
//			ssc[i].printStu();
//		}

		

	}

}
