package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		Point p04 = p02;
		
		//소속 클래스를 알려주는 역할
		System.out.println("#getClass()");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("");
		
		System.out.println("#hashCode()");
		System.out.println(p00.hashCode());//이 주소가 항상 같지는 않다. 중요한 것은 p00, p01,p02 숫자가 다르다는 것.
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("");
		
		System.out.println("#toString()");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		System.out.println("");
		
		System.out.println("#equals()");
		System.out.println(p00.equals(p02));
		System.out.println(p00.equals(p01));
		System.out.println(p00==p01);//주소가 같니?
		System.out.println(p02==p04);
		
	}
	
}
