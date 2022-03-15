package Ex;

public class Ex05 {

	public static void main(String[] args) {

		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0 ; 
		
		for ( int i =0; i < scores.length ; i++) {
			sum += scores[i];  //sum = sum + scores[i]
		}
		System.out.println("배열의 각 방의 합은 : " + sum );
	}

}
