package Chap05;
public class Array_Definition_Ex01 {
	public static void main(String[] args) {
		/*
		 * 배열 변수 선언 방법 
		 *    - 배열은 하나의 배열 변수에 많은 데이터를 저장.
		 *    - 배열은 선언시 동일한 자료형의 값을 저장. ( 컬렉션은 여러 데이터 타입을 저장)
		 *    - 배열은 배열의 값을 저장할 방크기를 지정하면 방크기를 수정 할 수 없다. 
		 *    	    (컬렉션은 방크기가 자동으로 늘어난다. )
		 */
		
		// 배열 선언 방법 1
		
		int[] array1 = new int[3];		// 배열 을 선언과 동시에 배열의 방크기를 할당 : 자료형[]
		
		int[] array2 ;				//배열의 변수를 선언
		array2= new int[3];			//배열 변수의 방크기를 지정 
		
		//배열 변수 선언 방법 2
		
		int array3[] = new int[3];		// 배열 변수 선언과 동시에 방크기 지정 : 변수명[]
		
		int array4[] ;
		array4 = new int[3]; 
		
		//다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열 )
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		
		
		
		

	}

}
