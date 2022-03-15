package Chap05;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		int[] arr2 = new int[300];
		// for 문을 사용해서 arr2 배열의 각방에 값을 입력 
		
		for ( int i = 0 ; i < arr2.length; i++) {		
			arr2[i] = (i+1) *3 ;						
		}
		
		// 출력 구문 for 
		for ( int i = 0 ; i < arr2.length; i++) {
			System.out.println(i + "번째방의 값 : " + arr2[i]);
		}
		System.out.println("================");
		// 향상된(Enhanced ) for 문  
		for (int g : arr2 ) {
			System.out.println( g );
		}
		System.out.println("=====================");
		
		// Arrays.toString(arr1)
		System.out.println(Arrays.toString(arr2));
		
		
		System.out.println("=========홀수 번의 방만 출력===============");
		
		for ( int i = 100 ; i < arr2.length; i++) {
			if ( i%2 ==1)
			System.out.println(i + "번째방의 값 : " + arr2[i]);
		}

		
	}

}
