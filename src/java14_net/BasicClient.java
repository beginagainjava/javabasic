package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;

public class BasicClient {
	public static void main(String[] args) {
		
		Socket sock = null; // 클라이언트 소켓 (접속, 통신)
		String serverIp = "localhost";
		int port = 3000;
		
		BufferedReader in = null; //소켓 입력 스트림
		PrintWriter out = null;
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");

			sock = new Socket(serverIp, port); //서버 접속
			
			//------ 데이터 통신 ------
			//	통신소켓인 sock객체로부터 입출력스트림을 얻어와서
			// 통신에 사용한다
			
			// 입력 스트림 제어( 서버 -> 클라이언트 )
			
			// 소켓 -> InputStream -> Reader -> BufferedReader
			in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			//InputStreamReader 클래스
			// 바이트입력스트림을 문자입력스트림으로 변환해주는 기능
			
			
			String EOF = "";
			do {				
				String msg = in.readLine();
				EOF = msg;
				System.out.println(msg);
			} while(EOF != "exit");
			
			
			//-------------------------
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // 역순으로 닫는거 기억하기
				in.close(); // 스트림 닫기 
				sock.close(); // 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
