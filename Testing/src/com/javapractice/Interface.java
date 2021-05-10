package com.javapractice;

public class Interface {
	
	

	public static void main(String[] args) {
		
		ClassA obj=new ClassA();
		obj.methodA();
		obj.methodB();
		obj.methodC();

	}
	
}
	
	interface IntfA{
		
		void methodA();
		
	}
	interface IntfB{
		
		void methodB();
	}
	
	interface IntfC extends IntfA,IntfB{
		
		void methodC();
	}
	
	
	
	 class ClassA implements IntfC{
		
		@Override
		public void methodA() {System.out.println("Method  of interface A");}
		@Override
		public void methodB() {System.out.println("Method of interface B");}
		@Override
		public void methodC() {System.out.println("Method of interface C");}
		
	}

