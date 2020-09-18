package java02_operator;

public class LogicalTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b = 6, c = 10, d;
		
		d = ++a * b--; 			// 6 * 6 ,a = 6, b = 5, d = 36
		System.out.println("a = " + a + ", b = " + b + ", d = " + d);
		
		d = a++ + ++c - b--;	//	6 + 11 - 5 , a = 7, b = 4, c = 11, d = 12
		System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

	}

}
