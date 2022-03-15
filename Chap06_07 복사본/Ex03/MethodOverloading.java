package Chap06_07.Ex03;


class B{
	static String name = "bts";		// static Ű�� �Ҵ��� �Ǹ� ��ü���� ���� ȣ
	
	static void print () {			
		System.out.println(" static �� ���� �޼ҵ� �Դϴ�. ");
		
	}
	
}




public class MethodOverloading {
	public static void main(String[] args) {
			// �޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű� ����Ÿ��, ������ ���� ���� �ٸ� �޼ҵ尡 ȣ��� (Java)
			// �޼ҵ� �������̵� : ��ӿ��� �θ�Ŭ������ �޼ҵ带 �������ؼ� ��
			// static : ��ü�� �������� �ٷ� ȣ���ؼ� ��밡���ϵ��� �� �� �ִ� Ű���� 
			// ��ü�̸��� �ƴ϶� Ŭ���� �̸����� ȣ���ؼ� ��밡�� 
		B.print();						// ��ü�̸��� �ƴ� Ŭ�����̸����� ȣ���� ���� 
		System.out.println(B.name); 	// Ŭ���� �̸����� ȣ�� 
		print1();						// static�� �� �ְ� ������ Ŭ������ ������ �޼ҵ�� �ٷ� ȣ�� ����
		print1(3);						// �Ű������� 1���̰� ����Ÿ���� �޼ҵ带 ȣ��
		print1(30.8);					// �Ű������� 1���̰� doubleŸ���� �޼ҵ� ȣ��
		print1(2,5);					// �Ű������� 2���̰� int, int Ÿ���� �޼ҵ� ȣ�� 
		
	}
		// �޼ҵ� �������̵� : �޼ҵ��̸��� ���� , �Ű�����Ÿ�� , �Ű����� ������ ���� �ش� �޼ҵ带 ȣ�� 
		// JVM�� ������ �޼ҵ� �̸��� ������Ÿ���̳� ������ ���� �ش� �޼ҵ带 �۵� 
	
		// ���� : ������ �Ű�����Ÿ�԰� ������ ������ �޼ҵ尡 �����ϴ� ��� ���� �߻� 
	public static void print1(){		//�޼ҵ� �̸� �տ� static : 
		System.out.println(" �����Ͱ� �����ϴ�. ");
	}
	public static void print1(int a) {
		System.out.println("int : " + a);
	}
	public static void print1(double a) {
		System.out.println("double : " + a);
	}
	public static void print1(int a ,int b) {
		System.out.println(" a : " + a + " b : " + b);
	}
	/* public static void print1(int c, int d) {
		System.out.println(c   +    d);
	}*/
}
