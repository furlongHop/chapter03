package com.javaex.ex03;

public class Point {

	//필드
	int x;
	int y;
	
	//생성자
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}


	//메소드 g/s
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	
	//메소드 일반
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public boolean equals(Object obj) {
		Point p=((Point)obj); //Point class 다운 캐스팅
		
		//a.equals(b)
		//a.x==b.x && a.y==b.y
		if(this.x==p.x && this.y==p.y) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
