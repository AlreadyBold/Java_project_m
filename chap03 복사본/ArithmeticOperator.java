package chap03;
public class ArithmeticOperator {
	public static void main(String[] args) {
		// ++ 는 1씩 증가 , 
		int a = 3; 
		++a;
		System.out.println(a);
		
		int b = 3;
		b++;
		System.out.println(b);
		
		System.out.println("=======================");
		
		int a1 = 3;
		int b1 = ++a1;				//a1의 값을 1증가 시키고 --> 증가 시킨 값을 b1에 값을 할당. 				
		System.out.println(a1);		//4
		System.out.println(b1);		//4 
		
		int a2 = 3;
		int b2 = a2++;				//a2 값을 b2에 대입을 하고 --> a2의 값을 1을 더한다. (후위형)
		System.out.println(a2);
		System.out.println(b2);
		
		System.out.println("================================");
		
		//산술 연산자 
		System.out.println( 2 + 3 );
		System.out.println( 8 - 5 );
		System.out.println(7 * 2 );
		System.out.println( 7 / 2);		// 목 만 가져 올때는 Int 형으로 가져오면 목만 출력 
		System.out.println( 8 % 5);		// 나눈 나머지 값만 출력. 
		
		System.out.println("2 " + "3"); // + 는 두 문자열을 연결하는 연산자 
		
		//증감 연산자 (case 1)
		int value1 = 3;
		value1++ ; 
		System.out.println(value1);
		
		int value2 = 3;
		++value2; 
		System.out.println(value2);
		System.out.println("===========================");
		
		//증감 연산자 (case 2)
		
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3); 
		System.out.println(value4);
		
		int value5 = 3; 
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		
		//증감 연산자 (case 3) 
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("=============");
		
		int value10 = 9;
		System.out.println(++value10);
		System.out.println(value10++);
		
				
		
		
		
		
		
		
	}
}
