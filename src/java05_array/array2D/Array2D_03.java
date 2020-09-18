package java05_array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		int[][] arr;
		
		arr = new int[3][]; // (int[]) [3]
		
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[8];
		
		//----------------------------------------
		
		System.out.println(arr.length); //행의 길이
		System.out.println("-----");
		System.out.println(arr[0].length); //0행의 열 길이
		System.out.println(arr[1].length); //1행의 열 길이
		System.out.println(arr[2].length); //2행의 열 길이
		
		System.out.println("-----");
		
		
		//행마다 열의 길이가 일정하지 않은 2차원 배열의 전체 출력
		
		int num = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
		
	}

}
