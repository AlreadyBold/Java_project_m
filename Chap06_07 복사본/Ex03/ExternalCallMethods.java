package Chap06_07.Ex03;

import Chap06_07.Ex01.C;

public class ExternalCallMethods {

	public static void main(String[] args) {
			// 객체 생성 
		C a = new C(); 			// 같은 패키지 내의 클래스는 import 없이 호출해서 사용가
			// 메소드 호출 
		a.print();
		int k = a.data();		//3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);	//8.2
		
		a.printMethod(5);		// 1~12 사이의 값 
		a.printMethod(35);
			// 주의 :
		System.out.println(a.data());
	//System.out.println(a.print()); ==> 오류 발생 
		a.print();

	}
	

}
