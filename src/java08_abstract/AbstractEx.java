package java08_abstract;

abstract class Person {
	protected String name;

	public Person(String name) {
		this.name = name;
	}

	//추상메소드
	//개념적으로 가지고 있어야할 메소드를 추상적으로 표현
	//자식클래스에서 제대로 구현한다. (오버라이딩시킴으로써)
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
		System.out.println("[교수] " + name + ", " + major + "전공");
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
		System.out.println("[학생] " + name + ", " + subject + "수강");
	}


}


public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("Alice", "자바");
		Professor p = new Professor("Bob", "컴퓨터공학");
		
		s.display();
		p.display();
		
		System.out.println("-----------------------------------------");
		
		
		Person p1 = new Student("Clare", "자료구조");
		Person p2 = new Professor("Clare", "컴퓨터과학");
		
		p1.display();
		p2.display();

		System.out.println("-----------------------------------------");
		
		Person[] arr = null; // Person 배열 선언
		arr = new Person[3];
		
		arr[0] = new Professor("Apple", "Banana");
		arr[1] = new Student("Cherry", "Durian");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) break;
			arr[i].display();
		}
		
		
		//위 for문과 같은 표현
		for(int i = 0; i < arr.length && arr[i] != null; i++) {
			arr[i].display();
		}

		System.out.println("-----------------------------------------");
		
		arr[2] = new Student("E", "Fruit");
		
		//foreach 구문
//		for([자료형] [변수] : [배열]) {
//			//반복 코드
//			// 배열의 요소들을 인덱스 순서대로
//			// 하나씩 변수에 대입하면서 반복한다
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
