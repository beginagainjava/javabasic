package java07_inherit.quiz.product;

public class Computer extends Product{
	
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	@Override
	public void out() {
		System.out.println("Computer");
	}

}
