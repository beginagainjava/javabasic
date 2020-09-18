package java09_api;

public class StringBuilderEx {
	
	public static void info(StringBuilder sb) {
		
		System.out.println("length : " + sb.length());	// ����
		System.out.println("capacity : " + sb.capacity());	// �뷮
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("----StringBuilder ����-----");
		StringBuilder sb = new StringBuilder();
		info(sb);
		
		System.out.println("------ Apple �߰� ------");
		sb.append("Apple");
		System.out.println(sb);
		info(sb);
		
		System.out.println("------ Banana �߰� ------");
		sb.append("BananaBanana");
		System.out.println(sb);
		info(sb);
		
		System.out.println("------ Orange insert ------");
		sb.insert(5, "Orange");
		System.out.println(sb);
		
		System.out.println("------ deleteCharAt ------");
		sb.deleteCharAt(3);
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		
		//length��ŭ capacity�� ���δ�
		System.out.println("------ trimToSize ------");
		sb.trimToSize();
		info(sb);
		
		//���빰�� ������ �����´�
		System.out.println("------ reverse ------");
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
