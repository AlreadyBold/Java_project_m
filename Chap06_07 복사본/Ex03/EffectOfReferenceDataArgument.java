package Chap06_07.Ex03;

import java.util.Arrays;
//참조자료형의 메소드 인풋값으로 호출 

public class EffectOfReferenceDataArgument {
	static void modifyData (int [] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	static void printArray( int [] a) {
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int [] array = new int [] {1,2,3};		// 배열변수 선언 : array
		modifyData(array);
		printArray(array);
		
		
		
		
		
		
		
		

	}

}
