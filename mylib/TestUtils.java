package com.mylib;

import org.junit.Test;

public class TestUtils {
	
	@Test
	public void testBag(){
		
		Bag<Integer> intBag = new Bag<>();
		for(int i=0;i<10;++i){
			intBag.add(new Integer(i+1));
		}
		print("testBag():");
		for (Integer integer : intBag) {
			print(integer);
		}
		System.out.println();
	}
	
	@Test
	public  void testQueue(){
		Queue<Integer> intQueue = new Queue<>();
		for(int i=0;i<10;++i){
			intQueue.enqueue(i*i);
		}
		print("testQueue():");
		for(int i=0;i<10;++i) {
			print(intQueue.dequeue());
		}
		System.out.println();
	}
	
	@Test
	public void testStack() throws Exception{
		Stack<Integer> intStack = new Stack<>();
		for(int i=0;i<10;++i){
			intStack.push(i*i);
		}
		print("testStack():");
		for(int i=0;i<10;++i){
			print(intStack.pop());
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

	}
	
	public static void print(Object object){
		System.out.print(object + " ");
		
	}
}
