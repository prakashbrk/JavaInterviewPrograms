package com.javapractice;

import java.util.ArrayList;

public class InterviewPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomVal= (int)Math.random();
		System.out.println("Random value : " + randomVal);
		
		String TertiaryOperator;
		int rank=2;
		TertiaryOperator=(rank==2)?"Value 1":"value 2";
		System.out.println(TertiaryOperator);
		
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("sssee");
		al.add("ssP");
		al.add("RGG");
		al.add("sGGhh");
		
		for (String s : al) {
			System.out.println(s);
		}
		
		Object arr[]= new Object[al.size()];
		arr=al.toArray(arr);
		for (Object val : arr) {
			System.out.println(val);
		}
		
		
		
		
		
		
	}
	

}
