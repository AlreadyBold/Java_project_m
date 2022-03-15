package Chap05;

public class SharingStringObject {

	public static void main(String[] args) {
		// 1. 문자열 객체 공유 ( 리터럴로 생성한 경우 ) new 키워드로 생성한 경우 ( 별도의 공간에 생성 )
		
		String str1 = new String(" 안녕 "); 		//new 생성 시 RAM 공유하지 않는다.
		String str2 = " 안녕 ";
		String str3 = " 안녕 ";
		String str4 = new String(" 안녕 ");
		
		// 각 변수의 메모리 주소 비교 (==) 
		
		System.out.println(str1 == str2);  		//false
		System.out.println(str2 == str3);		//true
		System.out.println(str3 == str4);		//false
		System.out.println(str4 == str1);		//false
		System.out.println("==========");
		
		// 각 변수메모리의 값을 비교 : 변수명1.equals(변수명2) <== 참조자료형일때 값을 비
		
		System.out.println(str1.equals(str2)); 	//true
		System.out.println(str2.equals(str3));	//true
		System.out.println(str3.equals(str4));	//true
		System.out.println(str4.equals(str1));	//true
		
		
		
		
	}
	

}
