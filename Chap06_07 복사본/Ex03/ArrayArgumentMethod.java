package Chap06_07.Ex03;

import java.util.Arrays;

public class ArrayArgumentMethod {
	// static 키가 있으면서 같은 클래스에 존재하는 메소드 == > 객체생성없이 메소드이름으로 바로호출이 가능하다. 
	// 다른패키지에서 접근 가능하도록 설정 : 접근 제어자 (public , protected , default , private)
	// 접근제어자가 생략 되어 있으면 : default ( 같은 패키지에서 접근 가능 )
	public static void printArray (int[]a) { 	
		//System.out.println(Arrays.toString(a));
		// for문을사용해서 출력
		// 향상된for문을 사용해서 출력
	for(int i=0 ; i<a.length ; i++) {
		System.out.print(a[i]+" "); 
		}
	
	for(int k : a) {
		System.out.print(k + " ");}
		}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// 배열을 매개변수로 가지는 메소드 호출
		int [] a = new int[] {1,2,3};
		printArray(a); 
		printArray(new int [] {4,5,6,7,8,9});
		//printArray(new int[] {4,5,6,7,8});
		
		
		
	}

}
