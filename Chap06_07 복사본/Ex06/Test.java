package Chap06_07.Ex06;

import java.util.Scanner;


public class Test {

	 
		// ������ ��� �̸��� �ְ� �ش� ��� ������ (���) �� �־ ����ϴ� ���α׷� �ۼ��� , ��ü �� �� ����� ���ϴ� ���α׷��� �ۼ��ϼ��� 
		/*����)
		 * Ź�� 2 �߱� 9 �౸ 11 �� 6 ���� 2
		 * ��� ==>
		 * Ź�� : 2 �߱� : 9 �౸ : 11 �� : 6 ���� : 2
		 * ������� ������ �� �հ� : 
		 * ������� ��� ������ �� :
		 * "�׸�" �̶�� �Է��ϸ� ���α׷� ���� 
		 */
	static void sports (String...values) {
		int sum = 0;		
		double avg ;	
		for (int i = 1 ; i<values.length; i+=2) {
			sum = sum+ Integer.parseInt(values[i]);
			
}
		avg = (double) sum / (values.length/2);
		System.out.println();
		System.out.println("������ �հ�� "+sum+" �̰� ����� "+avg+" �Դϴ�. ");
}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ������ ��� �̸��� �ش� ��� �������� �Է��ϼ��� ");
		System.out.println(" \"�׸�\" �̶�� �Է��ϸ� ���α׷� ����");
		
		while(true) {
			
		if ( sc.equals("�׸�")) 	{break; }
			else {
			
		
		String num = sc.nextLine(); 

		String [] arr1 = num.split(" ");

		for ( int i = 0 ; i< arr1.length; i++) {
	
			System.out.print(arr1[i]+" ");}

		sports(arr1); 	
	

		}
		}
		System.out.println(" ���α׷��� ���� �մϴ�. ");
		sc.close();}




	
	
	
	
	
	
	
	
}
