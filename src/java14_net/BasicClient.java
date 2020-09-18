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
		
		Socket sock = null; // Ŭ���̾�Ʈ ���� (����, ���)
		String serverIp = "localhost";
		int port = 3000;
		
		BufferedReader in = null; //���� �Է� ��Ʈ��
		PrintWriter out = null;
		
		try {
			System.out.println("+ + + Ŭ���̾�Ʈ ���� + + +");

			sock = new Socket(serverIp, port); //���� ����
			
			//------ ������ ��� ------
			//	��ż����� sock��ü�κ��� ����½�Ʈ���� ���ͼ�
			// ��ſ� ����Ѵ�
			
			// �Է� ��Ʈ�� ����( ���� -> Ŭ���̾�Ʈ )
			
			// ���� -> InputStream -> Reader -> BufferedReader
			in = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));
			
			//InputStreamReader Ŭ����
			// ����Ʈ�Է½�Ʈ���� �����Է½�Ʈ������ ��ȯ���ִ� ���
			
			
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
			try { // �������� �ݴ°� ����ϱ�
				in.close(); // ��Ʈ�� �ݱ� 
				sock.close(); // ���� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
