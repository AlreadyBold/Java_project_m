package Chap06_07.Ex03;

public class InternalCallMethod {

	public static void main(String[] args) {
		// ���� Ŭ���� �ȿ��� ���θ޼ҵ� ȣ�� :
		// static Ű�� ������� ������쿡�� ��üȭ ���Ѽ� �޼ҵ� ȣ�� (new)
		
		InternalCallMethod aaa = new InternalCallMethod();
		aaa.print(); 	// aaa ��ü�� print �޼ҵ� ȣ�� 
		
		int a = aaa.twice(3);
		System.out.println( a );
		
		double b = aaa.sum(a, 5.8);
		System.out.println(b);
		
	}
	void print() {		// static Ű���� ���� �޼ҵ� ���� , new�� ��üȭ ���Ѽ� ��
		System.out.println(" �ȳ� ");
	}
	int twice(int k ) {
		return k * 2 ;
	}
	double sum (int m, double n) {
		return m+n;
	}
}
