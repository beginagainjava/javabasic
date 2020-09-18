package java12_exception;

public class ExceptionEx_01 {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		int i = 0;
		while(true) {
			
			//예외 처리 코드[
			if( i < 0 || i >= arr.length) {
				break;
			}
			
			arr[i] += i+1;
			System.out.println(arr[i]);
			
			i++;
			
		}
		
		
		System.out.println("프로그램 정상 종료");
		
	}
	

}
