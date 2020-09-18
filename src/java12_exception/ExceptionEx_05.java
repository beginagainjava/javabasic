package java12_exception;

class ThrowsTest {
	public void method() throws Exception {
		
			throw new Exception();

	}
}

public class ExceptionEx_05 {
	public static void main(String[] args) {
		
		ThrowsTest tt = new ThrowsTest();
		
		try {
			tt.method();  // 예외가 발생하는 메소드 호출
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
