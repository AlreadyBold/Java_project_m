package Chap06_07.Ex01;

class Aaa{
	
	String name;			// �ʵ� : ��üȭ ���Ѿ� ��밡��, Ŭ���� ������� ���� 
	int age;				// �ʵ��� ������ Heap ������ ����, Heap ������ ������ ������ ���� �ʱ�ȭ  
	double weight;
	String email;			// �ʵ�� ���� �ǰ� ���� �Ҵ��� ���� �ʴ� ��� :
	boolean man;			// �������� : Null / int : 0 / double : 0.0 / boolean : false
	
	
	public String getName() {			// �޼ҵ� ȣ�� 
		return name;
	}
	public void setName(String name) {	// ��ǲ�Ǵ� ����, �޴� �����̸�, �޸� �̸��� ��� ������ ��� 
		this.name = name;				// �޸� �̸��� this : �ڽ��� Ŭ������ ���� 
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
		
		Aaa aaa = new Aaa ();			// ��ü ���� (aa) 
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.email);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		// ������ ���� ���� ���� [Heap] , ���Ȼ� �޸𸮿� ���� ���� �Ҵ����� �ʴ´�. ĸ��
		aaa.name = " ȫ �� �� ";
		aaa.age = 30;
		aaa.email = "aaa@aaa.com";
		aaa.weight = 70.5;
		aaa.man = true;
		// ������ ���� ��� 
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.email);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		
		// setter�� ���ؼ� ���� ����, �޸𸮿� ���� ������ ��� �� �� �ִ�. 
		// ���� �����ϴ� ���� ( 1�� ~ 12�� )
		aaa.setName(" �� �� �� �� ");
		aaa.setAge(60);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(true);
		aaa.setWeight(70.5);
		
		
		// getter �޼ҵ带 ���ؼ� �޸��� ���� ��� 
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getWeight());
		System.out.println(aaa.isMan());
	
	
	
	
	
	
	}

}
