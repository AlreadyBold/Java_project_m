package Chap06_07.Ex94;

/* ������ this Ű���� �ڵ� �߰� */
// 1. Ŭ���� ���ο��� �ʵ� , �޼ҵ� �̸� �տ� 


class A {
	int m,n;
	
	void init(int a, int b) {
		int c; c=3;		// a,b,c�� �������� (stack ������ ������� ���� ������.) init() �޼ҵ� �����ÿ� stack�����ǰ� �޼ҵ尡 ������ �Ҹ� 
		this.m=a ;		// this Ű�� ������ , �����Ϸ��� �ڵ����� �߰� 
		this.n=b ;		// this Ű�� ������ , �����Ϸ��� �ڵ����� �߰�
	}
	void work() {
		this.init(2,3);	 // this Ű�� ������ , �����Ϸ��� �ڵ����� �߰�
	System.out.println(this.m + " , "+this.n);	//this �� ���� ����, ������ �����Ϸ��� �ڵ����� �߰�
	}
}
public class ThisKeyword_1 {
		
	public static void main(String[] args) {
		//2. ��ü ����
		
		A a= new A();
		
		//3. �޼ҵ� ȣ��
		a.work();
	}

}
