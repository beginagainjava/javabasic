package java13_io.fileStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOutputStreamEx {
	public static void main(String[] args) {
		
		
		//��� ��� ����
		File file = new File("./src/java13_io/fileStream", "Result");
		System.out.println("[TEST] exists : " + file.exists());
		
		//���� ��� ��Ʈ�� ��ü
		FileOutputStream fos = null;
		
		
		try {
			fos = new FileOutputStream(file);

			fos.write("Apple".getBytes(), 0, "Apple".length());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
