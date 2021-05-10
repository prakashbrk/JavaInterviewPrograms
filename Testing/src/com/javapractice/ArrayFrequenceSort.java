package com.javapractice;

public class ArrayFrequenceSort {

	static int x=0;
	public static void main(String[] args) {
		// {2,2,1,7,1,4,5,5,7,5,6,6,6,2,6,6,7,6,7,8}
		//output {6,6,6,6,6,6,7,7,7,7,2,2,2,5,5,5,1,1,4,8} higher frequency to lower 
//		Step 1:- Sort it {1,1,2,2,2,4,5,5,6,6,6,6,6,6,7,7,7,7,8}
//		Step 2: Make a 2d array wit repeated freq 
//		1 2
//		2 3
//		4 1
//		5 2
//		6 6
//		7 4
//		8 1
//		Step3 : sort the 2d array according to its fre and print it
//		6 6
//		7 4
//		2 3

		int a[]={2,2,1,7,1,4,5,5,7,5,6,6,6,2,6,6,7,6,7,8};
		
		a=sort(a);
		 for (int i : a) {
			System.out.print(i + " ");
		}
		 int b[][] = new int [a.length][1];
		b=covertTo2DArrayWIthFrequency(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i][0] + " " + b[i][1]);
		}
		b=sortTwoD(b);
		System.out.println();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < b[i][1]; j++) {
				System.out.print(b[i][0] + " ");
			}
		}

	}
	
	public static int[] sort(int a[]) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		return a;
	}
	
	public static int[][] sortTwoD(int b[][]){
		for (int i = 0; i < b.length; i++) {
			for (int j = i; j < b.length; j++) {
				if(b[i][1]<b[j][1]) {
					int temp=b[j][1];
					b[j][1]=b[i][1];
					b[i][1]=temp;
				}
			}
		}
		return b;
	}
	
	public static int[][] covertTo2DArrayWIthFrequency(int a[]){
		int b[][] = new int [a.length][2];
		
		b[x][0]=a[0];
		b[x][1]=1;
		for (int i = 1; i < a.length; i++) {
			
				if(a[i]==a[i-1]) {	
					b[x][1]=b[x][1]+1;
				}else {
					x++;
					b[x][0]=a[i];
					b[x][1]=1;
				}
			
		}
		x++;
		return b;
	}

}
