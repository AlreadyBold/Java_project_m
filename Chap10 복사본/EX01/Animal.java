package Chap10.EX01;
class Tiger extends Animal{
	int leg ; 
	void tiger_eat (){
		System.out.println(" 호랑이는 다른 동물을 잡아 먹습니다. ");
	}
}
class Dog extends Animal{
	int dog ; 
	void dog_eat() {
		System.out.println(" 개는 잡식성 동물입니다. ");
	}
}
class Dog_sub extends Dog{
	int dog_sub ;
	void dog_sub() {
		System.out.println(" Dog의 자식 클래스 입니다. ");
	}
}
class Eagle extends Animal{
	int eagle;
	void eagleFly() {
		System.out.println(" 독수리는 날 수 있습니다. ");
	}
}

public class Animal {
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println(" 모든 동물을 음식을 먹습니다. ");
	}
	void sleep() {
		System.out.println(" 모든 동물은 잠을 잡니다. ");
	}
	
	public static void main(String[] args) {
		// 1. Animal 클래스 객체화
		Animal a1 = new Animal();	// 자신의 필드와 메소드만 접
		
		// 2. dog 클래스를 dog 타입으로 객체화  
		Dog d1 = new Dog();			// Animal , Dog 의 필드와 메소드 접근 
		
		// 3. dog 를 animal 타입으로 업캐스팅 
		Animal d2 = new Dog();		// dog는 animal, dog 를 내포하고있고, animal의 필드와 메소드만 접근 
			d2.name = "요크셔테리어 ";
		// 4. dog_sub를 animal 타입으로 업캐스팅 
		Animal d3 = new Dog_sub();	// animal , dog, dog_sub를 내포하고 있고 animal 의 필드와 메소드만 접근 
			d3.name = "셰퍼드 ";
			d3.age = 3;
		// 5 . dog_sub를 dog 데이터 타입으로 업캐스팅 
		Dog d4 = new Dog_sub();		// animal , dog , dog_sub 를 내포하고 있고 dog, animal 의 필드와 메소드만 접근 
		
		// 6 . dog_sub 를 dog_sub 데이터 타입으로 객체화 
		Dog_sub ds1 = new Dog_sub();
		 	ds1.name = "진돗개";
		 	ds1.age = 4 ;		 	
		 	ds1.dog = 3 ;
		 	ds1.dog_sub = 2 ;
		 	
		 	
		 	
		 	
		 	Dog ds1_c1 = ds1 ;				// dog_sub --> dog 업캐스팅 
		 		Dog ds2_c1 = (Dog)ds1;		// 강제 타입 변환 
		 	Animal ds1_c2 = ds1;			// dog_sub --> Animal 타입으로 업캐스팅 
		// 업캐스팅 : 자식타입의 데이터 타입에서 부모데이터 타입으로 변환 
		 	//  부모 타입의 피드와 메소드만 접근
		 	// 강제 타입 변환없이 자동으로 업캐스팅됨.
		 	// ds1은 dog_sub의 데이터 타입을 가지고 있다. ( animal, dog, dog_sub의 모든필드와 메소드 접근 가능 )
		 	
		 	
		 // 다운캐스팅 : 부모데이터타입을 다시 자식 데이터타입으로 변환 
		 	// 강제로 타입 변환이 필요함 
		 	// d2 는 animal , dog, dog_sub 중 animal 타입만 사용하도록 업캐스팅 되어있다 .	
		Dog d2_down1 = (Dog)d2;
		
		
	}

}
