package com.javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointerOppoDirection {
	
	static int sum;
	public static void main(String[] args) {
		
		//{1,2,-1,3,4,-5,7}-- sum of which pair of indexs is 7-- 3+4=7-- o/p--indexs are 3,4
		
		int arr[]= {1,2,-1,3,4,-5,7};
		sum=2;
		indexes(arr,sum);
		Arrays.sort(arr);
		// To use two pointer method, array should be in sorted form
		System.out.println(Arrays.toString(arr));
		usingTwoPointerMethod(arr,sum);

	}
	
	public static void indexes(int arr[],int sum) {
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter Array Size");
//		int size=sc.nextInt();
//		int arr[]=new int[size];
//		System.out.println("Enter Array elements");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=sc.nextInt();
//		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("indexes for summation of 7 are " + i + " " + j);
					break;
				}
			}
		}
	}
	
	public static void usingTwoPointerMethod(int arr[], int sum) {
		
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			
			if(arr[start]+arr[end]==sum) {
				System.out.println("by two pointer method indexes for summation of 7 are " + start + " " + end);
				break;
			}else if (arr[start]+arr[end]<sum) {
				start++;
			}else if(arr[start]+arr[end]>sum) {
				
				end--;
			}
			
		}
		
	}

}
