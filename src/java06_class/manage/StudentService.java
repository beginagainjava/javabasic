package java06_class.manage;

import java.util.Scanner;

public class StudentService {
	
	private Student stu;
	private Scanner input;
	
	
	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
	}
	
	// �л� ������ �Է��ϴ� ���
	public void insertInfo() {
		System.out.print("�̸��� �Է��ϼ��� >> ");
		stu.setName(input.nextLine());
		
		System.out.print("���̸� �Է��ϼ��� >> ");
		stu.setAge(input.nextInt());
		
	}
	
	// 3���� ������ �Է��ϴ� ���
	public void insertScore() {
		System.out.print("���� ������ �Է��ϼ��� >> ");
		stu.setKor(input.nextInt());
		input.nextLine();
		
		System.out.print("���� ������ �Է��ϼ��� >> ");
		stu.setEng(input.nextInt());
		input.nextLine();
		
		System.out.print("���� ������ �Է��ϼ��� >> ");
		stu.setMath(input.nextInt());
		input.nextLine();
		
	}
	
	// ���� ��� ���
	public void calcSum() {
		
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
		
	}
	
	// ��� ��� ���
	public void calcAvg() {
		
		stu.setAvg(Math.round((stu.getSum() / 3.0) * 100) / 100.0);
		
	}
	
	// �л� ������ ����ϴ� ���
	public void printStu() {
		
		calcSum();
		calcAvg();
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���");
		
		System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath() + "\t" + stu.getSum()  + "\t" + stu.getAvg());
		
	}
	

}

