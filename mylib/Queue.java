package com.mylib;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>{
	private Node head;
	private Node rear;
	private int N;
	
	private class Node{
		Item item;
		Node next;
	}
	
	public Queue() {
		
	}
	
	public void enqueue(Item item){
		
		Node oldrear = rear;
		rear = new Node();
		rear.item = item;
		rear.next = null;
		if(isEmpty()){
			head = rear;
		}
		else{
			oldrear.next = rear;
		}
	}
	
	public Item dequeue(){

		Node res = head;
		head = head.next;
		if(isEmpty()){
			rear = null;
		}
		N--;
		
		return res.item;

	}
	
	public boolean isEmpty(){
		
		return head == null;
	}
	
	public int size(){
		return N;
	}
	
	@Override
	public Iterator<Item> iterator() {
		
		return new QueueIterator<>();
	}
	
	@SuppressWarnings("hiding")
	private class QueueIterator<Item> implements Iterator<Item>{
		private Node current = head;

		@Override
		public boolean hasNext() {
			
			return head!=null;
		}

		@Override
		public Item next() {
			if(current!=null){
				@SuppressWarnings("unchecked")
				Item item = (Item) current.item;
				current = current.next;
				return item;
			}
			return null;
		}
		
	}

}
