package Chap06_07.Ex06;
//객체의 필드에 값을 할당하는 방식 : 3가지 
// 1. 필드에 직접 값을 부여하는 방식 							<== 객체를 생성 후 
// 2. setter를 통해서 객체에 필드에 값을 부여 ( 컨트롤이 된다 )		<== 객체를 생성 후 
// 3. 생성자를 통해 객체의 필드 값을 부여 ( 컨트롤이 된다 ) 		<== 객체를 생성할때 초기값으로 필드에 값을 할 
class Aa{	// 1. 객체생성후 직접필드에 값을 할당 
	String name ;	// 이름 
	int age; 		// 나이 
	String mail;		// 메일 주소 
	void print () {
		System.out.println("name : " + name + "Age : "+ age + " E-Mail address : "+ mail) ;
	}
}
class Bb{ 	// 2. setter 를 통해서 객체의 필드의 값을 할당 
	String name ;	// 이름 
	int age; 		// 나이 
	String mail;		// 메일 주소 
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	void print () {
		System.out.println("name : " + name + "Age : "+ age + " E-Mail address : "+ mail) ;
	}
}
class Cc{ 	// 3. 생성자를 통해서 객체의 필드의 값을 할당 
	
	String name;	// 이름 
	int age; 		// 나이 
	String mail;		// 메일 주소 
	Cc(String name, int b, String c) {
		this.name=name; this.age=b; this.mail=c;
	}
	void print () {
		System.out.println("name : " + name + "Age : "+ age + " E-Mail address : "+ mail) ;
	}
}
public class FieldOfValue {

	public static void main(String[] args) {
		// 1. 객체의 필드에 직접 값을 할당. 
		Aa aa = new Aa();
		aa.age=26;
		aa.mail="junheong@nate.com";
		aa.name = " 이준형 ";
		aa.print();
		
		// 2. 객체의 setter 를 사용해서 필드의 값을 부여 
		Bb bb = new Bb();
		bb.setAge(26);
		bb.setMail(" junheong@nate.com ");
		bb.setName(" 이준형 ");
		bb.print();
		// 3. 생성자를 사용해서 필드의 값을 부여 
		Cc cc = new Cc(" 이준형 ",26," junheong@nate.com");
		cc.print();

	}

}
