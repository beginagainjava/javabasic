package java09_api;

import java.util.Random;
import java.util.Scanner;

public class UpDown_Quiz {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		int com = rand.nextInt(50) + 1;
		int cnt = 0;
		int min = 1; 
		int max = 50;
		
		while(cnt < 7) {
			
			System.out.print("예상되는 숫자를 입력하세요 >> ");
			int user = sc.nextInt();
			
			if(min > user || max < user) {
				System.out.println();
				System.out.println("[ 실패 ] 유효하지 않은 숫자를 입력하셨습니다." );
				System.out.println("[ 실패 ] 정답은 [ " + com + " ] 였습니다." );
				return;
			}
			
			if(com > user) {
				min = user + 1;
				System.out.println("[   UP   ]" + " [ " + min + " ~ " + max + " ]");
			} else if (com < user) {
				max = user - 1;
				System.out.println("[  DOWN  ]" + " [ " + min + " ~ " + max + " ]");
			} else {
				System.out.println("정답 [ " + com + " ] , [ " + (cnt+1) + " ]번만에 맞췄습니다.");
				return;
			}
			
			cnt++;
			
		}
		System.out.println();
		System.out.println("[ 실패 ] 정답은 [ " + com + " ] 였습니다." );
	}

}
