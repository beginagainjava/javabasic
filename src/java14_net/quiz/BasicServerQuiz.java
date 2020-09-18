package java14_net.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BasicServerQuiz {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // 서버 리슨 소켓 (접속 대기 소켓)
		Socket sock = null; // 통신 소켓
		
		PrintWriter out = null; //출력스트림
		BufferedReader InputData_Server = null;
		
		try {
			servSock = new ServerSocket(3000);
			System.out.println("+ + + 서버 리슨 소켓 생성 + + +");
			
			System.out.println();
			System.out.println("--- 접속 대기중 ---");
			System.out.println(" Listen Port : " + servSock.getLocalPort());
			sock = servSock.accept(); //Listen, 클라이언트 접속 대기
			//------------------------------------------------------
			
			//------ BLOCKED -------
			
			//------ 접속한 클라이언트 정보 확인 ------
			System.out.println("클라이언트 접속 완료!");
			
			//클라이언트 IP정보 가져오기
			InetAddress clientIp = sock.getInetAddress();
			System.out.println("클라이언트 IP >> " + clientIp);
			System.out.println("클라이언트 Port >> " + sock.getPort());
			//-----------------------------------------
			InputData_Server = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			String EOF = "";

			do {
				String msg = InputData_Server.readLine();
				System.out.print("클라이언트가 한말 >> ");
				System.out.println(msg);
				EOF = msg;
			} while(!EOF.equals("exit"));

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				InputData_Server.close();
				sock.close(); //  통신 소켓 닫기
				servSock.close(); // 리슨 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
