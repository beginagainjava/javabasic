package java14_net.quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class File_Client {

	public static void main(String[] args) {
		
		Socket sock = null;
		String serverIp = "localhost";
		int port = 3000;
		
		File file = new File("./src/java14_net/quiz", "data.txt");
		FileInputStream in = null;
		OutputStream out = null;
		
		byte[] buf = new byte[1024];
		int len = -1;
		
		try {
			// 1. sock 생성
			sock = new Socket(serverIp, port);
			
			// 2. in 생성 ( 파일 입력 스트림 )
			in = new FileInputStream(file);
			
			// 3. out 생성 ( 네트워크 출력 스트림 )
			out = sock.getOutputStream();

			// 4. 파일 읽어서 보내기
			while((len = in.read(buf)) != -1) {
				out.write(buf, 0, len);
			}
			
//			out.write("Apple".getBytes(), 0, "Apple".length());
			
			
			out.flush();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				in.close();
				sock.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
