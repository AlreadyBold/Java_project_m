package Chap06_07.Ex06;

import java.util.Scanner;

public class Test_Review {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ��̸� ������ ���� ������ �̿��ؼ� �Է� �ϼ���. ");
		
		String str ; 		// ��ü String ���� ��ǲ �޴� ���� 
		int sum = 0 ;		// ��� �������� ����� ���� �����ϴ� ���� 
		double avg = 0;		// ����� ���ϴ� ���� : ��ü �������� �� / ������ �� 
		String[ ] arr ;		// ������ �������� �߶� �迭�� �����ϴ� ���� 
		int memberCount = 0;
		int b = 0 ;			// �� ������ �������� ��� ���� 
		
		do {
			str = sc.nextLine();	// sc.next = ��������� String  	sc.nextLine : enter���� String
			if ( str.equals("�׸�")) {break;} 	 	// str�� �����ڷ����̹Ƿ� str.equlas() 
			arr = str.split(" "); 					// str�� ������ �������� �߶� arr�迭�� ���� 
			for ( int i = 0 ; i< arr.length; i++) {	// arr.length : �迭�� index 0 ~ ������ ����� 
				if ( i%2 !=0) {						// i : �� ��ȣ �̰� ���ڸ� ������´�. 
					b =Integer.parseInt(arr[i]);	// �� ���� String Ÿ���� ������ ��ȯ 
					sum +=b;	// sum = sum + b	// sum : ��ü �������� �� .
					memberCount++;	// avg = sum / memberCount
				}
			}
			avg= (double) sum/memberCount ; 		// ���
			System.out.println("������ �հ�� "+sum+" �̰� ����� "+avg+" �Դϴ�. ");
		} while ( true );

	}

}
