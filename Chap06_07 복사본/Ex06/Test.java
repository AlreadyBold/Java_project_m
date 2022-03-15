package Chap06_07.Ex06;

import java.util.Scanner;


public class Test {

	 
		// 임의의 운동의 이름을 넣고 해당 운동의 구성원 (명수) 를 넣어서 출력하는 프로그램 작성후 , 전체 합 및 평균을 구하는 프로그램을 작성하세요 
		/*예시)
		 * 탁구 2 야구 9 축구 11 농구 6 씨름 2
		 * 출력 ==>
		 * 탁구 : 2 야구 : 9 축구 : 11 농구 : 6 씨름 : 2
		 * 운동종목의 구성원 총 합계 : 
		 * 운동종목의 평균 구성원 수 :
		 * "그만" 이라고 입력하면 프로그램 종료 
		 */
	static void sports (String...values) {
		int sum = 0;		
		double avg ;	
		for (int i = 1 ; i<values.length; i+=2) {
			sum = sum+ Integer.parseInt(values[i]);
			
}
		avg = (double) sum / (values.length/2);
		System.out.println();
		System.out.println("선수의 합계는 "+sum+" 이고 평균은 "+avg+" 입니다. ");
}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 임의의 운동의 이름과 해당 운동의 구성원을 입력하세요 ");
		System.out.println(" \"그만\" 이라고 입력하면 프로그램 종료");
		
		while(true) {
			
		if ( sc.equals("그만")) 	{break; }
			else {
			
		
		String num = sc.nextLine(); 

		String [] arr1 = num.split(" ");

		for ( int i = 0 ; i< arr1.length; i++) {
	
			System.out.print(arr1[i]+" ");}

		sports(arr1); 	
	

		}
		}
		System.out.println(" 프로그램을 종료 합니다. ");
		sc.close();}




	
	
	
	
	
	
	
	
}
