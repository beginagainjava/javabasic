package java06_class.etc;


class Student {
	
	private String name;
	private int num;

	//디폴트 생성자
	public Student() { }
	
	//매개변수 있는 생성자
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
		Student s1 = new Student("행용",  1);
		
		//--------------------------------------
		
		Student[] stuArr; //Student 타입 배열 선언
		stuArr = new Student[3]; // Student 타입 배열 생성
		
		String[] stuName = {"Alice", "Alex", "James"};
		
		//배열을 이용한 객체 생성
		// 초기화 값이 모두 똑같이 적용될 수 있다
		for(int i = 0; i < stuArr.length; i++) {
			stuArr[i] = new Student(stuName[i], i+1); // 생성자 호출
			System.out.println(stuArr[i].getName() + " " + stuArr[i].getNum());
		}
		
	
		System.out.println("--------");

		//각각의 객체를 따로 생성
		// 초기화 값을 각각 설정할 수 있다
		stuArr[0] = new Student("Dave",  2);
		stuArr[1] = new Student("Bob",  3);
		stuArr[2] = new Student("Tom",  4);
		
		
		for(int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i].getName() + " " + stuArr[i].getNum());
		}
		
	}

}
