package Chap05;

public class MethodOfString_02 {

	public static void main(String[] args) {
				// 5. 문자열 수정
				// toLowerCase() : 소문자로 변환 /  toUpperCase() : 대문자로 변환 
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println();
		
				// replace(old,new) : old를 new로 바꿈 
		System.out.println(str1.replace("Study", " 공부 "));
		
				// substring( 시작index(방번호) , 글자를 자를 마지막index앞까지 ) : 문자열을 잘라서 출력
		
		System.out.println(str1.substring(0, 4));
		System.out.println(str1.substring(6, 8));
		
				//	split() : 특정문자를 기준으로 잘라서 String[] 배열에 저장 
		String str11= "abc/def-ghi";
		
		
		
				
				
				
				
				
				// 6. 문자열의 내용 비교 (.equals() : 대소문자 구분하면서 값을 비교 // .equalsIgnoreCase () : 대소문자 구분 없이 값을 비교
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
				// 메모리의 주소값 비교 ( == )
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str2);
		
				// 메모리의 값을 비교 ( equals() / equalsIgnoreCase() )
		System.out.println(str2.equals(str4));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str4));
		
		
		
	}

}
