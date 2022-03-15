package Chap06_07.Ex05;

class B {	// 외부 클래스 : pubilc이 올 수 없다. default 가 생략되어 있다.
	int b = 3;				// default 접근 제어자 : 같은 패키지 내의 다른 클래스에서 접근 가능 
	private int a = 1;		// private 접근 제어자 : 같은 클래스 내에서만 사용가능 
	protected int c	= 3 ;	// protected 접근 제어자 : default + 다른 패키지의 접근 가능 ( 상속된 경우 만 가능 )
	public int d = 4 ;		// public 접근 제어자 
	
		// private < default < protected < public
	private void print1() { 	// 같은 클래스에 존재하는 메소드 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;

	}

	void print2() { 	// 같은 클래스에 존재하는 메소드 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;
}
	protected void print3() { 	// 같은 클래스에 존재하는 메소드 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;
	}
	public void print4() { 	// 같은 클래스에 존재하는 메소드 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;
	}

public class ExternalClass_1 {

	public static void main(String[] args) {
	B b =new B ();	// 같은 클래스에 존재하므로 Bclass 를 생성할 수 잇다.
	

	}

}
}
