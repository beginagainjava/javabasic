package java10_collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_08_Queue {
	public static void main(String[] args) {
		
		Queue queue = new LinkedList();
		
		//Enqueue, 인큐 - 큐에 데이터 집어넣기
		queue.offer("Apple");
		queue.offer("Banana");
		queue.offer("Cherry");
		
		System.out.println(queue);
		
		System.out.println("----------");
		
		//Dequeue, 데크 - 큐에서 데이터 꺼내기
		System.out.println( queue.poll() );
		System.out.println( queue.poll() );
		
		System.out.println(queue);
		
	}
}














