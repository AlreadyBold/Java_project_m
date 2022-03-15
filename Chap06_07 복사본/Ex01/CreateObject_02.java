package Chap06_07.Ex01;

class Aaa{
	
	String name;			// 필드 : 객체화 시켜야 사용가능, 클래스 블락에서 선언 
	int age;				// 필드의 값들은 Heap 영역에 저장, Heap 영역의 변수의 값들은 강제 초기화  
	double weight;
	String email;			// 필드는 선언만 되고 값이 할당이 되지 않는 경우 :
	boolean man;			// 참조변수 : Null / int : 0 / double : 0.0 / boolean : false
	
	
	public String getName() {			// 메소드 호출 
		return name;
	}
	public void setName(String name) {	// 인풋되는 변수, 받는 변수이름, 메모리 이름이 모두 동일할 경우 
		this.name = name;				// 메모리 이름에 this : 자신의 클래스의 변수 
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
}
	

public class CreateObject_02 {
	public static void main(String[] args) {
		
		Aaa aaa = new Aaa ();			// 객체 생성 (aa) 
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.email);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		// 변수에 값을 직접 대입 [Heap] , 보안상 메모리에 직접 값을 할당하지 않는다. 캡슐
		aaa.name = " 홍 길 동 ";
		aaa.age = 30;
		aaa.email = "aaa@aaa.com";
		aaa.weight = 70.5;
		aaa.man = true;
		// 변수의 값을 출력 
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.email);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		
		// setter를 통해서 값을 대입, 메모리에 값을 넣을때 제어를 할 수 있다. 
		// 달을 저장하는 변수 ( 1월 ~ 12월 )
		aaa.setName(" 세 종 대 왕 ");
		aaa.setAge(60);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(true);
		aaa.setWeight(70.5);
		
		
		// getter 메소드를 통해서 메모리의 값을 출력 
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getWeight());
		System.out.println(aaa.isMan());
	
	
	
	
	
	
	}

}
