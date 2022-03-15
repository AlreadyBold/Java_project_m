package Chap05;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {

		int[] arr1 = new int[100];
		// for 문을 사용해서 arr1 배열의 각방에 값을 입력 
		
		for ( int i = 0 ; i < arr1.length; i++) {		// for 문을 사용해서 배역 방에 값을 할당. 
			arr1[i] = i + 1;						// arr1[0 ~99] = i + 1; 배열 변수에 값을 넣어준다. 			
		}
		
		// 출력 구문 for 
		for ( int i = 0 ; i < arr1.length; i++) {
			System.out.println(i + "번째방의 값 : " + arr1[i]);
		}
		System.out.println("================");
		// 향상된(Enhanced ) for 문  
		for (int g : arr1 ) {
			System.out.println( g );
		}
		System.out.println("=====================");
		
		// Arrays.toString(arr1)
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		
		
		
	}

}
