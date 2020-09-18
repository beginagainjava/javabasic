package java07_inherit.quiz.person;

import java07_inherit.quiz.product.Product;

public class Person {
	
	private String name;
	private int money;
	private Product prod;
	
//	private Product[] prods;	// 물건 배열
//	private int cnt;	//	물건 개수
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product prod) {
		
		if(this.money < prod.getPrice() ) {
			System.out.println("[SYSTEM] 소지금이 부족합니다");
			return;
		}
		this.prod = prod;
		this.money -= prod.getPrice();
		System.out.println(this.name +"님이 " + prod.getPrice() + "원을 지불하고 " + prod.getModel() + "구매함");
		System.out.println("[잔액] " + this.money + "원");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
