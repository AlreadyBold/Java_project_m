package Chap06_07.Ex01;

class Abc {
	int m = 3;			// 필드 ( Heap에 저장 ) , 객체화 시켰을 때 사용 가
	int n = 4;
	
	void work1 () {		// 메소드 ( 인풋값이 없는 메소드)
		int k = 5;		// 메소드 내부 선언 = 필드x 지역변수o ==> stack 영역에 저장, 메소드 종료 시 없어짐  
		System.out.println(k);
		work2(3);		// 다른 메소드 호출 
	}
	
	void work2 (int i) {
		int j = 4;		// 지역 변수 ( stack 공간에 변수와 값이 저장 ) 
		System.out.println(i + j);
		int i1 = 0 ;
		System.out.println(i1);
	}
}
public class fieldComponent {	
	public static void main(String[] args) {
		Abc abc = new Abc();	// abc 객체 생성 
		System.out.println(abc.m);
		System.out.println(abc.n);
		// 메소드 호출 
		abc.work1();
	
		
		
		
		
		
		
		
	}
}
