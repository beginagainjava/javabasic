package java12_exception;

public class ExceptionEx_03 {
	public static void main(String[] args) {
		
		try {
			//try ���
			
			//���� �߻��� �����Ǵ� �ڵ�
			
			
		} catch (NullPointerException e) {
//			NullPointerException ó�� �ڵ�
			
		} catch (ArrayIndexOutOfBoundsException e) {
//			ArrayIndexOutOfBoundsException ó�� �ڵ�
			
		} catch (Exception e) {
			//catch ��� 
			
//			NullPointerException��
//			ArrayIndexOutOfBoundsException ���� ������ ����ó��
			
		} finally {
			// ������� �ʾƵ� ������ finally ���
			// try��Ͽ��� ���ܰ� �߻��ص�, �߻����� �ʾƵ�
			// finally����� �ݵ�� ����ȴ�
			
		}
		
		//--------------------------------------------------------
		
		//multi catch ����
		
		try {
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
//			NullPointerException��
//			ArrayIndexOutOfBoundsException�� ���ÿ� ó���ϱ�
			
		} catch (Exception e) {
			//���� ���� ó���ϱ�
			
		}
		
	
	}

}
