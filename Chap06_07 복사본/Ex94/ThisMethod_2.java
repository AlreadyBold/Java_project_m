package Chap06_07.Ex94;
//Aaa 클래스는 여러개의 생성자를 사용 할 경우 this(); 없이 사용한 경우 : 중복된 값을 매번 입력해주어야한다. 
class Aaa{
	int m1 , m2 , m3, m4;	//필드 4개 선언
	Aaa(){		// 생성자 : 매개변수가 없는 생성
		m1 = 1;
		m2 = 2; 
		m3 = 3; 
		m4 = 4;
	}
	Aaa(int a){
		m1 = a; m2 = 2; 
		m3 = 3; 
		m4 = 4;
	}
	Aaa(int a, int b){
		m1 = a; m2 = b; m3 = 3; m4 = 4;
	}
	void print () {		// 각 메모리의 값을 출력 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println( );
	}
}
//Bbb 클래스는 여러개의 생성자를 사용 할 경우 this(); 사용한 경우 : 중복된 값 제거 
class Bbb{
	int m1, m2, m3, m4 ; // 필드 4개 선 
	Bbb(){
		m1 = 1; m2= 2; m3 = 3; m4=4;	// 초기값 할당 
	}
	Bbb (int a){
		this();
		m1=a;
	}
	Bbb(int a, int b){
		this(a);
		m2 = b;
	}
	void print () {		// 각 메모리의 값을 출력 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println( );
	}
}
public class ThisMethod_2 {

	public static void main(String[] args) {
		Aaa aaa = new Aaa(6,5);
		Aaa aaaa = new Aaa(3);
		Aaa aaaaa= new Aaa();
		aaa.print();
		aaaa.print();
		aaaaa.print();
		
		System.out.println("====this 사용=======");
		Bbb bbb = new Bbb(6,5);
		Bbb bbbb = new Bbb(3);
		Bbb bbbbb= new Bbb();
		bbb.print();	// 6 5 3 4
		bbbb.print();	// 3 2 3 4
		bbbbb.print(); 	// 1 2 3 4

	}

}
