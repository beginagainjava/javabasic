package java11_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx_01_Basic {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(123);
		list.add(3.14);
		list.add("Hello");
		
		//타입파라미터를 명시하지 않으면 Object로 결정된다
		
		//--------------------------------------------------
		
		List<String> list2 = new ArrayList<String>();
		
//		list2.add(123); //에러
		list2.add("Apple");
		
		//-----------------------------------------------------
		
		//기본 데이터타입으로 설정 불가 -> Wrapper 클래스 이용한다
		
//		List<int> list3 = new ArrayList<int>();
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(11111);
		
		//-----------------------------------------------------
		
		// 객체 생성할 때 타입파라미터는 생략 가능 -> JDK 1.7부터 가능
		List<String> list4 = new ArrayList<>();
		
		//----------------------------------------------------
		
		List<String> list5 = new ArrayList<>();
		
		//String만 사용할 수 있도록 막아준다
//		list5.add(true);
		list5.add("안녕");
		
		//장점 : 타입 안정성을 제공한다
		
		//-----------------------------------------
		
		// 타입 안정성이 없는 경우에 대한 예시
		List list6 = new ArrayList();
		list6.add("HI");
		list6.add(123);
		list6.add(true);
		
		String str1 = (String) list.get(0);
		
		String str2 = list5.get(0);
		
	}
}














