package com.javapractice;

import java.awt.Rectangle;

abstract class Shape{
	
	private double height;
	private double width;
	
	public final double getHeight() {
		return height;
	}
	public final double getWidth() {
		
		return width;
	}
	
	public Shape(double height, double width) {
		this.height=height;
		this.width=width;
	}
	abstract double getArea();
}

class Square extends Shape{
	
	public Square(double side) {
		
		super(side,side);
	}
	@Override
	final double getArea() {
		return this.getHeight()*this.getWidth();
	
}
	
class Rectangle extends Shape{

	public Rectangle(double height, double width) {
		super(height, width);
	}

	@Override
	final double getArea() {
		return this.getHeight()*this.getWidth();
	}
	
}
}

public class FinalWithInterface {

	public static void main(String[] args) {
		Shape S1=new Square(10);
		S1.getHeight();
		S1.getWidth();
		S1.getArea();
		
		Shape S2=new Rectangle(10, 20);
		S2.getHeight();
		S2.getWidth();
		S2.getArea();
	}

}
