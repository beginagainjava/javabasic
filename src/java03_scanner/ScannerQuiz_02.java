package java03_scanner;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerQuiz_02 {
	public static void main(String[] args) {
		
//		�л� ���� ���� ���α׷�
//		�̸� ���� ���� ���� ���� ����
//		6���� ������ ������ �� �ִ� ������ �����
//		������ ����� ������ ����� ����Ѵ�
		
		String name;
		char gender;
		int age, korean, english, math, sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out);
		
		ps.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		ps.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		ps.print("������ �Է��ϼ��� : ");
		gender = sc.nextLine().charAt(0);
		
		ps.print("���� ������ �Է��ϼ��� : ");
		korean = sc.nextInt();
		
		ps.print("���� ������ �Է��ϼ��� : ");
		english = sc.nextInt();
		
		ps.print("���� ������ �Է��ϼ��� : ");
		math = sc.nextInt();
		
		sum = korean + english + math;
		avg = (double)sum / 3;
		
		ps.println("\n================= ��� =================");
		ps.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
		ps.print(name+"\t"+age+"\t"+gender+"\t"+korean+"\t"+english+"\t"+math+"\t"+sum+"\t");
		ps.printf("%.2f", avg);
		
	}

}
