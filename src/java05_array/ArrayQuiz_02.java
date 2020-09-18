package java05_array;

public class ArrayQuiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int arr[] = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
//		�迭�� ����� �� ������ Ǫ�ÿ�
//
//		- ���� ���ڸ� invert_arr��� �迭�� �Ųٷ� �Է��Ͻÿ�
//		=> invert_arr : { 21, 13, 9, 8, 10, 27, 9, 3, 17, 10 }
//
//		- ���� ������
//		 (¦����° �ε��� ������ ��) - (Ȧ����° �ε��� ������ ��)��
//		 ���Ͻÿ�
//		 	=> -5
//
//		- ���� ���ڸ� ���� ���ڰ� 1���� �ǰ��Ͽ�
//		 rank_arr��� �迭�� ������ �Է��Ͻÿ�
//			=> arr : { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		    => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }
//
//		- �ߺ��� ���� over_arr�� �ְ� �ߺ�����
//		 ���� ���� ret_arr�� �Է��Ͻÿ�
//
//			���ı��� �ߴٸ�
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
		} System.out.println("[ ¦����° �ε��� �� - Ȧ����° �ε��� �� ] : " + (even - odd));

		
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
		
		
		System.out.print("[ arr�迭 ���� �� ] : ");
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
