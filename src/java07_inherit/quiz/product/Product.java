package java07_inherit.quiz.product;

//�߻� Ŭ������ �ۼ��ϱ�
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
	
//	public void out() { //	�޼ҵ带 �߻�ȭ ���״�
//	}
	
	public abstract void out(); // �߻�޼ҵ�� �ۼ��ϱ�
	// �߻�ȭ�� �޼ҵ带 ������ class�� �߻�ȭ���Ǿ��Ѵ�

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
