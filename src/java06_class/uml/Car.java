package java06_class.uml;

public class Car {
	
	// ����ʵ�
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
	
	// ������
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// ����޼ҵ�
	public void display() {
		System.out.println("�𵨸� : " + this.model + ", ���� : " + this.color);
	}
	

}
