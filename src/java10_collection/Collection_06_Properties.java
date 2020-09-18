package java10_collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Collection_06_Properties {
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			FileReader reader = new FileReader(
						"./src/java10_collection/user.properties");
			//	./ : 현재 프로그램이 실행된 폴더
			//		-> 프로젝트 폴더
			
			prop.load( reader );
			
			//파일의 내용을 읽어 메모리로 로드 완료
			//-------------------------------
			
			System.out.println(prop);
			
			//속성값 가져오기
			String user = prop.getProperty("username");
			System.out.println("USER : " + user);
			
			user = "Bob";
			
			prop.setProperty("username", user);
			System.out.println( prop );
			
			//----------------------------------------
			
			prop.store(
				new FileWriter("./src/java10_collection/user.properties")
				, "user information update");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}












