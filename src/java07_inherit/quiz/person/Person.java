package java07_inherit.quiz.person;

import java07_inherit.quiz.product.Product;

public class Person {
	
	private String name;
	private int money;
	private Product prod;
	
//	private Product[] prods;	// ���� �迭
//	private int cnt;	//	���� ����
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buy(Product prod) {
		
		if(this.money < prod.getPrice() ) {
			System.out.println("[SYSTEM] �������� �����մϴ�");
			return;
		}
		this.prod = prod;
		this.money -= prod.getPrice();
		System.out.println(this.name +"���� " + prod.getPrice() + "���� �����ϰ� " + prod.getModel() + "������");
		System.out.println("[�ܾ�] " + this.money + "��");
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
