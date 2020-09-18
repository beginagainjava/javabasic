package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		
		File file = new File("./src/java13_io/fileStream", "Hello");
		System.out.println("[TEST] exists : " + file.exists());
	
		//���� �Է� ����
		byte[] buf = new byte[1024]; //�Է� ������ ����
		int len = -1; //�Էµ� ������ ����
		StringBuilder sb = new StringBuilder();	//������ �����
		
		FileInputStream fis = null; //���� �Է� ��ü
		
		try {
			fis = new FileInputStream(file);
			
			while ((len = fis.read(buf)) != -1) {
				sb.append(new String(buf, 0, len));
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("<< �Էµ� ������ >>");
		System.out.println(sb);
		
	}

}
