package Chap06_07.Ex06;
class Aaa{
	int m = 3; 			// �ʵ� ( �ν��Ͻ� �ʵ� ) : ��ü�� �����Ŀ� ��� ���� 
	static int n = 4;	// �ʵ� ( static �ʵ� ) 
	
	void print1 () {		// �޼ҵ� (�ν��Ͻ� �޼ҵ�) : ��ü�� ���� �� ȣ�� ���� 
	// �ν��Ͻ� �ʵ�� static �ʵ尡 �� �� �ִ�.
		System.out.println(" �ν��Ͻ� �޼ҵ� ��� " + " : m : "+m+" , n : "+n);
		
	}
	static void print2 () {	// �޼ҵ� (static �޼ҵ�) : ��ü�� �������� ȣ�Ⱑ�� , ��ü ���� �Ŀ��� ȣ�� ���� 
	// static �޼ҵ� �������� �ν��Ͻ� �ʵ尡 �� �� ����. 
		System.out.println(" ����ƽ �޼ҵ� ��� "+ " n : "+n); 
	}
}
public class Static_1 {

	public static void main(String[] args) {
		// 1. ��ü ������ �ʵ�� �޼ҵ� ȣ�� ( �ν��Ͻ� �ʵ�, static�ʵ�, �ν��Ͻ��޼ҵ� ,static�޼ҵ� ) ��� ȣ��
		Aaa aaa = new Aaa();
		aaa.m = 10;		// �ν��Ͻ� �ʵ� ȣ�� 
		aaa.n=20;		// static �ʵ� ȣ�� 
		aaa.print1();	// �ν��Ͻ� �޼ҵ� ȣ�� 
		aaa.print2();	// static �޼ҵ� ȣ�� 
		
		// 2. ��ü �������� �ʵ�� �޼ҵ� ȣ�� ( static�ʵ�� static �޼ҵ常 ȣ���� ���� )
		Aaa.n = 100;	// static �ʵ� : ��ü �������� Ŭ���������� ȣ�� �� 
		Aaa.print2();	// static �޼ҵ� : Ŭ���������� ȣ�� 
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);
		
	}

}
