package Chap10.Ex04;


class Animal2 {
	void run() {
		
	}
}

class Tiger extends Animal2 {
	@Override
	void run() {
		System.out.println(" ȣ���̴� �׹߷� �޸��ϴ�. ");
	}
	void tigerEat() {
		System.out.println(" ȣ���̴� ������ �Խ��ϴ�. ");
	}
	
}
class Eagle extends Animal2 {
	@Override
	void run () {
		System.out.println(" �������� �ϴ��� ���ϴ�. ");
	}
	void eagleEat() {
		System.out.println(" �������� �ٸ� ���� ��� �Խ��ϴ�. ");
	}
}
class Snake extends Animal2 {
	@Override
	void run () {
		System.out.println(" ���� ���ٴմϴ�. ");
	}
}



public class MethodOverriding_2 {

	public static void main(String[] args) {
		// ��� ��ü�� animal Ÿ������ ��ĳ�����ؼ� ���� .
		// Animal2 �迭�� �� ��ü�� ���� 
		// for������ �迭�� ��ü�� ��� .
		// enhanced for ���� ����ؼ� ��ü�� run �޼ҵ� ��� 
		
		
		Animal2 aa = new Tiger ();
		Animal2 bb = new Eagle ();
		Animal2 cc = new Snake ();
		
		Animal2 [] animal2 = {aa,bb,cc};
		System.out.println("========== for ===========");
		for (int i = 0 ; i<animal2.length; i++) {
			animal2[i].run();
		}
		System.out.println("===== enhanced for =======");
		for (Animal2 i : animal2) {
			i.run();
		}
		Tiger aa2 = (Tiger)aa ;
		Eagle bb2 = (Eagle)bb ;
		
		
			Tiger aaa = (Tiger)aa;
			Eagle bbb = (Eagle)bb;
	}
	
}
