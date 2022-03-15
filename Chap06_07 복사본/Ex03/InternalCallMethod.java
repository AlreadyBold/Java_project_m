package Chap06_07.Ex03;

public class InternalCallMethod {

	public static void main(String[] args) {
		// 같은 클래스 안에서 내부메소드 호출 :
		// static 키를 사용하지 않을경우에는 객체화 시켜서 메소드 호출 (new)
		
		InternalCallMethod aaa = new InternalCallMethod();
		aaa.print(); 	// aaa 객체의 print 메소드 호출 
		
		int a = aaa.twice(3);
		System.out.println( a );
		
		double b = aaa.sum(a, 5.8);
		System.out.println(b);
		
	}
	void print() {		// static 키워드 없이 메소드 생성 , new로 객체화 시켜서 사
		System.out.println(" 안녕 ");
	}
	int twice(int k ) {
		return k * 2 ;
	}
	double sum (int m, double n) {
		return m+n;
	}
}
