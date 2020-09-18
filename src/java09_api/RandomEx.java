package java09_api;

import java.util.Arrays;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		
		// �� ������Ÿ������ ǥ�� ������ ������ ���� �߻�
		
		System.out.println(rand.nextInt()); // -21�� ~ 21��
		System.out.println(rand.nextBoolean()); // true || false
		System.out.println(rand.nextDouble()); // 0.0 ~ 1.0
		
		System.out.println("----------------------");
		System.out.println();
		
		System.out.println(rand.nextInt(100)); // 0 ~ 99
		System.out.println(rand.nextInt(100) + 1); // 1 ~ 100

		System.out.println("----------------------");
		
		int[] arr = new int[6];
		for(int i = 0 ; i < arr.length; i++) {
			
			int num = rand.nextInt(45) + 1;
			

			for(int j = 0; j < i; j++) {
				if(arr[j] == num && i != 0 && i != j) {
					i--;
				}
			}
			
			arr[i] = num;
			
		}
		
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
