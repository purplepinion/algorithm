package com.mylib.sort;

import org.junit.Test;

public class TestUtils {
	
	
	@Test//ºÚµ•—°‘Ò≈≈–Ú
	public void testSelectionSort(){
		
		System.out.println("ºÚµ•—°‘Ò≈≈–Ú:");
		Integer[] arr = {1,5,7,6,2,4,2,1};
		SelectionSort tool = new SelectionSort();
		tool.sort(arr);
		assert tool.isSorted(arr);
		SelectionSort.show(arr);
	}
	
	@Test//∂—≈≈–Ú
	public void testHeapSort(){
		
		System.out.println("∂—≈≈–Ú:");
		Integer[] arr = {1,5,7,6,2,4,2,1};
		HeapSort tool = new HeapSort();
		tool.sort(arr);
		assert tool.isSorted(arr);
		HeapSort.show(arr);
	}
	
	
	@Test//ºÚµ•≤Â»Î≈≈–Ú
	public void testInsertionSort(){
		
		System.out.println("ºÚµ•≤Â»Î≈≈–Ú:");
		Integer[] arr = {1,5,7,6,2,4,2,1};
		InsertionSort tool = new InsertionSort();
		tool.sort(arr);
		assert tool.isSorted(arr);
		InsertionSort.show(arr);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
