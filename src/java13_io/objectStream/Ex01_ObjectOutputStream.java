package java13_io.objectStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex01_ObjectOutputStream {
	public static void main(String[] args) {
		
		// 출력 파일 객체
		File file = new File(
				"./src/java13_io/objectStream"
				, "ObjectTest.ser");
		
		// 스트림 선언
		FileOutputStream fos = null; //	파일출력스트림 - 1차스트림
		ObjectOutputStream oos = null; // 객체출력스트림 - 2차스트림
		
		
		try {
			fos = new FileOutputStream(file); //파일출력스트림 생성
			oos = new ObjectOutputStream(fos);	//객체출력스트림 생성
			
			//출력 대상 객체
			Point p1 = new Point(11, 22);
			Point p2 = new Point(111, 222);
			Point p3 = new Point(1111, 2222);
			
			oos.writeObject(p1);
			oos.flush();
			
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.flush();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
