package Chap06_07.Ex06;
class Aaa{
	int m = 3; 			// 필드 ( 인스턴스 필드 ) : 객체를 생성후에 사용 가능 
	static int n = 4;	// 필드 ( static 필드 ) 
	
	void print1 () {		// 메소드 (인스턴스 메소드) : 객체를 생성 후 호출 가능 
	// 인스턴스 필드와 static 필드가 올 수 있다.
		System.out.println(" 인스턴스 메소드 출력 " + " : m : "+m+" , n : "+n);
		
	}
	static void print2 () {	// 메소드 (static 메소드) : 객체를 생성없이 호출가능 , 객체 생성 후에도 호출 가능 
	// static 메소드 내에서는 인스턴스 필드가 올 수 없다. 
		System.out.println(" 스태틱 메소드 출력 "+ " n : "+n); 
	}
}
public class Static_1 {

	public static void main(String[] args) {
		// 1. 객체 생성후 필드와 메소드 호출 ( 인스턴스 필드, static필드, 인스턴스메소드 ,static메소드 ) 모두 호출
		Aaa aaa = new Aaa();
		aaa.m = 10;		// 인스턴스 필드 호출 
		aaa.n=20;		// static 필드 호출 
		aaa.print1();	// 인스턴스 메소드 호출 
		aaa.print2();	// static 메소드 호출 
		
		// 2. 객체 생성없이 필드와 메소드 호출 ( static필드와 static 메소드만 호출이 가능 )
		Aaa.n = 100;	// static 필드 : 객체 생성없이 클래스명으로 호출 됨 
		Aaa.print2();	// static 메소드 : 클래스명으로 호출 
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
	}

}
