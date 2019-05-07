package com.mylib;
/*
 * ·ûºÅ±í
 */



public interface ST <Key extends Comparable<Key>,Value>{

	public void put(Key key,Value value);
	
	public Value get(Key key);
	
	public void delete(Key key);
	
	public boolean contains(Key key);
	
	public void isEmpty();
	
	public int size();
	
	Iterable<Key> keys();
	
}