package chap02;

public class PrimaryDataType_1 {

	public static void main(String[] args) {

		//boolean : true / false 값만 할당 가능 
		boolean bool1 = true;
		boolean bool2 = false;
		//boolean bool3 = 10;
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println("=====정수 : 음의 값, 양수 =======");
		
		byte value1 = -128;   //byte : 1byte, ( -128 ~ 127 )
		//byte value11 = -129; // 오류 발생 
		byte value111 = (byte) -129;	//-129를 byte 타입으로 변환 해서 저장 
		byte value1111 = (byte) 129;
		
		System.out.println(value1);
		System.out.println(value111);
		System.out.println(value1111);
		
		short value2 = -10 ; // short : 2byte (-32768 ~ + 32767)
		//value2 = -32769; 오류 발생 
		value2 = (short) -32769;
		System.out.println(value2);
		
		int value3 = 100 ;
		long value4 = 200L;
		
		//실수 : float, double 
		float value5 = 1.2F;
		double value6 = -1.5;	
		
	}

}
