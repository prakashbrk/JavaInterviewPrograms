package com.javapractice;

import java.util.Arrays;

public class JavaInterview {

	public static void main(String[] args) {
		
//		int a[]= {3,4,7,2,4};
//		int b[]= {7,3,8,9};
		
		int a[]= {3,4,7,8,56};
		int b[]= {3,8,9,10};
		//mergeArray(a,b);
		mergeArrayUsingWhileLoop(a,b);
		

	}

	private static void mergeArray(int[] a, int[] b) {
		
		int c[]=new int [a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}
		for (int j = a.length,i=0; j < c.length; j++,i++) {
			c[j]=b[i];
		}
		
		for (int i : c) {
			System.out.print(i);
		}
//		for (int i = 0; i < c.length; i++) {
//			for (int j = i+1; j < c.length; j++) {
//				if(c[i]>c[j]) {
//					int temp=c[i];
//					c[i]=c[j];
//					c[j]=temp;
//				}
//				
//			}
//			
//		}
		
		Arrays.sort(c);
		System.out.println();
		for (int i : c) {
			
			System.out.print(i);
		}
		
	}
	
	public  static void mergeArrayUsingWhileLoop(int a[],int b[]) {
		
		int i = 0,j = 0,k=0;
		int []c=new int[a.length+b.length];
		while (i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k]=b[j];
				++j;k++;
			}else {
				c[k]=a[i];
				++i;k++;
			}
			
		}
		while(i<a.length) {
			c[k]=a[i];
			++i;++k;
		}
		while(j<b.length) {
			c[k]=b[j];
			++j;++k;
		}
		
		System.out.println("using while loop "+Arrays.toString(c));
	}
	
	

}
