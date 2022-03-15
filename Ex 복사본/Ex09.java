package Ex;
public class Ex09 {
	public static void main(String[] args) {
		/*
		 [문항 9] 정수를 10 개 저장하는 배열을 만들고 1 에서 10 까지 범위의 정수를 랜
		덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
		
		
		랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
		평균은 5.4
		[Hint] 1 에서 10 까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라.
		int i = (int)(Math.random()*10+1);
		 */
		
		double c = (double) Math.random();		// 난수 발생기 (임의의 수를 자동으로 발생시킴 
			// 0.000000xxx ~ 0.999999xxx    <== 범위의 임의의 값을 발생시킴
		System.out.println(c);
		
		int d = (int) (Math.random() * 10 );  // 0 ~ 9 까지의 랜덤한 값을 생성 
		int e = (int) (Math.random() * 10 + 1);  // 1부터 10 까지의 랜덤한 값을 생성 
		
		System.out.println("0부터 9 까지의 랜덤한 값 : " + d);
		System.out.println("1 부터 10 까지의 랜덤한 값 : " + e);
		
		// 1부터 100 까지의 난수를 발생시킴 
		int f = (int) (Math.random() *100 + 1);
		System.out.println("1부터 100 까지의 랜덤한 값 : " + f);
			
		
	}
}
