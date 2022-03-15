package Chap05;

import java.util.Arrays;

public class CreateStringObject_02 {

	public static void main(String[] args) {
		// 객체의 값을 복사한 후 수정 했을때의 변화 
		// 1. 문자열 수정( 객체내의 내용은 변경이 불가 ==> 새로운 객체가 생성 )
		String str1= new String(" 안 녕 ");
		String str2= str1;  		// 참조 자료형일때는 Stack의 주소값을 복사
		
		str1=" 안 녕 하 세 요 . ";		// 별도의 메모리 공간에 "안녕하세요"가 생성 
		
		System.out.println(str1);	// 안녕하세요
		System.out.println(str2);	// 안녕 
		System.out.println();
		
		
		// 배열인 경우 (값을 변경하면 수정이 된다.) 
		
		int [] array1 = new int [] {3,4,5};
		int [] array2 = array1;
		
		array1[0]=6;
		array1[1]=7;
		array1[2]=8;
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		
	}

}
