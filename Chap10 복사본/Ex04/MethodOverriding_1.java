package Chap10.Ex04;
//�޼ҵ� �������̵�
class Animal{
	void cry() {
		
	}
}

class Bird extends Animal{
	@Override
	void cry() {
		System.out.println(" ±± ");
	}
}
class Cat extends Animal{
	@Override
	void cry() {
		System.out.println(" �߿� ");
	}
}
class Dog extends Animal{
	@Override 
	void cry () { 
		System.out.println(" �۸� ");
	}
}
public class MethodOverriding_1 {

	public static void main(String[] args) {
		// 1. ������ Ÿ������ ���� + ������ Ÿ������ ���� 
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		System.out.println("===========");
		
		// 2. Animal Ÿ������ ���� + �ڽ� Ÿ������ ���� : ���� ���ε��� ���ؼ� �θ��� cry() �� ȣ�� �� ��� �ڽ��� �����ε� �� �޼ҵ�� ���ε� �� 
		
		Animal ab = new Bird ();
		Animal ac = new Cat();
		Animal ad = new Dog();
		ab.cry();
		ac.cry();
		ad.cry();
		System.out.println("===========");
		// 3. ��ü �迭�� ���� 
		Animal[] animal = { ab, ac, ad};
		//��üŸ�Թ迭  �迭�̸�  {��ü ��ü ��ü }
		
		for (Animal k : animal ) {
			k.cry();}
		
		System.out.println("===========");
		
		for ( int i = 0 ; i< animal.length; i++) {
			animal[i].cry();}
		
		
		
	}

}
