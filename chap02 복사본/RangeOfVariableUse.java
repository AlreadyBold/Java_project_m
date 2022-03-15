package chap02;
public class RangeOfVariableUse {
	public static void main(String[] args) {
		// 변수의 소멸 시기 - 전역 변수, 지역 변수 	
		int value1 = 3;		// 전역 변수 : 블락 밖에서 선언된 변수, 블락밖, 블락내에서도 사용가능  
		{
			int value2 = 5;	//지역 변수 : 블락 안에서 선언된 변수 , 블락 내에서만 사용
			System.out.println(value1);
			System.out.println(value2);
			
		}
		System.out.println(value1);
//		System.out.println(value2);   //지역 변수는 블락 내에서만 사용됨 
		
	}
}
