package Chap05;
public class PlusOperationOfString {
	public static void main(String[] args) {
			// 1. 문자열 + 문자열 
		String str1 = " 안 녕 " + "하 세 요 " + "!";
		System.out.println(str1);
		
		String str2 = " 반 갑 ";
		str2+= "습 니 다 ";		// str2 = str2 + "습니다" 
		str2+= "!";				// str2 = str2 + "!"
		System.out.println(str2);
			
			// 2. 문자열 + 기본자료형  	//기본자료형이 문자열로 변환  
		String str3 = "안녕" + 1;		// 안녕1
		String str4 = "안녕" + String.valueOf(1); // 안녕1 
		String str5 = "안녕" + "1";	// 안녕1	
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
			// 3. 문자열과 기본 자료형을 혼용해서 사용하는 경우
		System.out.println(1 + " 안 녕 ");
		System.out.println(1 + " 안 녕 "+2);
		System.out.println(" 안 녕 " + 1 + 2 );
		System.out.println(1 + 2 + " 안 녕 ");
	}
}
