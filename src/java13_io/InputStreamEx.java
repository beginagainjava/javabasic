package java13_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		InputStream is = System.in; //키보드 표준 입력 스트림
		
		byte[] buf = new byte[1024]; //입력 데이터의 임시 저장소
		
		int len = -1; //입력받은 데이터의 길이
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("<< 입력 대기중 >>");
		try {
			
			//입력 스트림에 입력받을 데이터가 존재하는 동안 반복
			while ((len = is.read(buf)) != -1 ) {
				
//				System.out.println(new String(buf, 0, len));
				sb.append(new String(buf, 0, len));
				
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				is.close(); // 스트림 닫기
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("<< 입력된 데이터 >>");
		System.out.println(sb);
	}
}
