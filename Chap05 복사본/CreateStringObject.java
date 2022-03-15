package Chap05;

public class CreateStringObject {

	public static void main(String[] args) {
		// 1. String 객체 생성 1 : new 키를 사용해서 객체 생성 ==> Heap 영역에 별도의 공간에 저장
			// RAM의 값을 절대 공유하지 않는다.
		String str1 = new String (" 안 녕 ") ;  // new 키는 객체를 생성하라. (Heap 메모리에 저장)
		System.out.println(str1);  	// String은 객체를 출력했을 객체의 값이 출력 // String만 가지는 특수한 기능 
									// 객체자체를 출력하면, Heap메모리에 번지수를 출력 // 객체의 값을 출력할때는 객체명.toString() 재정의 
		String str11= new String(" 안 녕 "); // str1 과 str11 은 별도의 메모리 공간에 저장된다. (Heap)
				
		if (str1 == str11) {System.out.println(true);  // == : 참조자료형일 경우 참조하는 주소를 비교한다. 
		}else {
			System.out.println(false);
		}
		
		
		
		// 리터럴의 값을 바로 할당 : 같은 값일 경우 RAM의 값을 공유하게 된다. 
		String str2 = " 안 녕 하 세 요 ! ";  		 
		String str22 = " 안 녕 하 세 요 ! "; 	// 동일한 메모리 공간을 공유 하게 된다. 
		
		if (str2 == str22) {
			System.out.println(true);  		// true : 같은 주소를 가르킨다. 
		} else {
			System.out.println(false);
		}
			
		
		

	}

}
