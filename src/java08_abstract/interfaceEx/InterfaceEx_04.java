package java08_abstract.interfaceEx;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

interface Anonymous {
	public void out();
	
	
}

public class InterfaceEx_04 {
	public static void main(String[] args) {
		
		Anonymous a01; // 인터페이스 객체 변수
		
		a01 = new Anonymous() {
			
			@Override
			public void out() {

				System.out.println("익명 객체 1번");
				
			}
		}; // 객체를 생성하는 실행코드이므로 세미콜론을 써줘야한다
		
		a01.out();
		
		System.out.println("-------------------------");
		
		Anonymous a02 = new Anonymous() {
			
			@Override
			public void out() {
				
				System.out.println("익명객체 2번");
				
			}
		};

		a02.out();
		
		System.out.println("-------------------------");
		
		MouseListener ml;
		ml = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
	}
}
