package java06_class;

public class Class_03 {
	private int num;
	private String name;
	private double height;
	
	//setter �޼ҵ� - private ������ ���� ������ �� ���
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter �޼ҵ� - private ������ ���� Ȱ���� �� ���
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
