package Chap06_07.Ex03;

import Chap06_07.Ex01.C;

public class ExternalCallMethods {

	public static void main(String[] args) {
			// ��ü ���� 
		C a = new C(); 			// ���� ��Ű�� ���� Ŭ������ import ���� ȣ���ؼ� ��밡
			// �޼ҵ� ȣ�� 
		a.print();
		int k = a.data();		//3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);	//8.2
		
		a.printMethod(5);		// 1~12 ������ �� 
		a.printMethod(35);
			// ���� :
		System.out.println(a.data());
	//System.out.println(a.print()); ==> ���� �߻� 
		a.print();

	}
	

}
