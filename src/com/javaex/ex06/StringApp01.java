package com.javaex.ex06;

public class StringApp01 {

	public static void main(String[] args) {

		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01==str02);//주소값이 같은가?
		System.out.println(str01.equals(str02));
		
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		//글자를 이용해 숫자를 만들었기 때문에 hashCode 주소가 같다.
		
		//약식으로 String을 만들 경우 자리를 만드는 것이 아니라 먼저 그 문자가 존재하는지 찾아본다.
		//같은 문자열이 존재할 경우 자리를 만들지 않고 그 주소를 가져온다.
		String str03 = "hello";
		String str04 = "hello";
		
		System.out.println(str03==str04);
		str03="hello!!!";
		
		System.out.println(str03);
		System.out.println(str04);
				
		//이 경우, str03 내용을 바꾼다고 해서 str04의 내용이 바뀌지 않는다.
		//오류를 피하기 위해 내용을 바꾼 str03의 자리를 새로 만들고 주소를 새로 만든다.
		
		System.out.println(str03==str04);//주소가 달라졌다.
		System.out.println(str03.hashCode());
		System.out.println(str04.hashCode());
		
		System.out.println(str04);
	}

}
