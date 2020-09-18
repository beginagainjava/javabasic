package java05_array.copy;

public class ArrayCopy_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {10,20,30};
		int[] arr2;
		
		//	1. 복사될 공간 확보(생성) - Destination
		arr2 = new int[arr1.length];
		
		//	2. 데이터 복사	(for문 이용하기)
	
		System.out.println("------ 데이터 수정 전 ------");
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("------ 데이터 수정 후 ------");
		
		arr1[1] = 777;
	
		for(int i = 0; i < arr1.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i]);
		}
		
		//	1. 복사될 공간 확보(생성) - Destination
		arr2 = new int[arr1.length];
		
		//	2. 데이터 복사	(System 클래스의 배열 복사 메소드(기능) 사용)
//				System.arraycopy(src, srcIdx, dest, destIdx, length)
//				src : 원본 배열
//				srcIdx : 원본 배열에서 복사가 시작될 인덱스
//				dest : 사본 배열
//				destIdx : 사본 배열에서 복사가 시작될 인덱스
//				length : 복사가 될 요소의 개수
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		System.out.println("------ 데이터 수정 전 ------");
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			System.out.println(arr1[i] + " : " + arr2[i]);
		}
		
		System.out.println("------ 데이터 수정 후 ------");
		
		arr1[1] = 555;
	
		for(int i = 0; i < arr1.length; i++) {
			System.out.println( arr1[i] + " : " + arr2[i]);
		}

	}

}
