package Chap06_07.Ex03;
class Cars {
	String company;		// �ʵ�( �ν��Ͻ� �ʵ� )�� company�� �˷��ִ� this , Heap �޸𸮿� ��
	String model;		// �ν��Ͻ� : ��üȭ�� ���� �� ��� ������ �ʵ� 
	String color;		// [ �ʵ�� : �ʵ��� �� ]�� Heap ������ ���� 
	double maxspeed;
	Cars(String a , String b, String color, double d){
		company = a ;
		model = b ; 	
		this.color = color ; 	// 3���� ���� ��ΰ� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ���� / this Ű�� ��ü�� �ʵ��� ������ ���Ѵ�.
		maxspeed =d;			// this Ű���尡 ������ ���� 
	}
	void work () { // �޼ҵ� (�ν��Ͻ��޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ���� / �޼ҵ��� ��ü������ Ŭ���� ������ �޼ҵ� ������ ����
		System.out.println("������� : "+company+" �𵨸��� : "+model+" ���������� : "+color+" �ְ� �ӷ��� : "+maxspeed);
	
	}
}
public class Q1 {

	public static void main(String[] args) {
		//�����ڸ� ���ؼ� �⺻���� �Ҵ� �� �޸𸮿� ������ work() �޼ҵ带 ����ؼ� ����غ��� 
	Cars aa = new Cars(" ���� "," �ƹݶ� "," black ",232.2);
	aa.work();
	}

}
