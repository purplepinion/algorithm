package com.mylib.sort;

import org.junit.Test;

public class TestUtils {
	
	
	@Test//��ѡ������
	public void testSelectionSort(){
		
		System.out.println("��ѡ������:");
		Integer[] arr = {1,5,7,6,2,4,2,1};
		SelectionSort tool = new SelectionSort();
		tool.sort(arr);
		assert tool.isSorted(arr);
		SelectionSort.show(arr);
	}
	
	@Test//������
	public void testHeapSort(){
		
		System.out.println("������:");
		Integer[] arr = {1,5,7,6,2,4,2,1};
		HeapSort tool = new HeapSort();
		tool.sort(arr);
		assert tool.isSorted(arr);
		HeapSort.show(arr);
	}
	
	
	@Test//�򵥲�������
	public void testInsertionSort(){
		
		System.out.println("�򵥲�������:");
		Integer[] arr = {1,5,7,6,2,4,2,1};
		InsertionSort tool = new InsertionSort();
		tool.sort(arr);
		assert tool.isSorted(arr);
		InsertionSort.show(arr);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
