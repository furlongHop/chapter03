package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		
		int no = 10;
		Integer i = new Integer(10);
		Short  s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		System.out.println(no);
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		
		int num01 = 10;
		int num02 = 7;
		int intResult = num01+num02; //10+7
		System.out.println(intResult);
		
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(7);
		Integer result = i01+i02; //주소+주소>자료형 Integer(더해지는 과정에 바뀔 수도 있다.)
		System.out.println(result);
		
		Integer i03 = new Integer(99); //99 > new Integer(99):boxing
		
		Integer i04 =new Integer(100);
		int num99 = i04;
		
		//stack에 들어있는 게 값 자체인지 주소값인지 잘 생각해보자.
		
		System.out.println("");
		
		//문자열 > int
		/*
		Integer i05 = 10; //10: i05를 메모리에 올리기 위해 임의로 정한 값(값 자체는 의미없음)
		int r01 = i05.parseInt("12345");
		System.out.println(r01);
		*/
		
		int r01 = Integer.parseInt("12345"); //static에 있는 메소드
		System.out.println(r01);
		
		System.out.println("");
		
		//int > 문자열
		/*
		String a = "안녕하세요"; //안녕하세요>메모리 로딩을 위해 넣은 의미없는 값.
		String snum = a.valueOf(555);
		System.out.println(snum);
		*/
		
		String snum = String.valueOf(555);
		System.out.println(snum);
		
		String r100 = ""+1234;
		System.out.println(r100);
	}

}
