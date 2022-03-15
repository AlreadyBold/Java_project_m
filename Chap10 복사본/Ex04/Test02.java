package Chap10.Ex04;

class Animal3 extends Object {		// �θ� Ŭ����  , ��� Ŭ������ ObjectŬ������ ����Ѵ�. 
	String name ;
	int age  ;
	
	void cry() {
		System.out.println(" ������ ��ϴ�. ");
	}

	@Override		// object.tostring �޼ҵ�� ��ü��ü�� ����Ҷ� ȣ���� �ȴ�. 
	public String toString() {			// ��ü�� �ּҸ� ����մϴ�. [ ��Ű����.Ŭ������@��ü�Ǹ޸����ؽ��ڵ� ]
		// TODO Auto-generated method stub
		return "�̸��� : " + name + ", ���̴� : "+age+"�Դϴ�. "
;	}
	
}
class Tiger3 extends Animal3 {	
	Tiger3(){}
	Tiger3(String a, int b){	// ������ : ��ü�� �����Ҷ� �޸��� �ʱⰪ�� �Ҵ� �� �� ���. 
		super.name = a;		// super : �θ� Ŭ���� / this : �ڱ��ڽ��� ��ü 
		super.age = b;
	}
	
	
	@Override 
	void cry() {
		//super.cry();			// super Ű����� �θ�Ŭ����, super : ��Ӱ����� �� �θ� Ŭ���� 
								// this Ű����� �ڱ��ڽ��� ��ü , 
		System.out.println(" ȣ���̴� �����ϰ� ��ϴ�. ");
		
	}
}
class Cat3 extends Animal3 {
	Cat3(){}
	Cat3 (String a, int b){
		super.name = a;
		super.age = b;
	}
	
	
	@Override
	void cry() {
		//super.cry();
		System.out.println(" ����̴� �߿� �ϰ� ��ϴ�. ");
	}
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String a, int b){		// ������ 
		super.name = a ;
		super.age = b;
	}
	
	
	@Override
	void cry (){
		//super.cry();
		System.out.println( " ���� �۸��ϰ� ��ϴ�. ");
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();	// a3 ��ü ���� 
		
		System.out.println(a3);	// ��ü��ü�� ����Ұ�� , ObjectŬ������ toString �޼ҵ尡 ȣ�� / Object.toString() : ��ü�� �޸��ּ��� �ؽ��ڵ带 ���
								// Chap10.Ex04.Animal3@72ea2f77 < == ��Ű����.��ü��@�ؽ��ڵ� 
		System.out.println(a3.toString()); 
		
		// ��ü��ü�� ����ϸ� objectŬ������ tostring�޼ҵ带 ȣ�� 
		
		Animal3 t3 = new Tiger3();	//Tiger3�� Animal3�� ��ĳ���� 
		Animal3 c3 = new Cat3();	//Cat3�� Animal3�� ��ĳ���� 
		Animal3 d3 = new Dog3();
		
		
		t3.cry();		// �θ��� cry() �� ȣ���� ��� �������̵��� tiger3 �� cry()�� ȣ�� 
		c3.cry(); 		// Animal3.cry�� ȣ���� ��� �������̵��� Cat3�� cry()�� ȣ�� 
		d3.cry(); 
		
		Animal3[] arr = {t3,c3,d3} ;
		
		for (int i = 1; i<arr.length; i++) {
			arr[i].cry();
			
		}
		for (Animal3 k : arr) {
			k.cry();
		}
	
		Animal3 aa3 = new Tiger3(" ȣ���� ", 5);
		Animal3 cc3 = new Cat3(" ����� ", 3);
		Animal3 dd3 = new Dog3(" �� ", 10);
		
		System.out.println(aa3);	//��ü��ü�� ��½� , �⺻�����δ� ��ü�� �޸� �ؽ��ڵ尡 ��� 
		System.out.println(cc3);	// object�� tostring() �޼ҵ带 ������ 
		System.out.println(dd3);
		
		Animal3[] arr2 = {aa3, cc3, dd3};
		
		for ( int i = 0 ; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		for ( Animal3 k : arr2) {
			System.out.println(k);
		}
	}

}
