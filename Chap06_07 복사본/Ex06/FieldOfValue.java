package Chap06_07.Ex06;
//��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� : 3���� 
// 1. �ʵ忡 ���� ���� �ο��ϴ� ��� 							<== ��ü�� ���� �� 
// 2. setter�� ���ؼ� ��ü�� �ʵ忡 ���� �ο� ( ��Ʈ���� �ȴ� )		<== ��ü�� ���� �� 
// 3. �����ڸ� ���� ��ü�� �ʵ� ���� �ο� ( ��Ʈ���� �ȴ� ) 		<== ��ü�� �����Ҷ� �ʱⰪ���� �ʵ忡 ���� �� 
class Aa{	// 1. ��ü������ �����ʵ忡 ���� �Ҵ� 
	String name ;	// �̸� 
	int age; 		// ���� 
	String mail;		// ���� �ּ� 
	void print () {
		System.out.println("name : " + name + "Age : "+ age + " E-Mail address : "+ mail) ;
	}
}
class Bb{ 	// 2. setter �� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ� 
	String name ;	// �̸� 
	int age; 		// ���� 
	String mail;		// ���� �ּ� 
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
class Cc{ 	// 3. �����ڸ� ���ؼ� ��ü�� �ʵ��� ���� �Ҵ� 
	
	String name;	// �̸� 
	int age; 		// ���� 
	String mail;		// ���� �ּ� 
	Cc(String name, int b, String c) {
		this.name=name; this.age=b; this.mail=c;
	}
	void print () {
		System.out.println("name : " + name + "Age : "+ age + " E-Mail address : "+ mail) ;
	}
}
public class FieldOfValue {

	public static void main(String[] args) {
		// 1. ��ü�� �ʵ忡 ���� ���� �Ҵ�. 
		Aa aa = new Aa();
		aa.age=26;
		aa.mail="junheong@nate.com";
		aa.name = " ������ ";
		aa.print();
		
		// 2. ��ü�� setter �� ����ؼ� �ʵ��� ���� �ο� 
		Bb bb = new Bb();
		bb.setAge(26);
		bb.setMail(" junheong@nate.com ");
		bb.setName(" ������ ");
		bb.print();
		// 3. �����ڸ� ����ؼ� �ʵ��� ���� �ο� 
		Cc cc = new Cc(" ������ ",26," junheong@nate.com");
		cc.print();

	}

}
