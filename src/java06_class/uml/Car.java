package java06_class.uml;

public class Car {
	
	// 멤버필드
	private String model;
	private String color;
	
	
	// getter & setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 생성자
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 멤버메소드
	public void display() {
		System.out.println("모델명 : " + this.model + ", 색상 : " + this.color);
	}
	

}
