package java14_net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class BasicServer {
	public static void main(String[] args) {
		
		ServerSocket servSock = null; // ���� ���� ���� (���� ��� ����)
		Socket sock = null; // ��� ����
		
		PrintWriter out = null; //��½�Ʈ��
		
		try {
			servSock = new ServerSocket(3000);
			System.out.println("+ + + ���� ���� ���� ���� + + +");
			
			System.out.println();
			System.out.println("--- ���� ����� ---");
			System.out.println(" Listen Port : " + servSock.getLocalPort());
			sock = servSock.accept(); //Listen, Ŭ���̾�Ʈ ���� ���
			//accept�κп� ���ѷ����� �ɸ� ��ӵ� �� �ִ�
			
			//------------------------------------------------------
			
			//------ BLOCKED -------
			
			//------ ������ Ŭ���̾�Ʈ ���� Ȯ�� ------
			System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�!");
			
			//Ŭ���̾�Ʈ IP���� ��������
			InetAddress clientIp = sock.getInetAddress();
			System.out.println("Ŭ���̾�Ʈ IP >> " + clientIp);
			System.out.println("Ŭ���̾�Ʈ Port >> " + sock.getPort());
			//-----------------------------------------
			
			
			//------ ������ ��� ------
			//	��ż����� sock��ü�κ��� ����½�Ʈ���� ���ͼ�
			// ��ſ� ����Ѵ�
			
			
			//��½�Ʈ�� ���� ( ���� -> Ŭ���̾�Ʈ)
			
			//��ż��� -> OutputStream -> PrintWriter ��ȯ
			out = new PrintWriter(sock.getOutputStream());
			
			Scanner sc = new Scanner(System.in);
			String EOF = "";
			
			do {
				System.out.print("Ŭ���̾�Ʈ���� >> ");
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
				sock.close(); //  ��� ���� �ݱ�
				servSock.close(); // ���� ���� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
