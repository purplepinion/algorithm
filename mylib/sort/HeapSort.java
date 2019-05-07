package com.mylib.sort;

public class HeapSort extends Sort{

	@Override
	protected void sort(Comparable[] a) {
		
		int N = a.length;
		
		//create heap
		for(int k=(N-1)/2;k>=0;--k){
			sink(a,k,N-1);
		}
		
		//sort
		while(N>0){
			exch(a, 0, N-1);
			--N;
			sink(a, 0, N-1);
		}
		
	}
	
	private void sink(Comparable[] a,int k,int n){
		while(2*k+2<=n){
			int j=2*k+1;
			
			if(j<n&&less(a[j], a[j+1])) ++j;
			if(!less(a[k], a[j])) break;
			exch(a, k, j);
			k = j;
		}
	}

}
