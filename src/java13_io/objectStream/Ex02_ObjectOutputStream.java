package java13_io.objectStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Ex02_ObjectOutputStream {
	
	public static void main(String[] args) {
		
		//��� ���� ��ü
		File file = new File(
				"./src/java13_io/objectstream"
				, "ObjectTest.ser");
		
		//��Ʈ�� ��ü ����
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			//��� ��� ����Ʈ
			List<Point> list = new ArrayList<>();
			
			list.add(new Point(11,22));
			list.add(new Point(123,456));
			list.add(new Point(555,666));
			
			oos.writeObject( list );	// ����Ʈ�� ��¿� ���
			oos.flush();	// ��� ���� ����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
