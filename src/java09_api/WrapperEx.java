package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		
		int i1 = 10;
		Integer iVal1 = new Integer(i1); // ¹Ú½Ì, Boxing
		Integer iVal2 = new Integer("123"); // ¹Ú½Ì, Boxing
		Integer iVal3 = new Integer(4567); // ¹Ú½Ì, Boxing
		
		System.out.println(iVal1);
		System.out.println(iVal2);
		System.out.println(iVal3);
		
		System.out.println("-----------");
		
		
		int i2 = iVal2.intValue(); // ¾ð¹Ú½Ì, Unboxing
		
		System.out.println("-----------");

		Integer iVal4 = 1234; // ¿ÀÅä ¹Ú½Ì, Auto Boxing
		Double dVal1 = 3245.1234;
		
		int i4 = iVal4; // ¿ÀÅä ¾ð¹Ú½Ì, Auto Unboxing
		double d1 = dVal1;
		
		System.out.println("-----------");
		
		System.out.println("BYTES : " + Integer.BYTES);
		System.out.println("SIZE : " + Integer.SIZE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		
		System.out.println("-----------");
		
		int num1 = Integer.parseInt("1234");
		
		//¼ýÀÚÇü½Ä(Number Format)¸¸ °¡´ÉÇÏ´Ù
//		int num1 = Integer.parseInt("1234ABC");
		
		
	}

}
