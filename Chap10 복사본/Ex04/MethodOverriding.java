package Chap10.Ex04;
// �޼ҵ� �������̵� ( Method Overriding ) :
// 1. �ݵ�� ��Ӱ��迡���� �޼ҵ� �������̵��� ������ �ȴ�.
// 2. �θ�Ŭ�������� ����� �޼ҵ带 �ڽ�Ŭ�������� ���Ӱ� �����ؼ� ����ϴ°�.
// 3. @override	 ��� ������̼��� ����ϸ� �޼ҵ� �����ǽ� ������ ���� �� �ִ�. 
// 4. �ñ״��İ� ���ƾ� �Ѵ�. (�޼ҵ��, �Ű�����Ÿ��, �Ű����� ����)
// 5. �޼ҵ��� ���� �����ڰ� ���ų� �о�� �Ѵ�. 
class A{
	void print() {
		System.out.println("A Ŭ���� ");
	}
}

class B extends A {
	@Override		// �޼ҵ� �������̵���, �ݵ�� �θ��� �޼ҵ带 ������ �ϵ��� ����
					// @override �̳����̼��� ������� ������� : ��Ÿ�� ���ų� ���Ŀ� ���� ���� ��� 
					// ������ �޼ҵ�� ���ǵ� 
	void print() {
		System.out.println(" B Ŭ���� ");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		//1. A Ÿ�� 
		A aa = new A();
		aa.print();			// A Ŭ������ print()��� 
		
		B bb = new B();	
		bb.print();			// B Ŭ������ pring()��� 
		
		A ab = new B();		// <== B�� ��ĳ���� A Ÿ������ �θ� 
		ab.print();			// BŬ������ print() ���  
		
			// ab.print() �� AŬ������ print�� ȣ��, ���� ���ε��� ���ؼ� BŬ������ print() ��� 

	}

}
