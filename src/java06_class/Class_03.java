package java06_class;

public class Class_03 {
	private int num;
	private String name;
	private double height;
	
	//setter 메소드 - private 변수에 값을 대입할 때 사용
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter 메소드 - private 변수의 값을 활용할 때 사용
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	

}
