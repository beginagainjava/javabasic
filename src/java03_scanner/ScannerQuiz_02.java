package java03_scanner;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerQuiz_02 {
	public static void main(String[] args) {
		
//		학생 정보 관리 프로그램
//		이름 나이 성별 국어 영어 수학
//		6가지 정보를 저장할 수 있는 변수를 만들고
//		총점과 평균을 포함한 결과를 출력한다
		
		String name;
		char gender;
		int age, korean, english, math, sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(System.out);
		
		ps.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		ps.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		ps.print("성별을 입력하세요 : ");
		gender = sc.nextLine().charAt(0);
		
		ps.print("국어 성적을 입력하세요 : ");
		korean = sc.nextInt();
		
		ps.print("영어 성적을 입력하세요 : ");
		english = sc.nextInt();
		
		ps.print("수학 성적을 입력하세요 : ");
		math = sc.nextInt();
		
		sum = korean + english + math;
		avg = (double)sum / 3;
		
		ps.println("\n================= 출력 =================");
		ps.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		ps.print(name+"\t"+age+"\t"+gender+"\t"+korean+"\t"+english+"\t"+math+"\t"+sum+"\t");
		ps.printf("%.2f", avg);
		
	}

}
