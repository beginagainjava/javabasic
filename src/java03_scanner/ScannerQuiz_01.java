package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {

	public static void main(String[] args) {
//		�ﰢ������ ���ϱ�
//		�ﰢ������ = ( �غ� * ����) / 2
//		�غ��� ���̸� �Է¹޾� ���
		
//		1. �ʿ��� ���� ���� (������Ÿ�� �����ϱ�)
//		�ʿ��� ������ or �ʿ��� ��ü or ����� �Ϸ�� �� ���
//		
//		�ʿ��� ������ : �غ�, ����
		int height, base;
		
//		�ʿ��� ��ü : Scanner
		Scanner sc = new Scanner(System.in);
		
//		����� �Ϸ�� �� : ����
		double area = 0;
		
		
//		2. ������ �Է� ( �غ�, ���� )
		System.out.print("�غ��� �Է��ϼ��� : ");
		base = sc.nextInt();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		height = sc.nextInt();
		
//		3. ������ �־��� ��� ( ���� )
		area = (base * (double)height) / 2;
		
//		4. ������
		System.out.println("\n------ ��� ------");
		System.out.println("�غ��� ���̴� : " + base +
						   "\n������ ���̴� : " + height +
						   "\n�ﰢ���� ���̴� : " + area);
		
		
		if(base == height) {
			
			int max = height+1;
			
			for(int i = 0; i <= max; i++) {
				for(int j = 0; j <= i; j++) {
					if((i == 0 || i == max)&& (j == 0|| j == max)) {
						System.out.print("*");
					} else if ((j == 0) && (j != max)) {
						System.out.print("|");
					} else if (j == i) {
						System.out.print("\\");
					} else if (i == max) {
						System.out.print("-");
					} else {
						System.out.print(" ");
					}
					
				} System.out.println();
			}
		}

	}

}
