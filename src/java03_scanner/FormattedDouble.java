package java03_scanner;

public class FormattedDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double avg = 12345.67890;
		
//		방법 1.
//		System.out.printf(); 를 사용한다
		
		System.out.printf("%.2f", avg);
		System.out.printf("%5d", 777);
		
		// %.2f 서식문자
		// f : floationg point number ( 부동소수점, 실수 )
		// .2 : 자릿수, 소수점이하 2번째까지만 출력
		
		// %5d 서식문자
		// d : decimal number ( 10진수 정수 )
		// 5 : 자릿수, 5칸을 확보하고 출력
		
		
//		방법2.
//		Math.round(숫자) : 숫자의 소수점이하를 반올림해주는 메소드(기능)
		
		double avg2 = 34.56778899;
		double result = Math.round(avg2*100);
		
		System.out.println();
		System.out.println(result/100.0);
		// avg2 : 34.56778899
		// avg2 * 100 : 3456.778899
		// Math.round(avg2*100) : 3457.0
		// Math.round(avg2*100)/(double)100 : 34.57

	}

}
