package Chap06_07.Ex01;

public class C {
		//1. ���� Ÿ���� ���� �޼ҵ� : void �޼ҵ��() { �����ڵ� }
	public void print() {		// public = �ٸ���Ű������ ��밡���ϰ� �ϴ� ���
		System.out.println(" �� �� ");
	}
	
		//2. ����Ÿ���� �ִ� �޼ҵ� (int , double, String . . . )
	public int data() {
		return 3;
	}
		//3. ���� Ÿ���� : double
	public double sum(int a, double b) {
			return a+b;
		}
		//4. ���� Ÿ���� void + �޼ҵ� ���ο��� ������ ���� : ( �Լ��� ���Ḧ �ǹ� )
	public void printMethod (int m) {
		if (m<0 || m>12) {
			System.out.println(" �߸��� �Է� ���Դϴ�. 1 ~ 12 ������ �Է��� �����մϴ�.");
			return;
		}
		System.out.println(m+" �� �Դϴ�. ");
		
	}
	
	
	
}
