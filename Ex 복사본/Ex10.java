package Ex;
public class Ex10 {
	public static void main(String[] args) {

		/*
		 [문항 10] 반복문을 이용하여 369 게임에서 박수를 쳐야 하는 경우를 순서대로 화면에 출력해보자. 
		 1 부터 시작하며 99 까지만 한다. 실행 사례는 다음과 같다.
		 
			3 박수 짝
			6 박수 짝
			9 박수 짝
			13 박수 짝
			16 박수 짝
			19 박수 짝
			23 박수 짝
			26 박수 짝
			29 박수 짝
			30 박수 짝
			31 박수 짝
			32 박수 짝
			33 박수 짝짝
			34 박수 짝
			35 박수 짝
			36 박수 짝짝
			37 박수 짝
		 */
		
		int a, b ;   // a <== 10 의 자리를 표현하는 변수, b는 1의 자리를 표현하는 변수 
		
		for ( int i = 1 ; i < 100 ; i++) {
			a = i/10 ; 		// a = 10의 자리를 의미, i를 10으로 나누어서 몫만 가져온다. 
			b = i%10 ;      // b = 1의 자리를 의미 , i를 10으로 나누어서 나머지 맋만 가져온다.

			if ((a==3 || a==6 || a==9) && (b==3 || b==6 || b==9)) {
				System.out.println( i + " : 박수 짝짝");
			} else if ( (a==3 || a==6 || a==9 ) && ( b!=3 || b!=6 || b!=9)) {
				System.out.println(i + " : 박수 짝");
			} else if ( (a!=3 || a!=6 || a!=9 ) && (b==3 || b==6 || b==9)) {
				System.out.println(i + " : 박수 짝");
			}
			
		}	
		
		
		
		
		
	}
}
