package Chap06_07.Ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	// ��ĳ�ʷ� ������ ��ǲ�޾Ƽ� ���, �հ� ���ϱ� ( ������ ������ ������� )
	static void math (String...values) {
				int sum = 0;		// ������ ������ ���ϴ� ���� 
				double avg ;		// ��հ��� ���ϴ� ���� 
				for (int i = 0 ; i<values.length; i++) {
					sum = sum+ Integer.parseInt(values[i]);	//Interger.parseInt = ���� String Ÿ���� ������ ��ȯ 
					//sum += Interger.parseInt(values[i]);
	}
				avg = (double) sum / values.length;
				System.out.println();
				System.out.println("�հ�� "+sum+" �̰� ����� "+avg+" �Դϴ�. ");
	}
	
	public static void main(String[] args) {
		System.out.println(" ������ �Է��ϼ��� ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();	// ������ ���Ƿ� ��ü ���� ���� String���� 
		String [] array1 = num.split(" ");
		for ( int i = 0 ; i< array1.length; i++) {
			System.out.print(array1[i]+" ");}
		math(array1); 	// �������� �޼ҵ� math�� ȣ���ϸ鼭 �Ű������� array1�� ���� 	
			
		}/*int number [];
		number = new int [];
		number = sc.nextInt[] ;*/
		
	}
