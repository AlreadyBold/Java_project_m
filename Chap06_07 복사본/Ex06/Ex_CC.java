package Chap06_07.Ex06;

import Chap06_07.Ex05.C;	// ctrl + shift + o
							// class�� ���� �����ڰ� public 

public class Ex_CC {

	public static void main(String[] args) {
		// �ٸ� Ŭ������ ������ / public�� ���� / model, color �޸𸮷� ���� �Ұ� 
		C c= new C();				// �ٸ� ��Ű�� �̹Ƿ� import 
		// setter �� ���ؼ� �޸� ���� �ο� 
		c.setColor("black");
		c.setModel("VelosterN");
		// company, model, color�� �ٸ���Ű������ ���� �Ұ�, setter�� ���ؼ� �޸� ���� �Ҵ��ϵ��� ���� 
		
		c.maxspeed=280;	// �ٸ� ��Ű���� Ŭ���������� public , protected ( ��� ���� ) 
		c.print();
	}

}
