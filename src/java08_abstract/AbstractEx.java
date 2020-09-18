package java08_abstract;

abstract class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	//�߻�޼ҵ�
	//���������� ������ �־���� �޼ҵ带 �߻������� ǥ��
	//�ڽ�Ŭ�������� ����� �����Ѵ�. (�������̵���Ŵ���ν�)
	public abstract void display();


}


class Professor extends Person {
	private String major;


	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public void display() {
		System.out.println("[����] " + name + ", " + major + "����");
	}

}

class Student extends Person {
	private String subject;

	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}

	@Override
	public void display() {
		System.out.println("[�л�] " + name + ", " + subject + "����");
	}


}


public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("Alice", "�ڹ�");
		Professor p = new Professor("Bob", "��ǻ�Ͱ���");
		
		s.display();
		p.display();
		
		System.out.println("-----------------------------------------");
		
		
		Person p1 = new Student("Clare", "�ڷᱸ��");
		Person p2 = new Professor("Clare", "��ǻ�Ͱ���");
		
		p1.display();
		p2.display();

		System.out.println("-----------------------------------------");
		
		Person[] arr = null; // Person �迭 ����
		arr = new Person[3];
		
		arr[0] = new Professor("Apple", "Banana");
		arr[1] = new Student("Cherry", "Durian");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) break;
			arr[i].display();
		}
		
		
		//�� for���� ���� ǥ��
		for(int i = 0; i < arr.length && arr[i] != null; i++) {
			arr[i].display();
		}

		System.out.println("-----------------------------------------");
		
		arr[2] = new Student("E", "Fruit");
		
		//foreach ����
//		for([�ڷ���] [����] : [�迭]) {
//			//�ݺ� �ڵ�
//			// �迭�� ��ҵ��� �ε��� �������
//			// �ϳ��� ������ �����ϸ鼭 �ݺ��Ѵ�
//		}
		
		for(Person data : arr) {
			data.display();
		}
		
		System.out.println("-----------------------------------------");
	
		int[] intArr = {1,2,3,4,5,6,7,8,9,0};
		
		for(int i : intArr) {
			System.out.println(i);
		}
		
		
	}

}
