package java13_io;

import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		
		OutputStream os = System.out;	// 표준 출력 스트림
		
		byte[] buf = new byte[1024]; //	출력 데이터 버퍼
		
		int len = 0 ;  // 출력할 의미있는 데이터의 길이
		
		buf[len++] = 'A';
		buf[len++] = 'p';
		buf[len++] = 'p';
		buf[len++] = 'l';
		buf[len++] = 'e';
		buf[len++] = '\n';
		
		
		try {
			os.write(buf, 0, len); // 버퍼 배열 출력
			os.flush(); // 버퍼 비우기(출력 장치까지 내보내기)
			
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
 