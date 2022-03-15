package Ex;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
	
			boolean run = true ;
			Scanner sc = new Scanner(System.in);
			
			while(run) {	
				System.out.println("=================");
				
				System.out.println(" 1.  19단 출력  2. 홀수단만 출력  3. 3의 배수단만 출력  4. 종료 ");
				
				System.out.println("=================");
				int nu = 0 ;
				
				nu = sc.nextInt() ;
				
			if (nu == 1) {	//이중 for문을 사용해서 19단 출력 
				for (int i = 1; i<20 ; i ++) {
					for (int j = 1; j<20; j++) {
						System.out.println(i+ " * " +j+ " = "+ i*j);
					}
				}
			
			} else if ( nu == 2) {
				for (int a= 1; a<20; a+=2) {
					for (int b = 1; b<20; b++) {
						System.out.println(a+ " * " +b+ " = "+ a*b);
					}
				}
				
			} else if ( nu == 3) {
				for(int c= 3; c<20; c+=3) {
					for (int d = 1; d<20; d++) {
					System.out.println(c+ " * " +d+ " = "+ c*d);
					}
				}
				
			}else if ( nu == 4) {
			break; 
		}
			} 
		
		
	
		
System.out.println("프로그램을 종료합니다. ");
sc.close();
			}
	}

	


