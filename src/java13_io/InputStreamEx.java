package java13_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		InputStream is = System.in; //Ű���� ǥ�� �Է� ��Ʈ��
		
		byte[] buf = new byte[1024]; //�Է� �������� �ӽ� �����
		
		int len = -1; //�Է¹��� �������� ����
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("<< �Է� ����� >>");
		try {
			
			//�Է� ��Ʈ���� �Է¹��� �����Ͱ� �����ϴ� ���� �ݺ�
			while ((len = is.read(buf)) != -1 ) {
				
//				System.out.println(new String(buf, 0, len));
				sb.append(new String(buf, 0, len));
				
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				is.close(); // ��Ʈ�� �ݱ�
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("<< �Էµ� ������ >>");
		System.out.println(sb);
	}
}
