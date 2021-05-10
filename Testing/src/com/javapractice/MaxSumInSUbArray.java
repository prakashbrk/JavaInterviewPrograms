package com.javapractice;

public class MaxSumInSUbArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{1,2,3,-4,-5,6,3,5,8,4,0,9,-4}
//		Max value for subArray of Size 3
//		{1,2,3}{2,3,-4}{3,-4,-5}{-4,-5,6}{}{}......which one having max value
		int arr[]={1,2,3,-4,-5,6,3,5,8,4,0,9,-4};
		int subArrLen=3;
		maxSubArray(arr,subArrLen);
		

	}

	private static void maxSubArray(int[] arr,int subArrLen) {
		int maxVal=0;
		int windowVal=0;
//		for (int j = 0; j < subArrLen; j++) {
//			windowVal+=arr[j];
//		}
		maxVal=windowVal;
		for (int i = 0; i < arr.length-subArrLen; i++) {
			windowVal=arr[i]+arr[i+1]+arr[i+2];
			maxVal=Math.max(windowVal, maxVal);
			System.out.println(windowVal + " "+ maxVal);
		}
		
		System.out.println(maxVal);
		
	}

}
