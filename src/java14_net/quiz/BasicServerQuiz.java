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
		
		ServerSocket servSock = null; // ���� ���� ���� (���� ��� ����)
		Socket sock = null; // ��� ����
		
		PrintWriter out = null; //��½�Ʈ��
		BufferedReader InputData_Server = null;
		
		try {
			servSock = new ServerSocket(3000);
			System.out.println("+ + + ���� ���� ���� ���� + + +");
			
			System.out.println();
			System.out.println("--- ���� ����� ---");
			System.out.println(" Listen Port : " + servSock.getLocalPort());
			sock = servSock.accept(); //Listen, Ŭ���̾�Ʈ ���� ���
			//------------------------------------------------------
			
			//------ BLOCKED -------
			
			//------ ������ Ŭ���̾�Ʈ ���� Ȯ�� ------
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�!");
			
			//Ŭ���̾�Ʈ IP���� ��������
			InetAddress clientIp = sock.getInetAddress();
			System.out.println("Ŭ���̾�Ʈ IP >> " + clientIp);
			System.out.println("Ŭ���̾�Ʈ Port >> " + sock.getPort());
			//-----------------------------------------
			InputData_Server = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			String EOF = "";

			do {
				String msg = InputData_Server.readLine();
				System.out.print("Ŭ���̾�Ʈ�� �Ѹ� >> ");
				System.out.println(msg);
				EOF = msg;
			} while(!EOF.equals("exit"));

			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				InputData_Server.close();
				sock.close(); //  ��� ���� �ݱ�
				servSock.close(); // ���� ���� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
