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
			
			System.out.print("����Ǵ� ���ڸ� �Է��ϼ��� >> ");
			int user = sc.nextInt();
			
			if(min > user || max < user) {
				System.out.println();
				System.out.println("[ ���� ] ��ȿ���� ���� ���ڸ� �Է��ϼ̽��ϴ�." );
				System.out.println("[ ���� ] ������ [ " + com + " ] �����ϴ�." );
				return;
			}
			
			if(com > user) {
				min = user + 1;
				System.out.println("[   UP   ]" + " [ " + min + " ~ " + max + " ]");
			} else if (com < user) {
				max = user - 1;
				System.out.println("[  DOWN  ]" + " [ " + min + " ~ " + max + " ]");
			} else {
				System.out.println("���� [ " + com + " ] , [ " + (cnt+1) + " ]������ ������ϴ�.");
				return;
			}
			
			cnt++;
			
		}
		System.out.println();
		System.out.println("[ ���� ] ������ [ " + com + " ] �����ϴ�." );
	}

}
