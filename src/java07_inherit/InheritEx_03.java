package java07_inherit;

class Animal {
	public void cry() {
		System.out.println("크르르르르");
	}
}

class Dog extends Animal {

	@Override
	public void cry() {
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal {
	
	@Override
	public void cry() {
		System.out.println("야옹");
	}
}

public class InheritEx_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.cry();
		c.cry();
		
		System.out.println("---------");
		
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.cry();
		a2.cry();
		
		System.out.println("---------");

		//다형성, Polymorphism
		//	하나의 메소드나 클래스 타입으로 다른 메소드나 클래스를
		//	대표해서 사용할 수 있는 특징
		//		-> 부모클래스타입으로 다양한 자식클래스타입을 대표한다
		
		Animal[] animals = new Animal[5];
		
		animals[0] = new Dog();
		animals[1] = new Dog();
		animals[2] = new Cat();
		animals[3] = new Dog();
		animals[4] = new Cat();
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].cry();
		}
		
		
		
	}

}
