package com.mylib;

import java.util.Iterator;



public class Stack<Item> implements Iterable<Item> {

	private Node first;
	private int N;
	
	private class Node{
		Item item;
		Node next;
	}
	
	public Stack(){
		
	}
	
	public void push(Item item){
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		N++;
	}
	
	public Item pop() throws Exception{
		if(isEmpty()){
			throw new Exception("empty stack");
		}
		Node res = first;
		first = first.next;
		N--;
		return res.item;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public int size(){
		return N;
	}
	
	@Override
	public Iterator<Item> iterator() {
		
		return new StackIterator<Item>();
	}
	
	@SuppressWarnings("hiding")
	private class StackIterator<Item> implements Iterator<Item>{

		private Node current = first;
		@Override
		public boolean hasNext() {
			
			return first!=null;
		}

		@Override
		public Item next() {
			if(first!=null){
				@SuppressWarnings("unchecked")
				Item item = (Item) current.item;
				current = current.next;
				return item;
			}
			return null;
		}
		
	}

}
