package java07_inherit.quiz.productEx;

import java07_inherit.quiz.person.Person;
import java07_inherit.quiz.product.Computer;
import java07_inherit.quiz.product.Product;
import java07_inherit.quiz.product.Tv;

public class ProductEx {
	public static void main(String[] args) {
		
		//01. Computer 클래스, Tv 클래스만 만들고 테스트 해보세요
		System.out.println("---상속 전 테스트-----------------");
		Computer c1 = new Computer("i7", 1000);
		c1.out();
		
		Tv t1 = new Tv("Canvas", 800);
		t1.out();
		
		//---------------------------------------------------------------
		
		//02. Product를만들고 상속시킨 후 테스트 해보세요
		System.out.println("---상속 후 테스트-----------------");
		Product p1 = new Computer("i5", 700);
		p1.out();
		
		Product p2 = new Tv("LG", 500);
		p2.out();
		
		//---------------------------------------------------------------
		
		//03. Product를만들고 상속시킨 후 테스트 해보세요
		System.out.println("---Product 배열 테스트------------");
		Product[] products = new Product[5];
	
		int count = 0;
		products[count++] = new Computer("com1", 100);
		products[count++] = new Tv("tv1", 200);
		products[count++] = new Tv("tv2", 300);
		
		for(int i=0; i<count; i++)
			products[i].out();
		
		System.out.println(count+"개 물건 구입");
		
		//---------------------------------------------------------------
		
		//04. Person까지 만들고 테스트 해보세요
		System.out.println("---Person------------");
		Person p = new Person("Alice", 1000);
		
		p.buy( new Tv("LG", 500) );
		
		p.buy( new Computer("i5", 1000) );
		
	}
}

















