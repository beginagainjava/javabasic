package java07_inherit.quiz.product;

public class Tv extends Product {
	
	public Tv(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void out() {
		System.out.println("TV");
	}

}
