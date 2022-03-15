package Ex;

public class Ex06 {

	public static void main(String[] args) {
		int[] array = {4, 5, 1, 2,200, 3, 100 };
		int max = 0; 	//최대 값을 저장하는 변수 
		
		for ( int i =0 ; i < array.length; i++) {		//각방의 값을 순환 하면서 가지고 온다. 
			if ( array[i] > max) {		// 방의 값이 max 변수의 값보타 클때 
				max = array[i];			// max 변수에 큰값을 저장 
			}
		}
		System.out.println("최대 값은 : " + max);
		
	}

}
