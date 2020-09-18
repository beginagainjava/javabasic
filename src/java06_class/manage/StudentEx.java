package java06_class.manage;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService ss = new StudentService();
		
		ss.insertInfo(); //이름과 나이 입력
		
		ss.insertScore(); //국영수 점수 입력
		
		ss.printStu(); //학생 정보 출력
		
		
//		StudentService[] ssc = new StudentService[5];
//		
//		for(int i = 0; i < ssc.length; i++) {
//			ssc[i] = new StudentService();	// 초기화
//			
//			System.out.println(i+1 + "번째 학생 정보");
//			ssc[i].insertInfo();
//			System.out.println(i+1 + "번째 학생 점수");
//			ssc[i].insertScore();
//			
//		}
//		
//		System.out.println();
//		System.out.println("-----------------------------------------------------");
//		System.out.println("이름" + "\t" + "나이" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균");
//		for(int i = 0; i < ssc.length; i++) {
//			ssc[i].printStu();
//		}

		

	}

}
