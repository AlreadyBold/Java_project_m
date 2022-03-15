package Chap05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) {   // 메인 메소드[함수]
		/* 메소드의 기본구조 
		 *  void main(String[] args){ void : 리턴값이 없음을 뜻함 // main : 메소드명  // ( 인풋 매개변수 )
		 * 		메소드를 호출시 실행할 코드; }
		 */
		String a = ar[0];
		String b = ar[1];
		String c = ar[2];
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		// main 메소드에 인자값으로 정수나 실수를 넘겨 줄때 String으로 변환 
		System.out.println(b+1);
		System.out.println(c+1);
	
		//String을 정수나 더블 형으로 변환해서 연산
		
		int d = Integer.parseInt(b);  // b(String)  ==> Integer 타입으로 변환 
		double e = Double.parseDouble(c);  //c(String) ==> Double 형으로 변환 
		
		System.out.println(d+1);
		System.out.println(e+1);
	
	}
}
