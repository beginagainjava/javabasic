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
		
		Socket sock = null; // Ŭ���̾�Ʈ ���� (����, ���)
		String serverIp = "192.168.10.3";
		int port = 4000;
		
		BufferedReader in = null; //���� �Է� ��Ʈ��
		PrintWriter InputData_Client = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");

			sock = new Socket(serverIp, port); //���� ����
			
			
			InputData_Client = new PrintWriter(sock.getOutputStream());
			
			
			String EOF = "";
			do {
				System.out.print("�������� �Ҹ� >> ");
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
			try { // �������� �ݴ°� ����ϱ�
				InputData_Client.close();
				sock.close(); // ���� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
