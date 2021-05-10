package com.javapractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedCharacterInString {

	public static void main(String[] args) {
		
		
		String txt="a a a g g h h d d f f f c c s s s s";
		List<String> ListOfChars=Arrays.asList(txt.split(" "));
		
		Set<String> UniqueWords=new HashSet<String>();
		UniqueWords.addAll(ListOfChars);
		for (String uniqueWord : UniqueWords) {
			Collections.frequency(ListOfChars, uniqueWord);
			System.out.println("Repeated words " + uniqueWord +" frequency is " + Collections.frequency(ListOfChars, uniqueWord));
		}
		
		

	}

}
