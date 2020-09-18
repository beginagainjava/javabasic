package java06_class.field;

public class MemberField_01 {
	
	//멤버 필드
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
	
	// Source 메뉴 띄우는 단축키 : alt + shift + s
	// Getters And Setters 자동생성 단축키 : alt + shift + s , r
	



}
