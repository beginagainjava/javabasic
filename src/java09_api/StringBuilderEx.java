package java09_api;

public class StringBuilderEx {
	
	public static void info(StringBuilder sb) {
		
		System.out.println("length : " + sb.length());	// 길이
		System.out.println("capacity : " + sb.capacity());	// 용량
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("----StringBuilder 생성-----");
		StringBuilder sb = new StringBuilder();
		info(sb);
		
		System.out.println("------ Apple 추가 ------");
		sb.append("Apple");
		System.out.println(sb);
		info(sb);
		
		System.out.println("------ Banana 추가 ------");
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
		
		//length만큼 capacity를 줄인다
		System.out.println("------ trimToSize ------");
		sb.trimToSize();
		info(sb);
		
		//내용물의 순서를 뒤집는다
		System.out.println("------ reverse ------");
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
