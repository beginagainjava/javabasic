package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
	public static void main(String[] args) {
		
		
		File file = new File("./src/java13_io/fileStream", "Hello");
		System.out.println("[TEST] exists : " + file.exists());
	
		//파일 입력 변수
		byte[] buf = new byte[1024]; //입력 데이터 버퍼
		int len = -1; //입력된 데이터 길이
		StringBuilder sb = new StringBuilder();	//데이터 저장소
		
		FileInputStream fis = null; //파일 입력 객체
		
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
		
		System.out.println("<< 입력된 데이터 >>");
		System.out.println(sb);
		
	}

}
