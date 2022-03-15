package Chap06_07.Ex06;

import java.util.Scanner;

public class Test_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 운동이름 구성원 수를 공백을 이용해서 입력 하세요. ");
		
		String str ; 		// 전체 String 값을 인풋 받는 변수 
		int sum = 0 ;		// 운동의 구성원의 멤버의 합을 저장하는 변수 
		double avg = 0;		// 평균을 구하는 변수 : 전체 구성원의 합 / 종목의 수 
		String[ ] arr ;		// 공백을 기준으로 잘라서 배열에 저장하는 변수 
		int memberCount = 0;
		int b = 0 ;			// 각 종목의 구성원을 담는 변수 
		
		do {
			str = sc.nextLine();	// sc.next = 공백까지만 String  	sc.nextLine : enter까지 String
			if ( str.equals("그만")) {break;} 	 	// str은 참조자료형이므로 str.equlas() 
			arr = str.split(" "); 					// str을 공백을 기준으로 잘라서 arr배열에 저장 
			for ( int i = 0 ; i< arr.length; i++) {	// arr.length : 배열의 index 0 ~ 마지막 방까지 
				if ( i%2 !=0) {						// i : 방 번호 이고 숫자만 가지고온다. 
					b =Integer.parseInt(arr[i]);	// 각 방의 String 타입을 정수로 변환 
					sum +=b;	// sum = sum + b	// sum : 전체 구성원의 합 .
					memberCount++;	// avg = sum / memberCount
				}
			}
			avg= (double) sum/memberCount ; 		// 평균
			System.out.println("선수의 합계는 "+sum+" 이고 평균은 "+avg+" 입니다. ");
		} while ( true );

	}

}
