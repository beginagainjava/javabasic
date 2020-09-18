package java04_control.condition;

import java.util.Arrays;
import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
