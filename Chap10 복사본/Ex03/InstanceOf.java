package Chap10.Ex03;

// instanceof : ��ü������ ĳ������ ���ɿ��θ� �� �� �ֵ��� �ϴ� Ű����
// ��ĳ������ ��ü ���ο� � Ÿ���� �����ϴ��� true, false�� ���� 
// �ٿ� ĳ���� �� : 
class A{
	int m ;
	void a() {
		System.out.println(" m : " + m);
	}
}
class B extends A{
	int n;
	void b() {
		System.out.println(" n : " + n);
	}
}
public class InstanceOf {

	public static void main(String[] args) {
		// 1. instanceof :
		A aa = new A();		//aa�� AŸ�Ը� ������. 
		A ab = new B();		//ab�� A , B Ÿ���� ������. A�� ���ٰ��� 
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);

		if (aa instanceof B) {
			B b = (B)aa ; 
			System.out.println("aa �� B�� ĳ���� �߽��ϴ�. ");
		} else {
			System.out.println("aa �� BŸ������ ĳ���� �Ұ� ");
		}
		if (ab instanceof B) {
			B b = (B)ab;
			System.out.println("ab �� B�� ĳ���� �߽��ϴ�. ");
		}else {
			System.out.println("ab �� BŸ������ ĳ���� �Ұ� ");
		}
		if ( "�ȳ�" instanceof String) {
			System.out.println("\"�ȳ�\"�� String Ŭ���� �Դϴ�.");
		}
	}

}
