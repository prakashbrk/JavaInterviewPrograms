package com.javapractice;

interface myInterface{
	
	void getName();
	int getVal();
}

public class BinarySearch implements myInterface{

	public static void main(String[] args) {
		
		int arr[]= {10,24,65,67,200};
		int x=65;
		int r=arr.length-1;
		BinarySearch obj=new BinarySearch();
		new BinarySearch();
		int result=binarySearch(arr,0,r,x);
		
		if(result==-1) {
			
			System.out.println(x + "  is not present in the array");
		}else {
			
			System.out.println(x + " present in the index " + result );
		}
		
		

	}
	
	//Static block
	static {
		System.out.println("Static block will execute before constructor");
	}
	
	//initializer block
	{
		System.out.println("Initializer block executes before constructor");
	}
	
	 BinarySearch(){
		System.out.println("Constructor after static block");
	}

	private static int binarySearch(int[] arr,int l,int r,int x) {
		
		int mid=l+(r-l)/2;
		if(arr[mid]==x) {
			return mid;
		}
		if(arr[mid]<x) {
			return binarySearch(arr,l,mid-1,x);
		}
		if(arr[mid]>x) {
			return binarySearch(arr,mid+1,r,x);
		}
		
		return -1;
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getVal() {
		// TODO Auto-generated method stub
		return 0;
	}
		

}
