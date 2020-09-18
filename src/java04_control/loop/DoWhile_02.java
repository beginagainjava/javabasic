package java04_control.loop;

import java.util.Scanner;

public class DoWhile_02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		
		do {
			System.out.println("Input Number(종료 = 99) : ");
			input = sc.nextInt();
			
			System.out.println("입력한 값 : " + input);
			System.out.println();
		} while (input != 99);
		
		//----------------------------------------------------------
		
		while (true){ //무한반복
			System.out.println("Input Number(종료 = 99) : ");
			input = sc.nextInt();
			
			System.out.println("입력한 값 : " + input);
			System.out.println();
			
			if( input == 99 ) {
				break;
			}
		}
	}

}
