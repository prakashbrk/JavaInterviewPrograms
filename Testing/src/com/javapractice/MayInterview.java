package com.javapractice;

public class MayInterview {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,6,7,8};
		boolean found=false;
		int i=1;
		int missingItem = 0;
		for(i=1;i<arr.length;i++) {
			if(arr[i-1]+1!=arr[i]) {
				found=true;
				 missingItem=arr[i-1] + 1;
				System.out.println("Missing item found "+ missingItem);
				break;
			}
		}
		if (found==true) {
				System.out.println("Missing item found "+ missingItem);

	}

}
}
