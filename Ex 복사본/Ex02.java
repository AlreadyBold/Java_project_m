package Ex;
public class Ex02 {
	public static void main(String[] args) {

		int sum = 0;	//합한 값을 저장
		int num = 1;
		
		while ( num <= 100) {
			sum += num ; // sum = sum + num ; 
			num ++;
		}
		System.out.println("1 부터 100 까지의 합은 : " + sum);	
	}

}
