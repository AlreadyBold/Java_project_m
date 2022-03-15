package chap01;

public class Hello02 {
	//메소드 선언 (메소드 : 객체지향언어에서 함수(인풋값을 넣어서 프래그램에따라 결과를 출력)를 메소드라고 호칭한다. )
	public static int sum (int n, int m) {
		return n+m;
	}

	public static void main(String[] args) {
		//변수 선언
		
		int i = 20;		//i변수는 정수만 넣을수 있고 , 초기값으로 20을 할당해서 넣음
		int s ;			//s변수는 정수값만 넣을수 있고, 초기값은 비워둠
		char a ;		//a변수는 한글자만 넣을수 있다. (아스키값) , '(작은따옴표를 사용해서 값을 할당)
		String b ;
		
		b="오늘의 날씨는 맑습니다. ";
		
		s = sum (i,10);	//sum() 메소드 호출 
		a='?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
	
	}
}
