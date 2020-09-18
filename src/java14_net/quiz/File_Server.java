package java14_net.quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class File_Server {

	public static void main(String[] args) {

		ServerSocket serv = null;
		Socket sock = null;
		File file = null;
		FileOutputStream out = null;

		InputStream in = null;

		int len = -1;
		byte[] buf = new byte[1024];
		
		int count = 1;


		try {
			// 1. serv 생성
			serv = new ServerSocket(3000); 
			
			while(true) {
				System.out.println("+ + + Client 기다리는중 + + +");

				// 2. Listen 및 sock 생성
				sock = serv.accept(); 
				System.out.println("+ + + Client 접속성공!! + + +");

				// 3. Remote 정보 출력
				InetAddress clientIp = sock.getInetAddress();
				System.out.println("[ IP 정보 ] : " + clientIp);
				System.out.println("[ Port 정보 ] : " + sock.getPort());

				// 4. in 생성
				in = sock.getInputStream();

				
				file = new File("./src/java14_net/quiz", "receive" + count + ".txt");
				// 5. out 생성
				out = new FileOutputStream(file);

				while((len = in.read(buf)) != -1) {
					out.write(buf, 0, len);
				}
				out.flush();
				
				System.out.println("+ + + 파일 전송완료!! + + +");
				System.out.println("\n--------------------------------");
				count++;
			}

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
