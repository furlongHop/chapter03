package com.javaex.ex05;

public class Rectangle {

	private int width;
	private int height;

	
	public Rectangle() {
		
	}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public int area() {
		int a=this.height*this.width;
		return a;
	}
	
	public boolean equals(Object obj) {
		Rectangle r = ((Rectangle)obj);
		
		if(this.area()==r.area()) {
			return true;
		}else {
			return false;
		}
		
	}

	
}
