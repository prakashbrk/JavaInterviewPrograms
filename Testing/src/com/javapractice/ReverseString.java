package com.javapractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		
		String S="Prakash";
		String revStr;
		ReverseString obj=new ReverseString();
		
		revStr=obj.revString(S);	
		System.out.println("Rverse String is " + revStr);
		String S1="PrakashSS";
		//StringRevByCollection(S1);
		
		String revRecurssion=RevByRec(S);
		System.out.println("Rev by Recursion " + revRecurssion);
		
		
		
		
	}

	public String revString(String S) {
		
		String revStr="";
		if(S.length()>0) {
			for (int i = S.length()-1; i >=0; i--) {
				revStr=revStr+S.charAt(i);
			}
		}else {
			
			System.out.println("Not a valid string");
		}
		
		return revStr;
	}
	
	
public static String RevByRec(String S) {
		
		if (S.isEmpty()) {
			return S;
		}else {
			return RevByRec(S.substring(1)) + S.charAt(0);
		}
	}
}
