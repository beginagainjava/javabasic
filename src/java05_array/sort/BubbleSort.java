package java05_array.sort;

public class BubbleSort {
	public static void main(String[] args) {
		
		
		//	���� ����
		// 	1. �� ROUND�� �˰���
		
		//	2. 1�� �˰����� �̿��Ͽ� ��� ��Ұ� ���ĵ� ������ �ݺ�

		
		int[] arr = { 3, 2, 5, 4, 1 };
		int temp;
		
		System.out.println("=== ���� �� ===");
		for(int i : arr) {
			System.out.print(i + " ");
		}	System.out.println();
		System.out.println("===============");
		
		int round = 0;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length -i-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;				
				}
			} round++;
			System.out.print("ROUND [ " + round + " ] ��� : " );
			for(int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}System.out.println();
		}
		
//		System.out.println("ex");
//		for(int i : arr) {
//			System.out.print(i + " ");
//		}
//		
//		
//		System.out.println("----------------");
//		
//		int round = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if( arr[i] > arr[j]) {
//					
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//					
//				}
//			}
//			
//			round++;
//			System.out.print("[ " + round + " ] ��� : " );
//			for(int k = 0; k < arr.length; k++) {
//				System.out.print(arr[k] + " ");
//			}System.out.println();
//		}
		
		System.out.println("=== ���� �� ===");
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}
