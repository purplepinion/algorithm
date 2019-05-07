package com.mylib.sort;

public abstract class Sort{
	
	protected abstract void sort(Comparable[] a);
	
	protected static boolean less(Comparable a,Comparable b){
		
		return a.compareTo(b)<0;
	}
	
	protected static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	protected static void show(Comparable[] a){
		  for(int i=0;i<a.length;++i)
			  System.out.print(a[i] + " ");
		  System.out.println();
	}
	
	protected boolean isSorted(Comparable[] a){
		for(int i=1;i<a.length;++i)
			if(less(a[i], a[i-1]))
				return false;
		return true;
	}

}
