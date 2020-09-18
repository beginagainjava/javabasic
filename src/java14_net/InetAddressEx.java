package java14_net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	public static void main(String[] args) {
		
		InetAddress ip = null; //	IP주소 표현 객체
		try {
			// 도메인 주소를 이용하여 IP정보 얻어오기
			ip = InetAddress.getByName("www.iei.or.kr");
			
			System.out.println("IP : " + ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

		System.out.println("----------------------------");
		
		try {
			//자기 자신의 호스트 주소 알아내기
			ip = InetAddress.getLocalHost();
			System.out.println("Address : " + ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
