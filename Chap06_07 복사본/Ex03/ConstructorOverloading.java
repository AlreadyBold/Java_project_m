package Chap06_07.Ex03;
// ������ �����ε� : �ϳ��� ������ �� ������Ÿ��, ������ ���� �ٸ� �����ڰ� ȣ�� 
// ���� ) ������ Ÿ�Ե� ���� , ������ ���� ��� �ΰ��̻� ������ ���� 

class Abc{
	int a, b, c ;
	String d ;
	Abc(int a){ 												// �Ű������� 1���� ������ 
		this.a=a; System.out.println(a);
	}
	Abc(int a, int b){											// �Ű������� 2���� ������ 
		this.a=a; this.b=b; System.out.println(a + " , "+ b);
	}
	Abc(int a , int b, int c){									// �Ű������� 3���� ������ 
		this.a=a ; this.b=b; this.c=c; System.out.println(a + " , "+ b+" , "+c);
	}
	Abc(String d){
		this.d=d; System.out.println(d);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc(1,2,3);
		Abc abc1 = new Abc(1,2);
		Abc abc2 = new Abc(" ��� ���� ");		//�Ű������� ���� ������ Ÿ���� �ٸ��� �ش� �޼ҵ带 ȣ�� 
		Abc abc3 = new Abc(1);
	}

}
