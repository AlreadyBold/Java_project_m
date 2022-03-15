package Chap10.Ex04;
// �޼ҵ� �����ε� ( Method Odverloading) VS �޼ҵ� �������̵� ( Method Overriding )
/*
 *  1. �޼ҵ� �����ε� : ������ �޼ҵ� �̸����� ( �Ű�����Ÿ��, �Ű����� �� ) �� ���� �ش� �޼ҵ尡 ȣ�� 
 * 					��Ӱ��� ������ ���� , �����ڿ��� ���� ��� 
 *  2. �޼ҵ� �������̵� : �ݵ�� ��Ӱ��迡�� ��� 
 *  	�θ��� �޼ҵ带 �ڽĿ��� ���Ӱ� �����ؼ� ��� 
 *  	1. ��Ӱ��� 2. �޼ҵ��� �ñ״��İ� ���ƾ� �Ѵ�. ( �޼ҵ�� , �Ű����� ����, �Ű����� Ÿ�� ) 
 * 		3. �ڽĿ��� �θ��� ���������ڿ� ���ų� �� ���� �������� �Ѵ�.
 */
class Ab{
	void print1 () {	// �������̵� 
		System.out.println(" AbŬ������ print1 () ");
	}
	void print2 () {	// �����ε� 
		System.out.println(" AbŬ������ print2 () ");
	}
}

class Bc extends Ab{ 
	@Override
	void print1 () {
		System.out.println(" BcŬ������ print1 () ");
	}
	void print2(int a ) {
		System.out.println();
	}
}


public class Overloading_VS_Overriding {

	public static void main(String[] args) {
		// 1. ab Ÿ�� ����
		
		Ab aa = new Ab();
		aa.print1();	// Ab Ŭ������ �޼ҵ� ȣ�� 
		aa.print2();	// Ab Ŭ������ �޼ҵ� ȣ�� 

		// 2. Bc Ÿ�� ���� , ������ ȣ�� Bc
		
		Bc bb = new Bc();
		bb.print1();	//Bc Ŭ������ �޼ҵ� ȣ�� 
		bb.print2();	//Ab Ŭ������ �޼ҵ� ȣ�� 
		bb.print2(3);	//Bc Ŭ������ �޼ҵ� print2(int) ȣ
		
		// 3. Ab Ÿ������ ���� + Bc Ÿ�� ������ ȣ��
		Ab cc = new Bc();
		cc.print1();
		cc.print2();
	}

}
