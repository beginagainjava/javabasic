package java10_collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection_03_Iterator {
	public static void main(String[] args) {
		
		//Iterator, 반복자
		//	컬렉션의 모든 요소들을 순차적으로 반복할 때
		//	사용하는 방법을 표준화한 것
		
		
		//Arrays.asList() 를 이용한 리스트 생성
		List list = Arrays.asList("a", "b", "c", "d");
		
		//----------------------------------------------
		
		Iterator iter; // 반복자
		iter = list.iterator(); //리스트의 iterator 생성
		
		//Iterator의 주요 기능(메소드)
		//	boolean hasNext() : 다음 요소의 존재여부 반환
		//	E next() : 다음 요소의 데이터 반환
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		
		
	}
}
