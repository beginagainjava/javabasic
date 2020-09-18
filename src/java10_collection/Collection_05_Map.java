package java10_collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_05_Map {
	public static void main(String[] args) {
		
//		Map map = new HashMap();
		Map map = new Hashtable();
		
		//데이터 삽입
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println("map : " + map);
		
		System.out.println("\n---get(key)-------");
		System.out.println( map.get(3) ); // 3=Cherry
		
		System.out.println("\n---put(key, value)-------");
		map.put("D", "Durian"); // D=Durian
		
		System.out.println("map : " + map);
		System.out.println("get(D) : " + map.get("D"));
		
		System.out.println("-----");
		map.put(2, "Orange"); //기존에 존재하는 Key에 매핑
		map.put(4, "Apple"); //Key는 없지만 Value는 존재하는 값
		
		System.out.println("map : " + map);
		
		System.out.println("\n---contains-------");
		System.out.println("Key 5 : " + map.containsKey(5));
		
		//key 5가 존재하지 않을 경우에 데이터 삽입하기
		if( !map.containsKey(5) ) {
			map.put(5, "Grape");
		}
		
		System.out.println("Value \"Apple\" : "
				+ map.containsValue("Apple") );
		
		// key와 value의 역할을 잘 고려해서 맵을 사용할 것!
		
//		if( map.containsValue(555) ) {
		if( map.containsKey(555) ) {
			String str = (String) map.get(555);
			System.out.println( str.length() );
		}
		
		System.out.println("\n---size()-------");
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println("\n---isEmpty()-------");
		System.out.println(map.isEmpty());
		
		System.out.println("\n---remove()-------");
		map.remove(3); //key를 찾아서 Entry 제거
		System.out.println(map);
		
		//key를 찾아서 value가 일치하면 Entry 제거
		map.remove(2, "Apple");
		System.out.println(map);
		
		System.out.println("\n---null 값 처리-------");
		
//		map.put(null, "Bob"); //key가 null인 상황은 좋지 않음
//		map.put(10, null);
//		System.out.println(map);
//		
//		map.put(null, null);
//		System.out.println(map);
		
		System.out.println("----------");
		
		//map -> set 변환
		Set entrySet = map.entrySet(); //key-value쌍인 Entry를 Set으로
		Set keySet = map.keySet(); //key를 Set으로
		
		System.out.println(entrySet);
		System.out.println(keySet);
		
		System.out.println("\n---keySet을 이용한 map 반복-------");
		
		Set keys = map.keySet(); //키 셋 추출
		
		Iterator iter = keys.iterator(); //Key Set에 대한 반복자
		
		while( iter.hasNext() ) {
			Object key = iter.next(); //key 추출
			
			//key를 이용한 value 반환
			System.out.println( map.get(key) );
		}
		
	}
}













