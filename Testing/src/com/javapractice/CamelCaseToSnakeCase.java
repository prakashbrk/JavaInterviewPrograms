package com.javapractice;

import java.util.Arrays;
import java.util.Collections;

public class CamelCaseToSnakeCase {

	public static void main(String[] args) {
		// CamelCaseToSnakeCase
		//camel_case_to_snake_case-- output
		
		String str="CamelCaseToSnakeCase";
		String regex="((a-z)[A-Z]+)";
		String replace="$_$1";
		System.out.println(str.replaceAll(regex, replace));
		
		

		

	}

}
