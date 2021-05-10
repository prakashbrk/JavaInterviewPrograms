package com.javapractice;
abstract class Test {
	final int i;
	Test(){
		this.i = 0;
		//i=10;
	}
	static void TestMethod() {
		System.out.println("hi !! I am good !!");
		} }
public class TestClass extends Test { 
	public static void main (String args[]) { 
		Test.TestMethod();
} }