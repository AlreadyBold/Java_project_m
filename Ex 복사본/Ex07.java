package Ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*
		 * [문항 7] 양의 정수를 10 개 입력받아 배열에 저장하고, 배열에 저장하고, 배열에
			있는 정수 중에서 3 의 배수만 출력하는 프로그램을 작성하라.
			
			출력 결과 예시) 
			양의 정수 10 개를 입력하시오 >> 1 5 99 22 345 125 2346 55 32 85
			3 의 배수는 99 345 2346
			
		 */
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int [10];		//방의 갯수만 선언 
		
		System.out.println(" 양의 정수 10개를 입력 하세요 >>> ");
		
		for ( int i = 0; i < arr1.length ; i++) {	//for 문을 사용해서 각방에 스캐너에서 던진 값을 저앙
			arr1[i] = sc.nextInt(); 
		}
		
		//3의 배수만 출력 
		
		System.out.print(" 3의 배수는 : ");
		for ( int i = 0 ; i <  arr1.length; i++) {  // 배열의 각방으 값을 가지고 와서
			if ( arr1[i] % 3 == 0) {					// 배열의 방의 값을 가져와서 나머지가 0인경우
				System.out.print(arr1[i] + " , ");
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
