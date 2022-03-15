package chap03;
public class OperatorEx03 {
	public static void main(String[] args) {
		/*
		 * 논리 연산자 (&&, ||, ^ , ! ) : 쇼트 서킷이 발생됨 ( 앞부분의 연산 결과를 인지할수 있을때 뒷부분은 연산을 생략 )
		 * 비트 연산자 (&, |, ^, ~ )       : 쇼트 서킷이 발생되지 않는다. 
		 */
		
		//1. 논리 연산자 AND (&&) : 두 항이 모두 True 일때 결과 가 True
		
		System.out.println(true && true );  //true , 쇼트서킷이 발생되지 않음. 
		System.out.println(true && false);  //false, 쇼트서킷이 발생 되지 않음 
		System.out.println( false && true);  //false, 쇼트서킷이 발생됨 .
		System.out.println(true && (5<3));	//false, 
		System.out.println(( 5<=5) && (7>2));  //true
		System.out.println(( 3 < 2) && (8 < 10));    // false, 쇼트 서킷이 발생됨. 
		
		//OR (||) : 두 항중 하나만 true 이면 결과가 True 
		System.out.println( true || true );  // true , 쇼트 서킷이 발생 
		System.out.println(false || (5<3) );
		System.out.println();
		
		//XOR (^) : 두값이 같을때 False, 두값이 다를때 True 
		System.out.println( true ^ true  );   //false
		System.out.println( false ^ false );  //false 
		System.out.println( true ^ false );   //true
		System.out.println(false ^ true);     //true
		System.out.println( (5<=5) ^ (7>2));   // false
		System.out.println();
	
		//NOT (!) : true 이면 false, false 이면 true
		System.out.println(!true);    //false
		System.out.println(!false);    //true
		System.out.println(false || !(5<3) );  //true
		System.out.println();
		
		// 숏 서킷을 사용 여부 ( 논리연산자일때 발생, 비트연산자일때는 발생되지 않음.)
		int value2 = 3;
		System.out.println(false && ++value2 > 6); // false , 쇼트 서킷이 발생됨. 
		System.out.println(value2);    // 3
		
		int value3 = 3;
		System.out.println(false & ++value3 > 6);  //false , 쇼트 서킷이 발생이 안됨. 
		System.out.println(value3); //4  
		
		int value4 = 3;
		System.out.println(true || ++value4>6); // true 
		System.out.println(value4);	//3 , 쇼트 서킷이 발생
		
		int value5 = 3;
		System.out.println(true | ++value5 > 6); // true
		System.out.println(value5);  //4, 쇼트 서킷이 발생되지 않는다. 	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
