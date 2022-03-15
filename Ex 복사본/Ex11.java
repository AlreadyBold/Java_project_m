package Ex;
public class Ex11 {
	public static void main(String[] args) {
		/*
		 [문항 11] 다음 코드와 같이 과목과 점수가 짝을 이루도록 2 개의 배열을 작성하라.
			
			String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
			int score[] = {95, 88, 76, 62, 55};
			그리고 다음 예시와 같이 과목 이름을 입력받아 점수를 출력하는 프로그램을 작
			성하라. "그만"을 입력받으면 종료한다. 
			
			(Java 는 인덱스 0 에 있으므로 score[0]을 출력)
			
			과목 이름 >> Jaba
			없는 과목입니다.
			과목 이름 >> Java
			Java 의 점수는 95
			과목 이름 >> 안드로이드
			안드로이드의 점수는 55
			과목 이름 >> 그만
			
			
			[Hint] 문자열을 비교하기 위해서는 String 클래스의 equals()메소드를 이용해야
			한다.
			String name;
			if(course[i].equals(name)) {
			 int n = score[i];
			 ...
			}
		 */
		//String 에 값을 할당 할때 생성자를 통해서 할당. // 별도의 메모리 공간을 가진다. 
		String aa = new String("안녕");
		String bb = new String("안녕");
		System.out.println(aa);
		System.out.println(bb);
		
		// 기본 자료형일때 : ==   (값을 비교)
		// 참조 자료형일때 : ==   ( 참조하는 주소의 번지를 비교)
		// 참조 자료형일때 값을 비교 : str1.equals(str2)  <== 참조변수 str1 값과 str2에 들어가 있는 값을 비교. 
		
		if ( aa == bb) { 				//메모리의 주소 값을 비교 ( aa , bb는 다른 메모리 주소를 갇는다. 
			System.out.println(true);
		} else {
			System.out.println(false);		// false 출력 ( 가르키는 주소값이 다르다. 
		}
		System.out.println("=================");
		
		if ( aa.equals(bb)) {			// 메모리의 값을 비교할때  aa.equals(bb) 
			System.out.println(true);	// true 가 출력 ( 값을 비교 ) 
		} else {
			System.out.println(false);
		}
		
		System.out.println("=====================");
		System.out.println("======================");
				
		// String 에 값을 리터럴 값을 바로 할당. //메모리 공간을 공유 한다.  
		
		String a = "안녕";  
		String b = "안녕"; 
		
		if ( a==b ) {					//참조 자료형에서 "==" : 메모리의 주소를 비교  
			System.out.println(true);   // true 
		} else {
			System.out.println(false);
		}
		
		
		
		
		
	}
}
