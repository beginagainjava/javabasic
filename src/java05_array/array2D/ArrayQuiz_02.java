package java05_array.array2D;

public class ArrayQuiz_02 {
	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		
		//----------------------------------------------------
		
		//Q1.
		System.out.println("- - - 문제 1번 - - -");
		int[] invert_arr = new int[arr.length];
		
		//arr의 마지막 인덱스부터 거꾸로 대입하기
		for(int i=0; i<invert_arr.length; i++) {
			invert_arr[i] = arr[invert_arr.length-1-i];
		}
		
		//전체 출력
		for(int i=0; i<invert_arr.length; i++) {
			System.out.print(invert_arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		
		
		
		//Q2.
		System.out.println("- - - 문제 2번 - - -");
		int evenSum = 0; //짝수인덱스의 합
		int oddSum = 0; //홀수인덱스의 합
		
		int diff; //차이
		
		//짝수인덱스 합, 홀수인덱스 합 구하기
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) { //짝수 인덱스
				evenSum += arr[i];
			} else if(i%2!=0) { //홀수 인덱스
				oddSum += arr[i];
			}
		}
		
		//차이 구하기
		diff = evenSum - oddSum;
		
		
		//출력
		System.out.println("짝수인덱스합-홀수인덱스합 : " + diff);
		System.out.println("--------------------");
		
		
		
		
		//Q3.
		System.out.println("- - - 문제 3번 - - -");
		int[] rank_arr = new int[arr.length];

		//rank 배열의 모든 값을 1로 초기화
		for(int i=0; i<rank_arr.length; i++) {
			rank_arr[i] = 1;
		}
		
		//하나의 인덱스(기준)를 다른 모든 인덱스 요소와 비교한다
		//기준 인덱스값보다 큰 숫자가 있으면 rank를 1 증가시킨다
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					rank_arr[i]++;
				}
			}
		}
		
		//전체 출력
		for(int i=0; i<rank_arr.length; i++) {
			System.out.print(rank_arr[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------");

		
		
		
		//Q4.
		System.out.println("- - - 문제 4번 - - -");
		int[] over_arr = new int[10]; //중복값
		int[] ret_arr = new int[10]; //중복이 아닌 값
		
		//i번째 요소를 기준으로 다른 모든 요소와 비교
		for(int i=0; i<arr.length; i++) {
			
			//i번째 요소의 중복값이 있는지 상태 저장하는 변수
			boolean isOverlap = false;
			
			//중복값을 찾으면 true로 저장
			for(int j=0; j<arr.length; j++) {
				if( arr[i] == arr[j] && i!=j ) {
					isOverlap = true;
					break;
				}
			}

			//이미 중복값으로 들어간 값인지 판단
			boolean isExist = false;
			for(int k=0; k<over_arr.length; k++) {
				isExist = false;
				if(over_arr[k] == arr[i]) {
					isExist = true;
					break;
				}
			}
			
			//이미 중복값으로 판단된 값일 경우 건너뛰기
			if( isExist ) {
				continue;
			}
			
			if(isOverlap) { //중복값이 있으면
				over_arr[i] = arr[i];
			} else { //중복값이 없으면
				ret_arr[i] = arr[i];
			}
		}

		//정렬
		for(int m=0; m<over_arr.length-1; m++) {
			for(int n=0; n<over_arr.length-1-m; n++) {
				if(over_arr[n] > over_arr[n+1]) {
					//스왑
					int tmp = over_arr[n];
					over_arr[n] = over_arr[n+1];
					over_arr[n+1] = tmp;
				}
			}
		}
		
		//정렬
		for(int m=0; m<ret_arr.length-1; m++) {
			for(int n=0; n<ret_arr.length-1-m; n++) {
				if(ret_arr[n] > ret_arr[n+1]) {
					//스왑
					int tmp = ret_arr[n];
					ret_arr[n] = ret_arr[n+1];
					ret_arr[n+1] = tmp;
				}
			}
		}
		
		//중복값 전체 출력
		for(int i=0; i<over_arr.length; i++) {
			if(over_arr[i]!=0) { //0은 출력하지 않음
				System.out.print(over_arr[i] + " ");
			}
		}
		System.out.println();
		
		//중복이 없는 값 전체 출력
		for(int i=0; i<ret_arr.length; i++) {
			if(ret_arr[i]!=0) { //0은 출력하지 않음
				System.out.print(ret_arr[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("--------------------");

	}
}
















