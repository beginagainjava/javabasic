package java05_array.array2D;

public class Array2D_02 {
	public static void main(String[] args) {
		
		
		//	1���� �迭�� ����� ���ÿ� �ʱ�ȭ
		int[] arr1D = { 1,2,3,4,5 };

		//	2���� �迭�� ����� ���ÿ� �ʱ�ȭ
		int[][] arr2D = {
				{1,2,3}, 
				{4,5,6}, 
				{7,8,9} 
				};
		// 3�� 3���� 2���� �迭 ����
		
		
		// 2���� �迭 ���Ӱ� �����ϱ�
		arr2D = new int[4][3];
		
		int init = 1;
		for(int i = 0; i < 4; i++) { // i�� ( 0 ~ 3 )
			for(int j = 0; j < 3; j++) { // j�� ( 0 ~ 2 )
				
				//2���� �迭�� �� �����ϱ�
				arr2D[i][j] = (i+1)*10 + (j+1);
				
				//2���� �迭�� ��� �� ����ϱ�
				System.out.print(arr2D[i][j] + " ");
				
			}System.out.println();
		}
	}
}
