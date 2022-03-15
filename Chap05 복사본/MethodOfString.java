package Chap05;

import java.util.Arrays;

public class MethodOfString {

	public static void main(String[] args) {
			// 1.���ڿ� ���� (length()) : int Ÿ������ ��ȯ 
		String str1 = " Hello Java! ";
		String str2 = " �ȳ��ϼ��� ! �ݰ����ϴ�. ";
			// str1 : ���� ���� , ��ü , �ν���
		
		
		System.out.println(str1.length());		// 11
		System.out.println(str2.length());		// 13
			// �ڹٿ��� length �� ���ڼ��� ����. (��)
		System.out.println();
			
			// 2. ���ڿ� �˻� ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1));		// 1�� ���� ���ڿ� ��� : H
		System.out.println(str2.charAt(5));		// 5�� ���� ���ڿ� ��� : ��  
		
		// indexOf() : 0��° �濡�� ���� ������ ����� ������ ���ȣ (index)�� ����� �ش�.
		// lastIndexOf() : ������ ����� 0��° ������ ������ ���ȣ (index)�� ����� �ش�.
		
		System.out.println(str1.indexOf('a'));		// 8
		System.out.println(str2.lastIndexOf("��"));	// 5
		System.out.println(str1.indexOf('a',8)); 	// 8���濡������ ���������� �˻����� 
		System.out.println(str1.lastIndexOf('a',8));// 8���濡������ �������� �˻����� 
		System.out.println(str1.indexOf("Java"));	// 7���濡������ ���������� �˻����� 
		System.out.println(str1.lastIndexOf("Java"));//7���濡������ �������� �˻����� 
		System.out.println(str2.indexOf("�ϼ���"));
		System.out.println(str2.lastIndexOf("�ϼ���"));
		System.out.println(str1.lastIndexOf('k')); 	// ���� ���ڿ� �˻��� -1 ���
			
			// 3. ���ڿ� ��ȯ �� ���� ( String.valueof(), concat() )
			// String.valueOf ( �⺻ �ڷ��� ) : �⺻ �ڷ��� ==> String ���� ��ȯ 
		String str3 = String.valueOf(2.3);			// �Ǽ� 2.3�� String������ ��ȯ 
		String str4 = String.valueOf(false);		// boolean type fasle ==> String���� ��ȯ 
		
		System.out.println(str3);
		System.out.println(str4);
		
			// concat() : ���ڿ��� ���ڿ��� ���� == (+) �����ڿ� ��
		String str5 = str3.concat(str4);
		System.out.println(str5);
		
			
		String str6 = " �� �� " + 3;					// �ȳ�3 , +: �����ڸ� ����Ҷ� �ڵ� ��ȯ 
		String str7 = " �� �� ".concat(String.valueOf(3));// concat���� String Type���� ��ȯ �ʿ� 
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		
			// 4. ���ڿ��� byte[] (byte �迭 Ÿ��) ���� ��ȯ, ����� ���� ó���� �� �����. 
				//getBytes(), ���ڿ� char[] (toCharArray())
		
		String str8 = " Hello Java! ";
		String str9 = " �ȳ��ϼ��� ! ";
			//getBytes() : ���ڿ� ==> byte[] ��ȯ	
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		
		
	}

}
