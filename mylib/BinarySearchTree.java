package com.mylib;

/*
 * 二叉查找树实现
 */
public class BinarySearchTree<Key extends Comparable<Key>,Value> {

	//二叉查找树根节点
	private Node root;
	
	//二叉查找树节点
	private class Node{
		private Key key;
		private Value value;
		private Node left,right;
		private int N;
		
		public Node(Key key,Value value,int N) {
			this.key = key;
			this.value =value;
			this.N = N;
		}
	}
	
	//表中键值对数量
	public int size(){
		return size(root);
	}
	
	private int size(Node x){
		if(x==null) return 0;
		else return x.N;
	}
	
	//获取key对应的value
	public Value get(Key key){
		return get(root,key);
	}
	
	private Value get(Node x,Key key){
		if(x==null) return null;//key不存在返回null
		int cmp = key.compareTo(x.key);
		if(cmp<0) return get(x.left, key);
		else if(cmp>0) return get(x.right, key);
		else return x.value;
	}
	
	//键值对存入表中
	public void put(Key key,Value value){
		root = put(root,key,value);
	}
	
	private Node put(Node x,Key key,Value value){
		if(x==null) return new Node(key, value, 1);
		int cmp = key.compareTo(x.key);
		if(cmp<0) x.left = put(x.left, key, value);
		else if(cmp>0) x.right = put(x.right, key, value);
		else x.value = value;
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}
	
	//最小的键
	public Key min(){
		return min(root).key;
	}
	
	private Node min(Node x){
		if(x.left==null) return x;
		return min(x.left);
	}
	
	//最大的键
	public Key max(){
		return max(root).key;
	}
	
	private Node max(Node x){
		if(x.right==null) return x;
		return max(root);
	}
	
	//小于等于key的最大键
	public Key floor(Key key){
		Node x = floor(root,key);
		if(x==null) return null;
		return x.key;
	}

	private Node floor(Node x, Key key) {
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp==0) return x;
		if(cmp<0) return floor(x.left, key);
		Node t = floor(x.right, key);
		if(t!=null) return t;
		else return x;
	}
	
	//大于等于key的最大键
	public Key ceiling(Key key){
		Node x = ceiling(root,key);
		if(x==null) return null;
		return x.key;
	}

	private Node ceiling(Node x, Key key) {
		if(x==null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp==0) return x;
		if(cmp>0) return ceiling(x.right, key);
		Node t = ceiling(x.left, key);
		if(t!=null) return t;
		else return x;
	}

	//返回排名为k的key
	public Key select(int k){
		return select(root,k).key;
	}

	private Node select(Node x, int k) {
		
		if(x==null) return null;
		int t = size(x.left);
		if(t>k) return select(x.left, k);
		else if(t<k) return select(x.right, k-t-1);
		else return x;
	}
	
	//获取key的排名
	public int rank(Key key){
		return rank(root,key);
	}

	private int rank(Node x, Key key) {
		if(x==null) return 0;
		int cmp = key.compareTo(x.key);
		if(cmp<0) return rank(x.left, key);
		else if(cmp>0) return 1 + size(x.left) + rank(x.right,key);
		else return size(x.left);
	}
	
	//删除最小的键
	public void deleteMin(){
		root = deleteMin(root);
	}

	private Node deleteMin(Node x) {
		if(x.left==null) return x.right;
		x.left = deleteMin(x.left);
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}
	
	//删除最大的键
	public void deleteMax(){
		root = deleteMax(root);
	}

	private Node deleteMax(Node x) {
		if(x.right==null) return x.left;
		x.right = deleteMax(x.right);
		x.N = size(x.left) + size(x.right) + 1;
		return x;
	}
	
	//删除键key
	public void delete(Key key){
		root = delete(root,key);
	}

	private Node delete(Node x, Key key) {
		
		return null;
	}
	
}
