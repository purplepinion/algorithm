package com.mylib.sort;

public  class SelectionSort extends Sort{

	@Override
	public void sort(Comparable[] a) {
		
		int N = a.length;
		
		for(int i=0;i<N;++i){
			int min = i;
			for(int j=i;j<N;++j){
				if(less(a[j],a[min])) min = j;
			}
			exch(a, i, min);
		}
		
	}

}
