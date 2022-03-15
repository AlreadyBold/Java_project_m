package Chap05;

public class ArgumentOfMainMethod_02 {

	public static void main(String[] args) {
		// main 메소드의 인풋 매개 변수로 들어오는 배열의 길이를 구하기 
		System.out.println(args.length);
		System.out.println();
		
		//입력 매개 변수를 for문으로 출력 
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);	
		}
		System.out.println("===============");
		// 입력 매개 변수를 향상된 (enhanced) for 문으로 출력 
		for (String k : args) {
			System.out.println(k);	
		}
		
		
	}

}
