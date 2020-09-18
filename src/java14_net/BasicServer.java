package java14_net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BasicServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓 (접속 대기 소켓)
		Socket sock = null; // 통신 소켓
		
		PrintWriter out = null; //출력스트림
		
		try {
			servSock = new ServerSocket(3000);
			System.out.println("+ + + 서버 리슨 소켓 생성 + + +");
			
			System.out.println();
			System.out.println("--- 접속 대기중 ---");
			System.out.println(" Listen Port : " + servSock.getLocalPort());
			sock = servSock.accept(); //Listen, 클라이언트 접속 대기
			//accept부분에 무한루프를 걸면 계속돌 수 있다
			
			//------------------------------------------------------
			
			//------ BLOCKED -------
			
			//------ 접속한 클라이언트 정보 확인 ------
			System.out.println("클라이언트 접속 완료!");
			
			//클라이언트 IP정보 가져오기
			InetAddress clientIp = sock.getInetAddress();
			System.out.println("클라이언트 IP >> " + clientIp);
			System.out.println("클라이언트 Port >> " + sock.getPort());
			//-----------------------------------------
			
			
			//------ 데이터 통신 ------
			//	통신소켓인 sock객체로부터 입출력스트림을 얻어와서
			// 통신에 사용한다
			
			
			//출력스트림 제어 ( 서버 -> 클라이언트)
			
			//통신소켓 -> OutputStream -> PrintWriter 변환
			out = new PrintWriter(sock.getOutputStream());
			
			Scanner sc = new Scanner(System.in);
			String EOF = "";
			
			do {
				System.out.print("클라이언트에게 >> ");
				String msg = sc.nextLine();
				out.println(msg);
				out.flush();
			} while(EOF != "exit");
			//-------------------------
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
			try {
				sock.close(); //  통신 소켓 닫기
				servSock.close(); // 리슨 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
