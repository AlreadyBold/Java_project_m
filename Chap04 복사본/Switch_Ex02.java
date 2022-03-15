package Chap04;
public class Switch_Ex02 {
	public static void main(String[] args) {
		
		//1.  Switch 문에서 Break를 처리 하지 않았을때 : 해당 case 로 이동한후 하위의 case ㄹ르 모두 실행한다. 
		
		int value1 = 2;
		
		switch (value1) {
		case 1:
			System.out.println("A 학점");
		case 2:
			System.out.println("B 학점");
		case 3:
			System.out.println("C 학점");
		default :
			System.out.println("F학점");
		}
		
		
		System.out.println("=================================");
		
		
		// 2. break 가 포함된경우 
		
		int value2 = 3;
		
		switch (value2) {
		case 1:
			System.out.println("A 학점");
			break;
		case 2:
			System.out.println("B 학점");
			break;
		case 3:
			System.out.println("C 학점");
			break;
		default :
			System.out.println("F학점");		//switch 의 마지막 case 는 break를 생략 가능
		}
		
		System.out.println("======================");
		value2 = 2;
		
		if ( value2 == 1 ) {
			System.out.println("A 학점(if)");
		} else if (value2 == 2) {
			System.out.println("B 학점(if)");
		} else if (value2 == 3) {
			System.out.println("C 학점(if)");
		} else {
			System.out.println("F 학점(if)");
		}
		
		/*
		 * switch 문 사용해서 점수가 7점 이상은 pass, 7점 이하는 fail 을 출력 ( 점수 : 1 ~ 10)
		 */
		
		int a = 5; 
		
		switch (a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
		}
		
		
		
		
	}
}
