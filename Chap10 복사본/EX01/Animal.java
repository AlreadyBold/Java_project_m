package Chap10.EX01;
class Tiger extends Animal{
	int leg ; 
	void tiger_eat (){
		System.out.println(" ȣ���̴� �ٸ� ������ ��� �Խ��ϴ�. ");
	}
}
class Dog extends Animal{
	int dog ; 
	void dog_eat() {
		System.out.println(" ���� ��ļ� �����Դϴ�. ");
	}
}
class Dog_sub extends Dog{
	int dog_sub ;
	void dog_sub() {
		System.out.println(" Dog�� �ڽ� Ŭ���� �Դϴ�. ");
	}
}
class Eagle extends Animal{
	int eagle;
	void eagleFly() {
		System.out.println(" �������� �� �� �ֽ��ϴ�. ");
	}
}

public class Animal {
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println(" ��� ������ ������ �Խ��ϴ�. ");
	}
	void sleep() {
		System.out.println(" ��� ������ ���� ��ϴ�. ");
	}
	
	public static void main(String[] args) {
		// 1. Animal Ŭ���� ��üȭ
		Animal a1 = new Animal();	// �ڽ��� �ʵ�� �޼ҵ常 ��
		
		// 2. dog Ŭ������ dog Ÿ������ ��üȭ  
		Dog d1 = new Dog();			// Animal , Dog �� �ʵ�� �޼ҵ� ���� 
		
		// 3. dog �� animal Ÿ������ ��ĳ���� 
		Animal d2 = new Dog();		// dog�� animal, dog �� �����ϰ��ְ�, animal�� �ʵ�� �޼ҵ常 ���� 
			d2.name = "��ũ���׸��� ";
		// 4. dog_sub�� animal Ÿ������ ��ĳ���� 
		Animal d3 = new Dog_sub();	// animal , dog, dog_sub�� �����ϰ� �ְ� animal �� �ʵ�� �޼ҵ常 ���� 
			d3.name = "���۵� ";
			d3.age = 3;
		// 5 . dog_sub�� dog ������ Ÿ������ ��ĳ���� 
		Dog d4 = new Dog_sub();		// animal , dog , dog_sub �� �����ϰ� �ְ� dog, animal �� �ʵ�� �޼ҵ常 ���� 
		
		// 6 . dog_sub �� dog_sub ������ Ÿ������ ��üȭ 
		Dog_sub ds1 = new Dog_sub();
		 	ds1.name = "������";
		 	ds1.age = 4 ;		 	
		 	ds1.dog = 3 ;
		 	ds1.dog_sub = 2 ;
		 	
		 	
		 	
		 	
		 	Dog ds1_c1 = ds1 ;				// dog_sub --> dog ��ĳ���� 
		 		Dog ds2_c1 = (Dog)ds1;		// ���� Ÿ�� ��ȯ 
		 	Animal ds1_c2 = ds1;			// dog_sub --> Animal Ÿ������ ��ĳ���� 
		// ��ĳ���� : �ڽ�Ÿ���� ������ Ÿ�Կ��� �θ����� Ÿ������ ��ȯ 
		 	//  �θ� Ÿ���� �ǵ�� �޼ҵ常 ����
		 	// ���� Ÿ�� ��ȯ���� �ڵ����� ��ĳ���õ�.
		 	// ds1�� dog_sub�� ������ Ÿ���� ������ �ִ�. ( animal, dog, dog_sub�� ����ʵ�� �޼ҵ� ���� ���� )
		 	
		 	
		 // �ٿ�ĳ���� : �θ�����Ÿ���� �ٽ� �ڽ� ������Ÿ������ ��ȯ 
		 	// ������ Ÿ�� ��ȯ�� �ʿ��� 
		 	// d2 �� animal , dog, dog_sub �� animal Ÿ�Ը� ����ϵ��� ��ĳ���� �Ǿ��ִ� .	
		Dog d2_down1 = (Dog)d2;
		
		
	}

}
