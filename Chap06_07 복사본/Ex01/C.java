package Chap06_07.Ex01;

public class C {
		//1. 리턴 타입이 없는 메소드 : void 메소드명() { 실행코드 }
	public void print() {		// public = 다른패키지에서 사용가능하게 하는 요소
		System.out.println(" 안 녕 ");
	}
	
		//2. 리턴타입이 있는 메소드 (int , double, String . . . )
	public int data() {
		return 3;
	}
		//3. 리턴 타입이 : double
	public double sum(int a, double b) {
			return a+b;
		}
		//4. 리턴 타입이 void + 메소드 내부에서 리턴을 포함 : ( 함수의 종료를 의미 )
	public void printMethod (int m) {
		if (m<0 || m>12) {
			System.out.println(" 잘못된 입력 값입니다. 1 ~ 12 까지만 입력이 가능합니다.");
			return;
		}
		System.out.println(m+" 월 입니다. ");
		
	}
	
	
	
}
