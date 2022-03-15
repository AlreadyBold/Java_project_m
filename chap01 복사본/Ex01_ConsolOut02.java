package chap01;
public class Ex01_ConsolOut02 {
	public static void main(String[] args) {
		
		System.out.printf("나의 나이는 %d 입니다. \n", 30);		//"출력포멧",인자, 인자,
				//%d 는 정수 값을 인자로 받을때 사용 (10진수)
		System.out.printf("%o\n",10);  //%o 는 8진수를 인자값으로 받을때
		System.out.printf("%x\n", 30); //%x 는 16진수를 인자값으로 받을때 
		System.out.printf("%s\n", "출력");  //%s 는 문자열을 인자값으로 받을때 
		System.out.printf("%f\n", 5.800000); //%f를 실수값을 인자 값으로 받을때
		System.out.printf("%4.2f\n" , 5.8);  //%4.2f는 전체 4자리, 소숫점이하 2자리를 인풋 받을때 
		System.out.printf("%d 와 %4.2f", 10, 5.8);
		
	}
}
