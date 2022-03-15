package Chap04;
public class IF_Ex01 {
	public static void main(String[] args) {

		//if 문 : 
		/*
		 * if (조건) {
		 *    조건이 참일때 실행될 코드 ;
		 * }
		 */
		
		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1 : 조건이 참일때 실행 ");
		}
		
		/*
		 * if (조건) {
		 *     조건이 참일때 실행할 문장;
		 * } else {
		 * 	   조건이 거짓일때 실행할 문장;
		 * } 
		 */
		boolean bool1 = true;
		boolean bool2 = false;
		
		if (bool1) {
			System.out.println("실행3");			// 조건이 True 일때 실행
		}else {
			System.out.println("실행 4");			//조건이 false 일때 실행 
		}
		
		if (bool2) {
			System.out.println("실행5");			// 조건이 True 일때 실행
		}else {
			System.out.println("실행 6");			//조건이 false 일때 실행 
		}
		System.out.println("====================");
		
		//if ~ else 는 삼항 연산자로 변환이 가능 
		
		System.out.println( (bool1) ? "실행7" : "실행8"   );  // 참이므로 "실행7"이 출력
		System.out.println( (bool2) ? "실행7" : "실행8"   );  // 거짓이므로 "실행8"이 출력
		
		/*
		 * if의 조건이 여러 개일때 ? 
		 * 
		 * if (조건1) {
		 * 		조건1이 참일때 실행 코드;
		 * } else if (조건2) {
		 * 	     조건2이가 참일때 실행 코드;
		 * } else if (조건3) {
		 * 		 조건3 이 참일때 실행 코드 ;
		 * } else {
		 * 		위의 조건이 모두 만족 하지 않을때 실행할 코드 ;
		 * }
		 */
		
		int value3 = 85;
		
		if (value3 >= 90) {
			System.out.println("A 학점 , 점수 : " + value3);
		}else if ( value3 >= 80) {
			System.out.println("B 학점 , 점수 : " + value3);		//실행후에 if 문을 빠져 나온다. 
		}else if (value3 >=70 ) {
			System.out.println("C 학점 , 점수 : " + value3);
		}else {
			System.out.println("F 학점, 점수 : " + value3);
		}
		
		/* 
		 * IF 문에서 조건의 순서가 바뀌어 있을 경우 
		 */
		value3 = 85;
		if (value3 >= 90) {
			System.out.println("A 학점 , 점수 : " + value3);
		}else if ( value3 >= 70) {
			System.out.println("C 학점 , 점수 : " + value3);		//실행후에 if 문을 빠져 나온다. 
		}else if (value3 >=80 ) {
			System.out.println("B 학점 , 점수 : " + value3);
		}else {
			System.out.println("F 학점, 점수 : " + value3);
		}
		System.out.println("=========================");
		
		/*
		 *  조건을 부여 할때 세밀 하게 적용 
		 *  
		 */
		value3= 75;
		if ( value3 <=100 && value3 >= 90) {
			System.out.println("A 학점");
		}else if ( value3 < 80 && value3 >= 70) {
			System.out.println("C 학점");
		}else if ( value3 < 90 && value3 >= 80) {
			System.out.println("B 학점");
		}else {
			System.out.println("F학점");
		}
		
		/*
		 * if 문에서 실행문이 하나일때 의 {} 를 생략 할 수 있다. 
		 */
		
		System.out.println("=================================");
		
		if ( 3 < 5) 
			System.out.println("안녕하세요");		// if에서 {} 가 생략된 경우 
		
		System.out.println("=====================");
		
		if (3 > 5)
			System.out.println("안녕하세요 2");
		System.out.println("반갑습니다. ");
		
		
	}

}
