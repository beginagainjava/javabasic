package java12_exception;

import javax.crypto.NullCipher;

public class ExceptionEx_04 {
	public static void main(String[] args) {
		
		String str = null;
		
		
//		if( str == null ) { //예외상황
//			
//			throw new NullPointerException();
//						
//		}

		//---------------------------------------------------------
		
		NullPointerException e = new NullPointerException(); // 예외 객체 생성
		
		if( str == null ) {
			throw e; // 예외 발생 지점
		}
		
		//	예외 객체를 생성(new)한다고 해서
		// 	예외가 발생(throw)되는 것은 아니다
		
		
	}

}
