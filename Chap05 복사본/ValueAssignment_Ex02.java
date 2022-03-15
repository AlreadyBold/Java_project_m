package Chap05;
public class ValueAssignment_Ex02 {
	public static void main(String[] args) {
		//1. 배열 변수의 방에 값 할당 하기  ( 3가지 )
		int[] array1 = new int[3];   // 배열 변수 : array1, 방크기 : 3, 방번호(index): 0,1,2
					// array1[0], array1[1], array1[2]
		
		//배열의 각 방에 값을 할당 
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2]); 
		
		System.out.println("==========================");
		
		int[] array2;
		array2 = new int[3];   

			//배열의 각 방에 값을 할당 
			array2[0] = 3;
			array2[1] = 4;
			array2[2] = 5;
			
			System.out.println(array2[0] + " " + array2[1] + " " + array2[2]); 
			
		// 배열의 원소값을 대입 방법 2  : <<<배열의 넣을 초기 값을 알때 사용>>>
		int[] array3 = new int[] {6,7,8,9,10}; // 배열 변수 선언과 동시에 값할당. 
		System.out.println( array3[0] + " " + array3[1] + " " + array3[2] + " " + 
		 array3[3] + " " + array3[4]);
		
		System.out.println("==================");
		
		int[] array4 ;
		array4 = new int[] { 3,4,5 } ;
		System.out.println( array4[2]);			//index : 2 번의 값만 출력 
		
		System.out.println("========================");
		
		// 배열의 원소 값을 대입하는 방법 3
		int[] array5 = { 11,12,13 };
		System.out.println(array5[0] + " " + array5[1] + " " + array5[2]);
		
		/*  <<<오류 발생 >>> 
		int[] array6 ; 
		array6 = {11, 12,13 } ;
		System.out.println( array6[0] + " " + array6[1] + " " + array6[2]);
		*/ 
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			

 	}
}
