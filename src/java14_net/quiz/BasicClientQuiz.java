package java14_net.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BasicClientQuiz {
	public static void main(String[] args) {
		
		Socket sock = null; // 클라이언트 소켓 (접속, 통신)
		String serverIp = "192.168.10.3";
		int port = 4000;
		
		BufferedReader in = null; //소켓 입력 스트림
		PrintWriter InputData_Client = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("+ + + 클라이언트 실행 + + +");

			sock = new Socket(serverIp, port); //서버 접속
			
			
			InputData_Client = new PrintWriter(sock.getOutputStream());
			
			
			String EOF = "";
			do {
				System.out.print("서버에게 할말 >> ");
				String msg = sc.nextLine();
				InputData_Client.println(msg);
				InputData_Client.flush();
				EOF = msg;
			} while(!EOF.equals("exit"));

			
			//-------------------------
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try { // 역순으로 닫는거 기억하기
				InputData_Client.close();
				sock.close(); // 소켓 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
