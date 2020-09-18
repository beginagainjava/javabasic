package java01_variables;

public class VariablesEx_05 {

	public static void main(String[] args) {
		
//		한 줄 주석
//		ctrl + shift + d
		
//		int student age; // 에러 띄어쓰기 안됨
		
//		해결방법
		int student_age; // snake case
		int studentAge; // camel case

//		------------------------------------------
		
//		int 1stNumber; // 에러, 숫자로 시작하면 안됨
		
//		해결방법
		int firstNumber; // 억지로 길이를 줄일 필요없음
		
//		------------------------------------------
		
//		int int; // 에러, 키워드(예약어)는 사용 할 수 없음
	
//		해결방법
		int intNum; // 적절한 대체 변수명
		
		// 의미없는 변수명 짓는 것은 매우 안 좋음
		int a;
		int b;
		int c;

//		------------------------------------------

		
//		이런 식의 변수명 사용은 좋지 않음
		
		int _;
		_ = 100;
		
		int _number;
		int $number;
		
//		차라리 뒤에 숫자를 붙여서 사용할 것 = 권장
		
//		한글로 변수명 설정 가능하지만 절대! 하지 말 것
		int 넓이 = 100;
	
	
	}
				
}
