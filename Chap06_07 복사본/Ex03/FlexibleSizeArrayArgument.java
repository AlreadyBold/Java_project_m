package Chap06_07.Ex03;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// 배열의 길이가 고정되지 않고 가변길이 인 경우 
		// 1. Method 1 ( int ... values ) <==  가변길이를 처리하는 input 매개변수 설정  
		method1 () ; 					// 메소드 오버라이딩 : 메소드명은 모두 동일, 매개변수의 타입, 갯수에 따라 해당 메소드 출
		method1 (1,2);
		method1 (1,2,3);
		method1 (1,2,3,4);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);
		method2 (" 안녕 ", " 방가 " );
		method2	(" 월 "," 화 "," 수 "," 목 " ," 금 "," 토 "," 일 ");
		method2 (" 토끼 ", " 호랑이 ", " 여우 ", " 곰 ");
		
		
		
	}
	
	static void method1 (int...values) {
		System.out.println(values.length);
		System.out.println(" ===Arrays.toString====");
		System.out.println(Arrays.toString(values));
		
		for (int i = 0 ;i<values.length;i++) {
			System.out.println(values[i]);
		}
		for (int k : values) {System.out.println(k);}
	
		
		
		
	}
	static void method2 (String...good) {
		System.out.println(good.length);
		System.out.println("====Arrays.toString=====");
		System.out.println(Arrays.toString(good));
		
		for (int i = 0; i<good.length;i++) {
			System.out.println(good[i]);
		}
		for (String k : good) {
			System.out.println(k);
		}
	}
	
	
	
	
	
	
	
	
	
	/*
		static void method1 () {
			System.out.println(" 매개변수가 없는 메소드 호출 ");
		}
		static void method1 (int a, int b) {
			System.out.print(a+" , "+b);
		}
		static void method1 (int a, int b, int c) {
			System.out.print(a+" , "+b+" , "+c);
		}
		static void method1 (int a, int b, int c, int d) {
			System.out.print(a+" , "+b+" , "+c+" , "+d);
		}
		static void method1 (int a, int b, int c, int d, int e) {
			System.out.print(a+" , "+b+" , "+c+" , "+d+" , "+ e);
		}
	*/
	
	

}
