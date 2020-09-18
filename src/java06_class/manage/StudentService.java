package java06_class.manage;

import java.util.Scanner;

public class StudentService {
	
	private Student stu;
	private Scanner input;
	
	
	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
	}
	
	// 학생 정보를 입력하는 기능
	public void insertInfo() {
		System.out.print("이름을 입력하세요 >> ");
		stu.setName(input.nextLine());
		
		System.out.print("나이를 입력하세요 >> ");
		stu.setAge(input.nextInt());
		
	}
	
	// 3과목 점수를 입력하는 기능
	public void insertScore() {
		System.out.print("국어 점수를 입력하세요 >> ");
		stu.setKor(input.nextInt());
		input.nextLine();
		
		System.out.print("영어 점수를 입력하세요 >> ");
		stu.setEng(input.nextInt());
		input.nextLine();
		
		System.out.print("수학 점수를 입력하세요 >> ");
		stu.setMath(input.nextInt());
		input.nextLine();
		
	}
	
	// 총점 계산 기능
	public void calcSum() {
		
		stu.setSum(stu.getKor() + stu.getEng() + stu.getMath());
		
	}
	
	// 평균 계산 기능
	public void calcAvg() {
		
		stu.setAvg(Math.round((stu.getSum() / 3.0) * 100) / 100.0);
		
	}
	
	// 학생 정보를 출력하는 기능
	public void printStu() {
		
		calcSum();
		calcAvg();
		
		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("이름" + "\t" + "나이" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
		
		System.out.println(stu.getName() + "\t" + stu.getAge() + "\t" + stu.getKor() + "\t" + stu.getEng() + "\t" + stu.getMath() + "\t" + stu.getSum()  + "\t" + stu.getAvg());
		
	}
	

}

