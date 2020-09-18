package java06_class.method.arrayQuiz;

import java.util.Arrays;

public class MethodArrayQuiz {
	
	public void mul10(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] *= 10;
		}
	}
	
	public void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	

}
