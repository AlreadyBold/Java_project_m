package Chap06_07.Ex94;
// ����� this Ű���� �߰� : �ݵ�� this key�� ����ؾ� �Ǵ°�� 
class Aa{		//this key �� ������� �ʴ� ��� : ���������� �ν� 
	int m, n;
	void init (int m, int n) {
		m = m ; n = n;		// this Ű�� ������� �ʴ� ��� m/n<== �������� m/n
	}	
}
class Bb{
	int m , n;
	void init(int m, int n) {
		this.m=m;			// this Ű�� ��������� �ݵ�� ����ؼ� m�� �ʵ��� m�̶�� �˷�����Ѵ�.
		this.n=n;
	}
}
public class ThisKeyword_2 {

	public static void main(String[] args) {
		// 1. �ʵ� ��� �������� ���� ���� ��� ( this Ű���带 ������� �ʴ� ��� )
		Aa aa = new Aa();
		aa.init(2,3);
		System.out.println(aa.m);	//0
		System.out.println(aa.n);	//0
		// 2. �ʵ� ��� �������� ���� ���� ��� ( this Ű���带 ����ϴ� ��� : �ʵ� ������ ���� )
		Bb bb = new Bb();
		bb.init(2, 1);
		System.out.println(bb.m);	//2
		System.out.println(bb.n);	//1

	}

}
