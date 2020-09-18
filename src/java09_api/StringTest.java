package java09_api;

public class StringTest {

	public static void main(String[] args) {
		
		String str = new String("AppleBanana");
		
		if(str.contains("Banal")) {
			System.out.println("있어요");
		} else {
			System.out.println("없어요");
		}
		
		System.out.println(str.substring(1,3));
		System.out.println(str.replace('a','z'));
		System.out.println(str);
		System.out.println(str.replace("Apple", "Kiwi"));
		System.out.println(str);
		

	}

}
