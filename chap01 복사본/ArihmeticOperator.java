package chap01;
import java.util.Scanner;
public class ArihmeticOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 하세요");
		
		int time = sc.nextInt();  // 스캐너에서 인풋값을 받아서 time 변수에 할당
		int scond = time % 60 ; // % : 나눈 나머지 값,  초. 
		int minite = (time / 60) %60 ; // 분
		int hour = (time / 60) / 60 ; // 시간 
		
		System.out.println(time + "  초는 " );
		System.out.println(hour + "시간, ");
		System.out.println(minite + "분, ");
		System.out.println(scond + "초 입니다. ");	
	}
}
