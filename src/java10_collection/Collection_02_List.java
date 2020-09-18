package java10_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_02_List {
	public static void main(String[] args) {
		
		List list = new LinkedList(); //연결리스트, 양방향
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		System.out.println("------------");
		
		List vect = new Vector();
		vect.add("A");
		vect.add("B");
		vect.add("C");
		System.out.println(vect);
		
		System.out.println(vect.size());
		
	}

}
