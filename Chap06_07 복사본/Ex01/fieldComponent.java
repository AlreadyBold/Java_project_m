package Chap06_07.Ex01;

class Abc {
	int m = 3;			// �ʵ� ( Heap�� ���� ) , ��üȭ ������ �� ��� ��
	int n = 4;
	
	void work1 () {		// �޼ҵ� ( ��ǲ���� ���� �޼ҵ�)
		int k = 5;		// �޼ҵ� ���� ���� = �ʵ�x ��������o ==> stack ������ ����, �޼ҵ� ���� �� ������  
		System.out.println(k);
		work2(3);		// �ٸ� �޼ҵ� ȣ�� 
	}
	
	void work2 (int i) {
		int j = 4;		// ���� ���� ( stack ������ ������ ���� ���� ) 
		System.out.println(i + j);
		int i1 = 0 ;
		System.out.println(i1);
	}
}
public class fieldComponent {	
	public static void main(String[] args) {
		Abc abc = new Abc();	// abc ��ü ���� 
		System.out.println(abc.m);
		System.out.println(abc.n);
		// �޼ҵ� ȣ�� 
		abc.work1();
	
		
		
		
		
		
		
		
	}
}
