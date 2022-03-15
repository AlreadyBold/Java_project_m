package Chap05;
public class ReadArrayData_2D_Ex09 {
	public static void main(String[] args) {
		//1. 2차원  데이터 배열의 길이 
		int[][] array1 = new int [2][3]; 
		System.out.println(array1.length);  //2차원 배열인 경우 : .length ( 행의 갯수를 출력) 
		System.out.println(array1[0].length); // 행의 인덱스 0 의 열의 갯수 
		System.out.println(array1[1].length); // 행의 인덱스 1의 열으 갯수 
		
		int[] array11 = new int [10]; 
		System.out.println(array11.length);  // 1차원 배열인 경우 .length (열의 갯수 )
		 System.out.println("============");
		 
		 // 2차원 배열 출력 방법 1 
		 int [][] array2 = new int [][] {{1,2},{3,4,5}}; 
		 System.out.println(array2.length); 		// 2 (행의 갯수 )
		 System.out.println(array2[0].length);		// 2 ( 0번행의 열의 갯수)
		 System.out.println(array2[1].length);		// 3 ( 1번행의 열의 갯수 )
		 System.out.println("=============================");
		 
		 // 배열의 index 번호로 출력하는 방법
		System.out.print( array2[0][0] + " " + array2[0][1]);
		System.out.println();
		System.out.println(array2[1][0] + " " + array2[1][1] + " " + array2[1][2]);
		
		System.out.println("=======이중 for 문을 사용해서 출력 ============");
		// 이중 for 문을 사용해서 출력 하는 방법 
		for ( int i= 0 ; i < array2.length ; i++) {		//바깥쪽 for 문 : 행을 루프 돌린다. 
			for ( int j=0; j< array2[i].length ; j++) { //안쪽 for 문 : 열을 루프 폴린다. 
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();		
		}
		
		System.out.println("===이중 향상된 for 문 =============================");
		
		for ( int[] array : array2) {	 // 2차원 배열의 행의 값을 1차원 배열 변수에 담고  (array) 
			for ( int k: array) {		 // 배열의 값을 변수에 담아서 출력 	
				System.out.print(k + " ");
			}
			 System.out.println();
		}
		
		
		
		
		 


}
}