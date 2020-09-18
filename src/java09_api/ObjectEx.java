package java09_api;

class Point implements Cloneable {
	
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", toString()=" + super.toString() + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if(this.x == ((Point) obj).x
				&& this.y == ((Point) obj).y) {
			return true;
		} 
		
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class ObjectEx {
	
	public static void main(String[] args) {
		Object obj = new Object();
		Point p1 = new Point(10, 20);
		
		System.out.println(obj);
		System.out.println(p1);
		System.out.println(p1.toString());
		
		System.out.println("------------ equals() -------------");
		
		Point p2 = new Point(11, 22);
		Point p3 = new Point(11, 22);
		Point p4 = p2;
		
		System.out.println("p2 : " + p2);
		System.out.println("p3 : " + p3);
		System.out.println("p4 : " + p4);
		
		// p2 - p3 : 동등 (같은 값을 가지고 있다, equality)
		// p2 - p4 : 동일 (같은 객체, identity)
		
		//동일성 비교 - 같은 객체인지 확인한다, == 연사자 이용
		System.out.println("p2 == p3 : " + (p2==p3) );
		System.out.println("p2 == p4 : " + (p2==p4) );
		
		//동등성 비교 - 같은 값을 가지고 있는지 확인한다. equals() 사용
		System.out.println("p2.equals(p3) : " + p2.equals(p3));
		System.out.println("p2.equals(p4) : " + p2.equals(p4));
		
		System.out.println("------------ hashCode() -------------");
		System.out.println("p2 : " + p2.hashCode());
		System.out.println("p3 : " + p3.hashCode());
		System.out.println("p4 : " + p4.hashCode());
		
		System.out.println("------------ hashCode() -------------");
		
		
		String s1 = new String("Apple");
		String s2 = new String("Apple");
		String s3 = new String("Banana");
		String s4 = s1;
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		
		System.out.println("------------ clone() -------------");

		Point p_ori = new Point(33,44);
		Point p_clone1 = p_ori; // 얕은 복사 shallow copy

		Point p_clone2 = new Point(p_ori.x, p_ori.y); // 생성자를 이용한 깊은 복사
		
		//-------------------------------------------------------------------------
		
		
		// clone()을 이용한 깊은 복사
		Point p_clone3 = null;
		try {
			p_clone3 = (Point) p_ori.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(p_clone3);
		
		System.out.println("p_ori.equlse(p_clone3) : "
				+ p_ori.equals(p_clone3));
		System.out.println("p_ori == p_clone3 : " + (p_ori == p_clone3));
		

	}

}
