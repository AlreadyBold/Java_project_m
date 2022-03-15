package Chap06_07.Ex05;

import Chap06_07.Ex06.Bcd;

// import Chap06_07.Ex06.Ex06_Abc; 오류발생 : Abc class에 접근제한자가 default : 외부패키지에서 접근 불가 
public class External_Abc  extends Bcd{		//
	// 부모 클래스 : Bcd, 자식 클래스 : External_Abc
	public static void main(String[] args) {
		// Abc abc2 = new Abc(); 	// class 접근제어자가 default 여서 접근 불가.
		Bcd bcd1 = new Bcd();
		External_Abc ext = new External_Abc();
		// 다른 패키지에서 필드 호출 : 1. import (public : 클래스 접근 지정자)
							//	2. 객체생성 , 3. 접근 지정자 확인 후 접근 (필드, 메소드) 
		bcd1.a = 1000;		// public : 다른 패키지에서 접근가능 
		ext.b = 2000;		// 자식 클래스에서 부모클래스의 protected를 다른 패키지에서 접근 ( 상속관계 )

	}

}
