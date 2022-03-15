package Chap06_07.Ex01;

// Ŭ���� ( class ) : ��ü�� �����ϱ� ���� Ʋ (���ø�), ���赵, �ؾ�� Ʋ
// ��ü ( object ) : Ŭ������ �����ؼ� RAM���� �۵� �Ǵ� �����ڵ� 
// ��ü = �ν��Ͻ� 
// �ν��Ͻ�ȭ (��üȭ) ��Ų��.
// A a = new A();	<== Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�
class A {		// �ܺ� Ŭ����
	int m = 3;	// �ʵ� (����) : Ŭ����������� ����� ������ �ʵ�� ȣ
				// �ʵ�� �ν��Ͻ�ȭ(��ü) ���Ѿ� ����� ����
				// �ʵ�� �޸��� Heap ������ ���� 
	
	void print() {	// �޼ҵ� : ������������ �Լ� , ��ü������� �Լ��� �޼ҵ��� Ī��
				
		System.out.println(" ��ü ���� �� Ȱ�� ");
	}
}
class B {	// �ܺ� Ŭ���� 
	
	String name = " ȫ�浿 ";
	int age = 24 ;
	String Phone = "010-1111-1111";
	
	void print_name () {
		System.out.println(name);
	}
	void print_age () {
		System.out.println(age);
	}
	void print_phone () {
		System.out.println(Phone);
	}
}



public class CreateObjectAndUsingOfMember {
	public static void main(String[] args) {
		A a = new A();		// Class A�� ��üȭ( �ν��Ͻ�ȭ ) ��Ų��. ( RAM�� �ε��Ų��. )
		System.out.println(a.m);
		a.print();
		
		System.out.println("==========");
		
		A b = new A();		// Class A�� ��üȭ ( �ν��Ͻ�ȭ ) ���Ѽ� RAM�� ��
		
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("========");
		
		B bb = new B();		// Class B�� ��üȭ( �ν��Ͻ�ȭ ) ��Ų��. ( RAM�� �ε��Ų��. )
		bb.print_age();
		bb.print_name();
		bb.print_phone();
		
		B cc = new B();
		cc.print_age();
		cc.print_name();
		cc.print_phone();
		
		
		

	}
}
