package com.mylib;

import java.util.Iterator;


/*
 * ��������ʵ��
 * 
 */
public class Bag<Item> implements Iterable<Item> {

	private Node first = null;
	private int N;
	
	//�ڲ��ڵ���
	private class Node{
		Item item;
		Node next;
	}
	
	
	public Bag() {

	}
	
	public void add(Item item){
		
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public boolean isEmpty(){
		
		return first==null;
	}
	
	public int size(){
		
		return N;
	}
	
	@Override
	public Iterator<Item> iterator() {
		
		return new BagIterator<Item>();
	}
	
	//�Զ��������

	@SuppressWarnings("hiding")
	private class BagIterator<Item> implements Iterator<Item>{

		private Node current = first;
		@Override
		public boolean hasNext() {
			
			return current!=null;
		}

		@Override
		public Item next() {
			
			if(current!=null){

				@SuppressWarnings("unchecked")
				Item item = (Item)current.item;
				current = current.next;
				return item;
			}
			return null;
		}
		
	}

}
