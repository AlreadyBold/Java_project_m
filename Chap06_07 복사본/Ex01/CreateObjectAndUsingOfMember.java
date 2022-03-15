package Chap06_07.Ex01;

// 클래스 ( class ) : 객체를 생성하기 위한 틀 (템플릿), 설계도, 붕어빵의 틀
// 객체 ( object ) : 클래스를 복사해서 RAM에서 작동 되는 실행코드 
// 객체 = 인스턴스 
// 인스턴스화 (객체화) 시킨다.
// A a = new A();	<== 클래스를 객체화 시켜서 메모리에 로드
class A {		// 외부 클래스
	int m = 3;	// 필드 (변수) : 클래스블락에서 선언된 변수를 필드라 호
				// 필드는 인스턴스화(객체) 시켜야 사용이 가능
				// 필드는 메모리의 Heap 영역에 생성 
	
	void print() {	// 메소드 : 절차지향언어의 함수 , 객체지향언어에서 함수를 메소드라고 칭함
				
		System.out.println(" 객체 생성 및 활용 ");
	}
}
class B {	// 외부 클래스 
	
	String name = " 홍길동 ";
	int age = 24 ;
	String Phone = "010-1111-1111";
	
	void print_name () {
		System.out.println(name);
	}
	void print_age () {
		System.out.println(age);
	}
	void print_phone () {
		System.out.println(Phone);
	}
}



public class CreateObjectAndUsingOfMember {
	public static void main(String[] args) {
		A a = new A();		// Class A를 객체화( 인스턴스화 ) 시킨다. ( RAM에 로드시킨다. )
		System.out.println(a.m);
		a.print();
		
		System.out.println("==========");
		
		A b = new A();		// Class A를 객체화 ( 인스턴스화 ) 시켜서 RAM에 로
		
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("========");
		
		B bb = new B();		// Class B를 객체화( 인스턴스화 ) 시킨다. ( RAM에 로드시킨다. )
		bb.print_age();
		bb.print_name();
		bb.print_phone();
		
		B cc = new B();
		cc.print_age();
		cc.print_name();
		cc.print_phone();
		
		
		

	}
}
