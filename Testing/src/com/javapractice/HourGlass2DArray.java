package com.javapractice;

public class HourGlass2DArray {

	public static void main(String[] args) {
		
//		Hour Glass
//		1 1 2 0 6 0
//		2 3 2 0 0 0
//		3 8 9 2 0 1
//		2 1 4 9 0 0
//		1 2 4 0 0 0
//		1 2 4 2 1 1
		
//		a b c
//		  g
//		d e f
		
//		get the highest value from all possible hour glasses
		
		int hourGlassMaxVal=0;
		
		int a[][]= {{2,3,0,1,2,2},{2,3,2,0,0,0},{3,8,9,2,0,1},{2,1,4,9,0,0},{1,2,4,0,0,0},{1,2,4,2,1,1}};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				int hourGlassVal=a[i][j]+a[i][j+1]+a[i][j+2]
						+a[i+1][j+1]
				+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
				System.out.println(hourGlassVal);
				if(hourGlassVal>hourGlassMaxVal) {
					hourGlassMaxVal=hourGlassVal;
				}
			}
				
		}
		
		System.out.println(hourGlassMaxVal);

	}

}
