package Chap06_07.Ex05;

import Chap06_07.Ex06.Bcd;

// import Chap06_07.Ex06.Ex06_Abc; �����߻� : Abc class�� ���������ڰ� default : �ܺ���Ű������ ���� �Ұ� 
public class External_Abc  extends Bcd{		//
	// �θ� Ŭ���� : Bcd, �ڽ� Ŭ���� : External_Abc
	public static void main(String[] args) {
		// Abc abc2 = new Abc(); 	// class ���������ڰ� default ���� ���� �Ұ�.
		Bcd bcd1 = new Bcd();
		External_Abc ext = new External_Abc();
		// �ٸ� ��Ű������ �ʵ� ȣ�� : 1. import (public : Ŭ���� ���� ������)
							//	2. ��ü���� , 3. ���� ������ Ȯ�� �� ���� (�ʵ�, �޼ҵ�) 
		bcd1.a = 1000;		// public : �ٸ� ��Ű������ ���ٰ��� 
		ext.b = 2000;		// �ڽ� Ŭ�������� �θ�Ŭ������ protected�� �ٸ� ��Ű������ ���� ( ��Ӱ��� )

	}

}
