package chap02;
public class UsageOfDataType {
	public static void main(String[] args) {
		//변수 선언 : 
		  // 자료형 변수명 ;
		  // 자료형 
		
		int a = 3;
		int b;
		b=4;

		System.out.println(a);
		System.out.println(b);
		System.out.println("=================");
		
		a = 10;
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("=================");
		
		//byte a ;		// 선언된 변수는 재선언 할 수 없다. 
		//a = 10.02;		// 정수로 선언된 변수에는 다른 데이터 타입의 값을 넣을 수 없다. 
		
		char c; 			//char 글자 1자 , 
		c = 'A'; 
		System.out.println(c);
		
		String d ;
		d = "오늘은 기온이 많이 떨어 졌습니다.";
		System.out.println(d);
		
		String e = "11강의장";
		System.out.println(e);
		
		
	}

}
