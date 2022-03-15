package Chap06_07.Ex05;

public class Ex_A {

	public static void main(String[] args) {
		// A class 는 같은 패키지 내부에 존재 하므로 import 없이 사용가능 
	A a = new A();	
	
	a.m = 10;		// A class의 접근 제어자가, default
	a.n = 20;		//
	
	a.print();		// default 접근 제어자 이므로 접근 가능 
	}

}
