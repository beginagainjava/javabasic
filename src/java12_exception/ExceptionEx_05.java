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
			tt.method();  // ���ܰ� �߻��ϴ� �޼ҵ� ȣ��
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
