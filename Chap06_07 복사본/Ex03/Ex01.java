package Chap06_07.Ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	// 스캐너로 정수를 인풋받아서 평균, 합계 구하기 ( 정수의 갯수에 상관없이 )
	static void math (String...values) {
				int sum = 0;		// 들어오는 정수를 합하는 변수 
				double avg ;		// 평균값을 구하는 변수 
				for (int i = 0 ; i<values.length; i++) {
					sum = sum+ Integer.parseInt(values[i]);	//Interger.parseInt = 숫자 String 타입을 정수로 변환 
					//sum += Interger.parseInt(values[i]);
	}
				avg = (double) sum / values.length;
				System.out.println();
				System.out.println("합계는 "+sum+" 이고 평균은 "+avg+" 입니다. ");
	}
	
	public static void main(String[] args) {
		System.out.println(" 정수를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();	// 공백이 들어가므로 전체 정수 값을 String으로 
		String [] array1 = num.split(" ");
		for ( int i = 0 ; i< array1.length; i++) {
			System.out.print(array1[i]+" ");}
		math(array1); 	// 가변길이 메소드 math를 호출하면서 매개변수로 array1을 넣음 	
			
		}/*int number [];
		number = new int [];
		number = sc.nextInt[] ;*/
		
	}
