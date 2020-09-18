package java10_collection;

import java.util.Stack;

public class Collection_07_Stack {
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println(stack);
		
		System.out.println("----------");
		
		System.out.println( stack.pop() );
		System.out.println( stack.pop() );
		
		System.out.println(stack);
		
		System.out.println("----------");
		
		
	}
}











