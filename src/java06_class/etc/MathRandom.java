package java06_class.etc;

import java.util.Scanner;

public class MathRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// class java.lang.Math
		//	������� ����(���)�� �޼ҵ�� �����Ѵ�
		//	�޼ҵ���� ���� static���� ���ǵǾ��ִ� ...���� ��ü �������� �ٷ� ��밡��
		
		//0.0���� ũ�ų� ���� 1.0���� ���� Pseudorandom double �� ��ȯ
			System.out.println((int) (Math.random() * 10)+1); // 1 ~ 10
			
		// ** Pseudorandom (���� ����, ���� ����)
//				�ٸ糽(��¥) ����
		// ** pseudo (����, ����)
		
			
			System.out.println("-------");
			
			int com = (int) (Math.random() * 3); //0 ~ 2 �� ����
			
			Scanner sc = new Scanner(System.in);
			System.out.print("0 ~ 2 �߿��� ���纸���� >> ");
			int user = sc.nextInt();
			
			
			if(com == user) {
				System.out.println("���� ��");
			} else {
				System.out.println("�ٸ� ��");
			}
			
		
	}

}
