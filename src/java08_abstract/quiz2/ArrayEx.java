package java08_abstract.quiz2;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		Array ar = new Array();
		
		Scanner sc = new Scanner(System.in);
		int menu;
		do {
			System.out.println("=============="
					+ "\n1. �迭�߰�"
					+ "\n2. �迭����"
					+ "\n3. �迭Ž��"
					+ "\n4. ��Ұ˻�"
					+ "\n5. �迭���"
					+ "\n0.  ��  �� "
					+ "\n==============\n");
			
			System.out.print("���ϴ� �޴���ȣ�� �Է��ϼ��� >> ");
			menu = sc.nextInt();
			
			sc.nextLine();
			
			switch (menu) {
			case 1:
				System.out.print("�߰��� ��� �Է� >> ");
				ar.add(sc.nextLine());
				break;
				
			case 2:
				System.out.print("������ ��� �Է� >> ");
				ar.remove(sc.nextLine());
				break;
				
			case 3:
				System.out.print("�˻��� index �Է� >> ");
				System.out.println(ar.get(sc.nextInt()));
				break;
				
			case 4:
				System.out.print("�˻��� ��� �Է� >> ");
				System.out.println(ar.find(sc.nextLine()));
				break;
			
			case 5:
				ar.print();
				break;
				
			}
			System.out.println();
		} while(menu != 0);
		
//		ar.add("Apple");
//		ar.add("Banana");
//		ar.add("Cherry");
//		ar.add("Durian");
//		ar.add("Cherry");
//		ar.add("Cherry");
//		ar.add("Cherry");
//		ar.add("Cherry");
//		ar.add("Cherry");
//		ar.add("Cherry");
//		
//
//
//		ar.print(); // Apple, Banana, Cherry
//		System.out.println("----------");
//		
//		ar.remove("Banana");
//		ar.print(); // Apple, Cherry
//		System.out.println("----------");
//
//		System.out.println( ar.get(1) ); // Cherry
//		System.out.println( ar.get(2) ); // null
//		
//		System.out.println("----------");
//		
//		System.out.println( ar.find("Apple") ); // 0
//		System.out.println( ar.find("Banana") ); // -1
//		
//		System.out.println("----------");
		
		
	}
	
}










