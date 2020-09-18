package java07_inherit.quiz.product;

//추상 클래스로 작성하기
public abstract class Product {
	protected String model;
	protected int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
//	public void out() { //	메소드를 추상화 시켰다
//	}
	
	public abstract void out(); // 추상메소드로 작성하기
	// 추상화된 메소드를 가지면 class도 추상화가되야한다

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
