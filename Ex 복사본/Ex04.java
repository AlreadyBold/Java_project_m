package Ex;
public class Ex04 {
	public static void main(String[] args) {
		int lineCount;	//다음 라인으로 개행 변수
		int starCount;  //별을 출력 하는 변수
		
		for ( lineCount = 0 ; lineCount < 4 ; lineCount++) {
			for (starCount = 0 ; starCount <= lineCount ; starCount++) {
				System.out.print("*"); System.out.print("1");;
			}
			System.out.println();
		}	
	}

}
