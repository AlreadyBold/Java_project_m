package Chap10.Ex03;

// instanceof : 객체내부의 캐스팅이 가능여부를 알 수 있도록 하는 키워드
// 업캐스팅한 객체 내부에 어떤 타입이 존재하는지 true, false로 리턴 
// 다운 캐스팅 시 : 
class A{
	int m ;
	void a() {
		System.out.println(" m : " + m);
	}
}
class B extends A{
	int n;
	void b() {
		System.out.println(" n : " + n);
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof :
		A aa = new A();		//aa는 A타입만 가진다. 
		A ab = new B();		//ab는 A , B 타입을 가진다. A만 접근가능 
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);

		if (aa instanceof B) {
			B b = (B)aa ; 
			System.out.println("aa 를 B로 캐스팅 했습니다. ");
		} else {
			System.out.println("aa 는 B타입으로 캐스팅 불가 ");
		}
		if (ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab 를 B로 캐스팅 했습니다. ");
		}else {
			System.out.println("ab 는 B타입으로 캐스팅 불가 ");
		}
		if ( "안녕" instanceof String) {
			System.out.println("\"안녕\"은 String 클래스 입니다.");
		}
	}

}
