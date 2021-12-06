package com.javaex.ex06;

public class StringApp02 {

	public static void main(String[] args) {
		
		String a = " abcd";
		String b = ",efg";
		
		//concat: 문자열끼리 더하는 메소드
		System.out.println(a.concat(b));
		System.out.println(b.concat(a));
		
		a = a.concat(b);
		System.out.println(a);
		
		//trim: 앞 부분 공백 제거
		a =a.trim();
		//System.out.println(a);
		System.out.println("--"+a+"--");
	
		//replace: 문자열 부분 바꾸기(전화번호 수집에 사용)
		a=a.replace("ab", "ch");
		System.out.println(a);
		
		//split: 분리g
		String[] sArray = a.split(",");		
		for(int i=0;i<sArray.length;i++) {
			System.out.println(sArray[i]);
		}
		
		//substring: 번호 출력 (주민번호 등의 정보 수집에 사용)
		String str = "Hello JAVA!";
		
		String r01 = str.substring(3);
		System.out.println(r01);
		
		String r02 = str.substring(8);
		System.out.println(r02);
		
		String r03 = str.substring(3,8); //3번부터 8번 문자열까지 출력
		System.out.println(r03);
		
		
	}

}
