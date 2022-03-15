package Chap10.Ex04;
class Human{	// �θ� Ŭ���� 
	
	String name; 	// �ν��Ͻ� �ʵ� : ��üȭ ���Ѿ� ��� , Heap�� ����  
	int age ;		// �ν��Ͻ� �ʵ� 
	
	void eat() {	// �ν��Ͻ� �޼ҵ� : ��üȭ ���Ѿ� ��밡�� , Heap(pointer: �ּҰ�), Ŭ������������ �ν��Ͻ� �޼ҵ� ������ ���� �޼ҵ��� �ڵ尡 ���� 
		System.out.println( " ����� �Խ��ϴ�. ");
	}
	void sleep() {
		System.out.println(" ����� ���� ��ϴ�. ");
	}
}
class Student extends Human{
	int studentID;
	
	void goToschool() {
		System.out.println(" �л��� �б��� ���ϴ�. ");
	}
}
class Worker extends Human {
	int workerID;
	
	void goToCompany() {
		System.out.println( " ȸ����� ���忡 ���ϴ�. ");
	}
}
public class Test01 {

	public static void main(String[] args) {
		Human h = new Human();		// �θ� Ŭ����  
		h.name = " ȫ �浿 ";			// 
		h.age = 30;
		h.eat();
		h.sleep();
		
		
		Student s = new Student();	// �ڽ� Ŭ���� : �θ�Ŭ������ �ʵ�� �޼ҵ带 ��� �޴´�. 
		s.name = " �Ż��Ӵ� ";	// �θ�Ŭ������ �ʵ� 
		s.eat();			// �θ�Ŭ������ �޼ҵ� 
		s.studentID = 1111; // �ڽ�Ŭ������ �ʵ� 
		s.goToschool(); 	// �ڽ�Ŭ������ �޼ҵ� 
		
		Worker w = new Worker();	// �ڽ�Ŭ���� 
		w.name = " BTS ";	// �θ�Ŭ������ �ʵ� 
		w.eat();			// �θ�Ŭ������ �޼ҵ� 
		w.workerID = 2222;	// �ڽ�Ŭ������ �ʵ� 
		w.goToCompany();	// �ڽ�Ŭ������ �޼ҵ� 
		
		Human h1 = new Student();	// ��ĳ���� : �ڽ� -> �θ� Ÿ������ ���º�ȯ / h1 = human, student Ÿ���� ��� ���� , human�� ���ٰ��� 
		h1.name = " �̼��� ";
		h1.eat();
		
			// �ٿ�ĳ���� : �θ� -> �ڽ� Ÿ������ ���º�ȯ  / if ������ ����ؼ� instanceof�� ����ؼ� ó�� ( ��Ÿ�ӿ��� ���� ) 
		System.out.println(h1 instanceof Student );
		System.out.println(h1 instanceof Human);
		
		
			
		if (h1 instanceof Student) {	// �ٿ�ĳ�����Ҷ� ��Ÿ�ӿ����� �����ϱ� ���� ��ü�� �ٿ�ĳ������ ������ Ÿ���� �����Ҷ� 
			Student s2 = (Student)h1 ;
			s2.studentID=3333;
			s2.goToschool();
		}
		if (h1 instanceof Worker ) {
			Worker w4 = (Worker)h1 ;
		}
		Worker w4 = (Worker)h1 ;		// ������ �߻����� �ʴ´�. ����� ���� �߻� == ��Ÿ�� ���� 
		System.out.println( h1 instanceof Worker );		// false 
		
		
		
		

	}

}
