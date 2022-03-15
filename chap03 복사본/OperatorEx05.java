package chap03;
public class OperatorEx05 {
	public static void main(String[] args) {
		
		//삼항 연산자 :    (조건) ? 참 : 거짓 
		int value1 = (3 > 5) ? 6: 9; // 조건이 거짓이므로 value1에 9가 저장됨
		System.out.println(value1);
		
		int value2 = (5 > 3)? 10:20;  // 조건이 참이므로 value2에 10이 저장됨
		System.out.println(value2);
		
		int value3 = 7;
		System.out.println(  (value3 % 2 == 0) ? "짝수" : "홀수" );
		System.out.println("==================");
		
		//if 문으로 처리 
		if ( value3 % 2 == 0 ) {
			System.out.println("짝수");	//조건이 참일때 실행되는 구문
		}else {
			System.out.println("홀수");	//조건이 거짓일때 실행되는 구문
		}
		
		
	}
}
