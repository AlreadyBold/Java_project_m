package Chap06_07.Ex94;

/* 묵시적 this 키워드 자동 추가 */
// 1. 클래스 내부에서 필드 , 메소드 이름 앞에 


class A {
	int m,n;
	
	void init(int a, int b) {
		int c; c=3;		// a,b,c는 지역변수 (stack 영역에 변수명과 값을 가진다.) init() 메소드 생성시에 stack생성되고 메소드가 끝나면 소멸 
		this.m=a ;		// this 키를 생략시 , 컴파일러가 자동으로 추가 
		this.n=b ;		// this 키를 생략시 , 컴파일러가 자동으로 추가
	}
	void work() {
		this.init(2,3);	 // this 키를 생략시 , 컴파일러가 자동으로 추가
	System.out.println(this.m + " , "+this.n);	//this 는 생략 가능, 생략시 컴파일러가 자동으로 추가
	}
}
public class ThisKeyword_1 {
		
	public static void main(String[] args) {
		//2. 객체 생성
		
		A a= new A();
		
		//3. 메소드 호출
		a.work();
	}

}
