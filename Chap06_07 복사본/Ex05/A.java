package Chap06_07.Ex05;
// �ʵ��� �⺻ ���� �����ڴ� public , protected, default , private
// Ŭ���� �̸�, �ʵ��, �޼ҵ��, �����ڸ� <== ���������ڰ� �ݵ�� �Ҵ��� �Ǿ��ֽ��ϴ�.
public class A {
	int m = 3;		// �ʵ��� �⺻ ���� �����ڴ� default : ������ , ������Ű�� �������� ��
	int n = 4;		// default : ���� ��Ű�� ���� �ٸ� Ŭ���� ���� ���ٰ��� , �ٸ� ��Ű���� Ŭ���������� ���� �Ұ� 
					// private : �ܺ� Ŭ�������� ���� �Ұ� 
	public int k = 10; 	// public : �ٸ� ��Ű������ ������ ���� 				
	void print () {		// default : ���� ��Ű������ Ŭ���������� ��� ���� 
		System.out.println(" ����Ʈ ���� " + m + " , "+ n);
	}
	public void print2 () {
		System.out.println(" �ܺ� ��Ű���� �ٸ� Ŭ�������� ���� ���� " +k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
