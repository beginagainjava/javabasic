package java13_io.file;

import java.io.File;

public class FileEx_01 {
	public static void main(String[] args) {
		
		// class File
		//	������ ������ �ٷ�� Ŭ����
		//	-> ������ ����´��(��ġ)�� ����� �� �ְ� ���ش�
		
		File file1 = new File("C:\\Users\\yeh01\\kh_workspace\\test.txt");
		
		System.out.println("file info : " + file1); //���� ���
		System.out.println("length : " + file1.length()); //ũ��
		System.out.println("exists : " + file1.exists()); //��������
		
	}
}
