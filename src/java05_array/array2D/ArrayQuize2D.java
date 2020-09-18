package java05_array.array2D;

public class ArrayQuize2D {
	public static void main(String[] args) {
		
//		Q1.
//		1	2	3	4	5	
//		6	7	8	9	10	
//		11	12	13	14	15	
//		16	17	18	19	20	
//		21	22	23	24	25	
		
		int[][] arr = new int[5][5];
		
		System.out.println("=== Q1 ===============================");
		int init = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				arr[i][j] = init++;
				System.out.print(arr[i][j] + "\t");
			} System.out.println();
		}
		
		System.out.println("======================================");
//
//		Q2.
//		5	4	3	2	1
//		10	9	8	7	6
//		15	14	13	12	11
//		20	19	18	17	16
//		25	24	23	22	21
//
		System.out.println("=== Q2 ===============================");
		
		init = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr[i].length - 1; j >= 0; j--) {
				arr[i][j] = init++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + "\t");
			} System.out.println();
		}
		
		System.out.println("======================================");
		
//		Q3.
//		1	6	11	16	21
//		2	7	12	17	22
//		3	8	13	18	23
//		4	9	14	19	24
//		5	10	15	20	25

		System.out.println("=== Q3 ===============================");
		
		init = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				arr[j][i] = init++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + "\t");
			} System.out.println();
		}
		
		System.out.println("======================================");
		
//		Q4.
//		5	10	15	20	25
//		4	9	14	19	24
//		3	8	13	18	23
//		2	7	12	17	22
//		1	6	11	16	21
		System.out.println("=== Q4 ===============================");

		init = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr[i].length - 1; j >= 0; j-- ) {
				arr[j][i] = init++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				System.out.print(arr[i][j] + "\t");
			} System.out.println();
		}
		
		System.out.println("======================================");
//
//		Q5.
//		1    2    3    4    5
//		16   17   18   19   6
//		15   24   25   20   7
//		14   23   22   21   8
//		13   12   11   10   9
		
		System.out.println("=== Q5 ===============================");
		
		init = 1;
		int temp = 0;
		int raise = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {				
				if( arr[i][j] != 0 || j < arr[i].length) {
					switch (temp) {
					case 0 :
						if(raise == 0) {
							
						} else if(raise == 1) {
							
						}
						break;
					case 1:
						if(raise == 0) {
							
						} else if(raise == 1) {
							
						}
						break;
					}
					
				}
			}
		}
		
		
	}

}
