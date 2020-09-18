package java06_class.etc;


class Student {
	
	private String name;
	private int num;

	//����Ʈ ������
	public Student() { }
	
	//�Ű����� �ִ� ������
	public Student(String name, int num) { 
		this.name = name;
		this.num = num;
	}

	//Getters And Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	
	
}

public class ObjectArray {

	public static void main(String[] args) {
		Student s1 = new Student("���",  1);
		
		//--------------------------------------
		
		Student[] stuArr; //Student Ÿ�� �迭 ����
		stuArr = new Student[3]; // Student Ÿ�� �迭 ����
		
		String[] stuName = {"Alice", "Alex", "James"};
		
		//�迭�� �̿��� ��ü ����
		// �ʱ�ȭ ���� ��� �Ȱ��� ����� �� �ִ�
		for(int i = 0; i < stuArr.length; i++) {
			stuArr[i] = new Student(stuName[i], i+1); // ������ ȣ��
			System.out.println(stuArr[i].getName() + " " + stuArr[i].getNum());
		}
		
	
		System.out.println("--------");

		//������ ��ü�� ���� ����
		// �ʱ�ȭ ���� ���� ������ �� �ִ�
		stuArr[0] = new Student("Dave",  2);
		stuArr[1] = new Student("Bob",  3);
		stuArr[2] = new Student("Tom",  4);
		
		
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i].getName() + " " + stuArr[i].getNum());
		}
		
	}

}
