package java06_class.field;

public class MemberField_01 {
	
	//��� �ʵ�
	private int num = 999;
	private String name = "Alice";
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printNum() {
		System.out.println( this.num );
	}
	
	// Source �޴� ���� ����Ű : alt + shift + s
	// Getters And Setters �ڵ����� ����Ű : alt + shift + s , r
	



}
