package java06_class.uml;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("k5", "Black");
		car.display();
		
		System.out.println("---------");
		
		car.setModel("���");
		car.setColor("White");
		
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		
		System.out.println("---------");
		car.display();

	}

}
