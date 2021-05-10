package com.javapractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Anangram {

	public static void main(String[] args) {
		
		
		String s1="calppppt";
		String s2="actopppp";
		
		boolean isAnangram=verifyIsAnagram(s1, s2);
		//boolean isAnagram=verifyAnagramBySorting(s1, s2);
		if(isAnangram) {
			System.out.println("its an anagram");
		}else {
			System.out.println("Not an anagram");
		}
		
	}
 
	public static Boolean verifyIsAnagram(String s1, String s2) {
		
		int s1Arr[]= new int[256];
		//int s2Arr[]= new int[256];
		boolean isAnagram=true;
		
		if(s1.length()==s2.length()) {
			
			for (int i = 0; i < s1.length(); i++) {
				int index=(int)s1.charAt(i);
				s1Arr[index]++;	
			}
			for (int i = 0; i < s2.length(); i++) {
				int index=(int)s2.charAt(i);
				s1Arr[index]--;
				
			}
			
			for (int i = 0; i < s1Arr.length; i++) {
				
				if(s1Arr[i]!=0) {
					isAnagram=false;
					
				}
			}
			
		}else {
			
			System.out.println("Not a an Anangram");
			isAnagram=false;
			
		}
		
		return isAnagram;
		
	}
	
	
}
