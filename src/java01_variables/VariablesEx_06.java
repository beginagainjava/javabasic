package java01_variables;

public class VariablesEx_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(777); //int형 리터럴 상수 777
		
		// 변수의 상수화
		final int Max;
		
//		** final 키워드 : 변수를 상수화 시킨다
//		변수의 값을 딱 한번만 초기화할 수 있도록 만든다
		
		Max = 100; // 한번만 대입 가능하다, 이후엔 100 값으로 고정됨
//		Max = 200; // 에러 다시 대입 불가
//		Max = 300; // 에러 다시 대입 불가

//		관례적으로 이름있는 상수의 이름은 모두 대문자로 작성한다
//		상수명의 단어 구분은 _ 로 한다
//		ex) final int MAX_PEOPLE_COUNT;
//		
//		
//		---------------------------------
//		
//		학생들의 성적을 구하는 프로그램
		
		final int STUDENT_NUM = 50; // 총인원
		double avg = 1000 / STUDENT_NUM; // 평균
		
	}

}
