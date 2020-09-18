package java13_io;

import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		OutputStream os = System.out;	// ǥ�� ��� ��Ʈ��
		
		byte[] buf = new byte[1024]; //	��� ������ ����
		
		int len = 0 ;  // ����� �ǹ��ִ� �������� ����
		
		buf[len++] = 'A';
		buf[len++] = 'p';
		buf[len++] = 'p';
		buf[len++] = 'l';
		buf[len++] = 'e';
		buf[len++] = '\n';
		
		
		try {
			os.write(buf, 0, len); // ���� �迭 ���
			os.flush(); // ���� ����(��� ��ġ���� ��������)
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
 