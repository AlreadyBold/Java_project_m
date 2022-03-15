package Chap10.Ex04;

class Animal3 extends Object {		// 부모 클래스  , 모든 클래스는 Object클래스를 상속한다. 
	String name ;
	int age  ;
	
	void cry() {
		System.out.println(" 동물은 웁니다. ");
	}

	@Override		// object.tostring 메소드는 객체자체를 출력할때 호출이 된다. 
	public String toString() {			// 객체의 주소를 출력합니다. [ 패키지명.클래스명@객체의메모리의해시코드 ]
		// TODO Auto-generated method stub
		return "이름은 : " + name + ", 나이는 : "+age+"입니다. "
;	}
	
}
class Tiger3 extends Animal3 {	
	Tiger3(){}
	Tiger3(String a, int b){	// 생성자 : 객체를 생성할때 메모리의 초기값을 할당 할 때 사용. 
		super.name = a;		// super : 부모 클래스 / this : 자기자신의 객체 
		super.age = b;
	}
	
	
	@Override 
	void cry() {
		//super.cry();			// super 키워드는 부모클래스, super : 상속관계일 때 부모 클래스 
								// this 키워드는 자기자신의 객체 , 
		System.out.println(" 호랑이는 어흥하고 웁니다. ");
		
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
		System.out.println(" 고양이는 야옹 하고 웁니다. ");
	}
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String a, int b){		// 생성자 
		super.name = a ;
		super.age = b;
	}
	
	
	@Override
	void cry (){
		//super.cry();
		System.out.println( " 개는 멍멍하고 웁니다. ");
	}
}
public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();	// a3 객체 생성 
		
		System.out.println(a3);	// 객체자체를 출력할경우 , Object클래스의 toString 메소드가 호출 / Object.toString() : 객체의 메모리주소의 해시코드를 출력
								// Chap10.Ex04.Animal3@72ea2f77 < == 패키지명.객체명@해시코드 
		System.out.println(a3.toString()); 
		
		// 객체자체를 출력하면 object클래스의 tostring메소드를 호출 
		
		Animal3 t3 = new Tiger3();	//Tiger3를 Animal3로 업캐스팅 
		Animal3 c3 = new Cat3();	//Cat3를 Animal3로 업캐스팅 
		Animal3 d3 = new Dog3();
		
		
		t3.cry();		// 부모의 cry() 를 호출할 경우 오버라이딩된 tiger3 의 cry()를 호출 
		c3.cry(); 		// Animal3.cry를 호출할 경우 오버라이딩된 Cat3의 cry()를 호출 
		d3.cry(); 
		
		Animal3[] arr = {t3,c3,d3} ;
		
		for (int i = 1; i<arr.length; i++) {
			arr[i].cry();
			
		}
		for (Animal3 k : arr) {
			k.cry();
		}
	
		Animal3 aa3 = new Tiger3(" 호랑이 ", 5);
		Animal3 cc3 = new Cat3(" 고양이 ", 3);
		Animal3 dd3 = new Dog3(" 개 ", 10);
		
		System.out.println(aa3);	//객체자체를 출력시 , 기본적으로는 객체의 메모리 해시코드가 출력 
		System.out.println(cc3);	// object의 tostring() 메소드를 재정의 
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
