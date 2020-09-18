package java10_collection;

//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Vector;
import java.util.*;

public class Collection_01_ArrayList {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		LinkedList list2 = new LinkedList();
		Vector list3 = new Vector();
		
		
		//--------------------------------------
		
		// �ڷᱸ������ ���� ���Ǵ� ����
		//	CRUD�۾�
		
		//	Create - �߰� / ���� / ����
		//	Read   - ��ȸ / Ž��
		//	Update - ���� / ����
		//	Delete - ���� / ����
		
		List list = new ArrayList();
		
		System.out.println("---- ���� ----");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println("\n---- ��ȸ ----");
		System.out.println("1��° ��� : " + list.get(1) );
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(i + "��° ��� : " + list.get(i));
		}
		
		System.out.println("\n---- ���� ----");
		list.remove(1);
		System.out.println(list);
		
		list.remove("Cherry");
		System.out.println(list);
		
		System.out.println("\n---- ���� ----");
		list.set(0, "Orange");
		System.out.println(list);
		
		System.out.println("\n---- isEmpty() ----");
		System.out.println(list.isEmpty());
		
		List l1 = null; // ����Ʈ �������� �ʾ���
		List l2 = new ArrayList(); // ����Ʈ�� �������
		
		
		System.out.println("\n------------");
		// l1 == null -> true
		// l1.isEmpty() -> NullPointerException
		
		// l2 == null -> false
		// l2.isEmpty() -> true
		
		System.out.println(l1);
		System.out.println(l2);
		
		if(l1 != null) { // ����Ʈ�� �����ߴ��� �˻�
			if(!l1.isEmpty()) { // ����Ʈ�� �����Ͱ� �ִ��� �˻�
				//l1 ����Ʈ ���
				
			}
		}
		
		System.out.println("\n---- clear() ----");
		System.out.println(list);
		list.clear();	// ��ü ����, ��� ��Ҹ� �����Ѵ�
		System.out.println(list);
		
	}

}
