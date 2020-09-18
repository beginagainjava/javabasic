package java05_array;

public class ArrayQuiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		배열이 선언된 뒤 문제를 푸시오
//
//		- 위의 숫자를 invert_arr라는 배열에 거꾸로 입력하시오
//		=> invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//		- 위의 숫자의
//		 (짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)을
//		 구하시오
//		 	=> -5
//
//		- 위의 숫자를 높은 숫자가 1등이 되게하여
//		 rank_arr라는 배열에 순위를 입력하시오
//			=> arr : { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		    => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//		- 중복된 값은 over_arr에 넣고 중복되지
//		 않은 값은 ret_arr에 입력하시오
//
//			정렬까지 했다면
//			=> over_arr : { 9, 10 }
//			=> ret_arr : { 3, 8, 13, 17, 21, 27 }
		
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		int[] invert_arr = new int[arr.length];
		int[] rank_arr = new int[arr.length];
		int[] over_arr = new int[arr.length];
		int[] ret_arr = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			invert_arr[i] = arr[arr.length-1-i];
		}
		
		System.out.print("[        arr ] : ");
		for(int i : arr) {
			System.out.print(i + " ");
		} System.out.println();
		
		System.out.print("[ invert_arr ] : ");
		for(int i : invert_arr) {
			System.out.print(i + " ");
		} System.out.println();
		
		int even = 0;
		int odd = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				even += arr[i];
			} else {
				odd += arr[i];
			}
		} System.out.println("[ 짝수번째 인덱스 합 - 홀수번째 인덱스 합 ] : " + (even - odd));

		
		for(int i = 0; i < arr.length; i++) {
			rank_arr[i] = arr.length;
			for(int j = 0; j < arr.length; j++) {
				if(i == j) continue;
				if(arr[i] >= arr[j]) {
					rank_arr[i]--;
				}
			}
		}
		
		System.out.print("[ rank_arr ] : ");
		for(int i : rank_arr) {
			System.out.print(i + " ");
		} System.out.println();
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length -i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		System.out.print("[ arr배열 정렬 후 ] : ");
		for(int i : arr) {
			System.out.print(i + " ");
		} System.out.println();
		
		int retIndex = 0;
		int overIndex = 0;
		
		// isExist
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				ret_arr[retIndex++] = arr[i];
				continue;
			} else {
				ret_arr[retIndex++] = arr[i];

				if(ret_arr[retIndex-2] == ret_arr[retIndex-1]) {
					over_arr[overIndex++] = ret_arr[retIndex-1];
					retIndex -= 2;
				}
			}
			

		}
		
		System.out.print("[ over_arr ] : ");
		for(int i : over_arr) {
			if(i == 0) break;
			System.out.print(i + " ");
		} System.out.println();
		
		System.out.print("[ ret_arr ] : ");
		for(int i : ret_arr) {
			if(i == 0) break;
			System.out.print(i + " ");
		}
		
	}

}
