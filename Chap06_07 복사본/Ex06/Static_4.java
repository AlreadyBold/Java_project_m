package Chap06_07.Ex06;
class Cde{
	String name; 			// �ν��Ͻ� �ʵ� : ��üȭ �ؾ� ��밡�� 
	int age;				// �ν��Ͻ� �ʵ� 
	
	static String email;	// ����ƽ �ʵ� : ��ü���� ���� ��밡�� ( Ŭ������.�ʵ��) + ��ü ������ ��� 
	static int num ;
	
}

public class Static_4 {

	public static void main(String[] args) {
		Cde cde1 = new Cde();
		// �ν��Ͻ� �ʵ� : ��üȭ �ؾ����� ��밡�� 
		cde1.name = " ȫ�浿 ";
		cde1.age=30;
		
		// static �ʵ� : ��üȭ �ؼ� ��밡�� 
		cde1.email = "aaa@aaa.com";
		cde1.num=4;
		
		// ��ü�������� static �ʵ� ȣ�� : Ŭ���� ������ ȣ���� ���� :<< ���� ���� >> 
		Cde.email = "bbb@bbb.com";
		Cde.num = 5;
		
		Cde cde2 = new Cde();
		Cde cde3 = new Cde();
		Cde cde4 = new Cde();
		// �ν��Ͻ� �ʵ� : Heap������ ����ǰ�, ����ü���� �������� �ʴ� ������ ���� ������. 
		cde2.name = " ������ ";
		cde2.age = 50 ;
		cde3.name = " ������� ";
		cde3.age = 60 ;
		cde4.name = " �Ż��Ӵ� ";
		cde4.age = 40 ;
		// �ν��Ͻ� �ʵ� �� ��� 
		System.out.println(cde2.name + " , "+ cde2.age);
		System.out.println(cde3.name + " , "+ cde3.age);
		System.out.println(cde4.name + " , "+ cde4.age);
		// static �ʵ��� ���� �����ϸ� ��簴ü���� ��� ���� 
		cde2.email = "kkk@kkk.com";
		cde2.num = 55;
		System.out.println(cde2.email + " , "+ cde2.num);
		System.out.println(cde3.email + " , "+ cde3.num);
		System.out.println(cde4.email + " , "+ cde4.num);
	}

}
