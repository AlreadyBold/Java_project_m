package Chap06_07.Ex05;

class B {	// �ܺ� Ŭ���� : pubilc�� �� �� ����. default �� �����Ǿ� �ִ�.
	int b = 3;				// default ���� ������ : ���� ��Ű�� ���� �ٸ� Ŭ�������� ���� ���� 
	private int a = 1;		// private ���� ������ : ���� Ŭ���� �������� ��밡�� 
	protected int c	= 3 ;	// protected ���� ������ : default + �ٸ� ��Ű���� ���� ���� ( ��ӵ� ��� �� ���� )
	public int d = 4 ;		// public ���� ������ 
	
		// private < default < protected < public
	private void print1() { 	// ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;

	}

	void print2() { 	// ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;
}
	protected void print3() { 	// ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;
	}
	public void print4() { 	// ���� Ŭ������ �����ϴ� �޼ҵ� 
		a = 10;
		b = 20 ;
		c = 30 ;
		d = 40 ;
	}

public class ExternalClass_1 {

	public static void main(String[] args) {
	B b =new B ();	// ���� Ŭ������ �����ϹǷ� Bclass �� ������ �� �մ�.
	

	}

}
}
