package Chap06_07.Ex94;
//Aaa Ŭ������ �������� �����ڸ� ��� �� ��� this(); ���� ����� ��� : �ߺ��� ���� �Ź� �Է����־���Ѵ�. 
class Aaa{
	int m1 , m2 , m3, m4;	//�ʵ� 4�� ����
	Aaa(){		// ������ : �Ű������� ���� ����
		m1 = 1;
		m2 = 2; 
		m3 = 3; 
		m4 = 4;
	}
	Aaa(int a){
		m1 = a; m2 = 2; 
		m3 = 3; 
		m4 = 4;
	}
	Aaa(int a, int b){
		m1 = a; m2 = b; m3 = 3; m4 = 4;
	}
	void print () {		// �� �޸��� ���� ��� 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println( );
	}
}
//Bbb Ŭ������ �������� �����ڸ� ��� �� ��� this(); ����� ��� : �ߺ��� �� ���� 
class Bbb{
	int m1, m2, m3, m4 ; // �ʵ� 4�� �� 
	Bbb(){
		m1 = 1; m2= 2; m3 = 3; m4=4;	// �ʱⰪ �Ҵ� 
	}
	Bbb (int a){
		this();
		m1=a;
	}
	Bbb(int a, int b){
		this(a);
		m2 = b;
	}
	void print () {		// �� �޸��� ���� ��� 
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println( );
	}
}
public class ThisMethod_2 {

	public static void main(String[] args) {
		Aaa aaa = new Aaa(6,5);
		Aaa aaaa = new Aaa(3);
		Aaa aaaaa= new Aaa();
		aaa.print();
		aaaa.print();
		aaaaa.print();
		
		System.out.println("====this ���=======");
		Bbb bbb = new Bbb(6,5);
		Bbb bbbb = new Bbb(3);
		Bbb bbbbb= new Bbb();
		bbb.print();	// 6 5 3 4
		bbbb.print();	// 3 2 3 4
		bbbbb.print(); 	// 1 2 3 4

	}

}
