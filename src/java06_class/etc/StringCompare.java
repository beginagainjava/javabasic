package java06_class.etc;

public class StringCompare {
	public static void main(String[] args) {
		
		String str1 = "Apple";
		
		if(str1 == "Apple") {
			System.out.println("사과");
		} else {
			System.out.println("X");
		}
		
		String str2 = new String("Apple");
		if(str2.equals("Apple")) {
			System.out.println("사과!");
		} else {
			System.out.println("X");
		}
		
		//문자열을 비교할 때에는 == 연산자를 사용하면 안된다
		//문자열객체 .equals(비교문자열) 을 이용해야한다
		
		// equals() 메소드를 사용했을 때
		// 같은 문자열이면 true반환
		// 다른 문자열이면 false반환
				
	}

}
