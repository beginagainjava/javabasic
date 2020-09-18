package java09_api;

import java.util.Random;
import java.util.Scanner;

public class Baskin {
	
public static int count = 0;
public static Boolean gameOver = false;
public static int temp = 0;

public static void play(int num, int who, Boolean gameMode) {

	if(gameMode) {
		if(temp == num) {
			System.out.println("[ 중복된 숫자를 말했습니다. 당신의 패배입니다 ]");
			gameOver = true;
			return;
		} else {
			temp = num;
		}
	}
	
	if(num > 3 || num <= 0) {
		System.out.println(" [ 유효하지 않은 숫자입니다. 당신의 패배입니다 ]");
		gameOver = true;
		return;
	}
	
	for(int i = 0; i < num; i++) {
		System.out.print(++count + " ");
		result(count, who);
		if(gameOver) return;
	}
}

public static void result(int num, int who) {

	if(num == 31) {
		switch (who) {
		case 0:
			System.out.println("[ 축하합니다! 당신의 승리입니다 ]");
			gameOver = true;
			return;
			
		case 1:
			System.out.println("[ 당신의 패배입니다 ]");
			gameOver = true;
			return;
		}
	}
}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		Boolean comWin = rand.nextBoolean();
		Boolean gameMode = rand.nextBoolean();
		
		if(comWin) {
			System.out.println("[ 컴퓨터가 이기려고 작정했습니다 ]");
		}
		
		if(gameMode) {
			System.out.println("[ 중복된 숫자를 연속으로 말하면 패배합니다 ]");
		}
		
		while(!gameOver) {
			
			if((30 - count) != 0 && (30 - count) <= 3 && comWin) {
				System.out.print("[컴퓨터] : ");
				play(30 - count, 0, gameMode);
			} else {

				int com = rand.nextInt(3) + 1;
				
				if(gameMode) {
					while(com == temp) {
						com = rand.nextInt(3) + 1;
					}
				}
				
				System.out.print("[컴퓨터] : ");
				play(com, 0, gameMode);
			}
			
			if(gameOver) return;
			
			System.out.println();
			System.out.print("당신 차례입니다 >> ");
			int user = sc.nextInt();
			
			System.out.print("[USER] : ");
			play(user, 1, gameMode);
			System.out.println("\n");
			
		}
		
		System.out.println();

	}

}
