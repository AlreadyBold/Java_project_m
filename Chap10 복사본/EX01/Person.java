package Chap10.EX01;

public class Person {		// ��� : �θ� Ŭ������ ( �ʵ�, �޼ҵ� , ����Ŭ���� ) �� �ڽ�Ŭ�������� ��� 
							// ����� ���� : 1. �ߺ��� �ڵ��� ����( �ڵ��� ���� )
										// 2. �ڵ尡 ����������. 3. ������ ( �޼ҵ� �������̵� )
	String name;
	int age;
	void eat() {
		System.out.println(" �θ� Ŭ������ eat () �޼ҵ� ");
	}
	void sleep () {
		System.out.println(" �θ� Ŭ������ sleep() �޼ҵ� ");
	}
}
class Student extends Person	{// ���л� Ŭ���� , person : �θ� , student : �ڽ� 
		// �ڽ� Ŭ������ �θ� Ŭ������ �ʵ�, �޼ҵ� , �̳�Ŭ������ �״�� ��� �޴´�. 
	int studentID ;
	void goToSchool () {
		System.out.println(" �ڽ�Ŭ������ student �޼ҵ� goToSchool ȣ�� ");
	}
	
	
}
class Student_sub extends Student {
	String sub1 ;
	void sub1() {
		System.out.println(" ���� Ŭ������sub1�޼ҵ� ȣ��");
	}
}
	

class Worker extends Person{		// ������ Ŭ����
	int workerID ; // ��� 
	void goToWork() {
		System.out.println(" ������ Ŭ������ gotowokr �޼ҵ� ȣ�� ");
	}
	public static void main(String[] args) {
		// 1. person ��ü ����
		
		Person p = new Person();
		
		p.name = " ȫ �浿 ";
		p.age = 11;
		p.eat();
		p.sleep();
		System.out.println("==========");
		// 2. student ��ü ���� 
		Student s = new Student();		// person Ŭ������ ��� , person Ŭ������ �ʵ�� �޼ҵ带 ��� 
		// person Ŭ������ �ʵ� �� �޼�
		s.name = " �̼��� ";
		s.age = 54;
		s.eat();
		s.sleep();
		// student Ŭ������ �ʵ� �� �޼ҵ� 
		s.studentID = 20200310;			// 
		s.goToSchool();
		
		
		System.out.println("======worker Ŭ����=====");
		// 3. worker ��ü ���� 
		Worker w = new Worker();		// personŬ������ ����Ѵ�. person Ŭ������ �ʵ�� �޼ҵ� ��� 
		// person Ŭ������ �ʵ� �� �޼ҵ� 
				w.name = " ������� ";
				w.age = 60;
				w.eat();
				w.sleep();
		
				// worker Ŭ������ �ʵ� �� �޼ҵ� 
				w.workerID = 20220310;			// 
				w.goToWork();
		
			System.out.println("=====��ü������ Ÿ�� ��ȯ =======");
			
			Person p1 = new Person();	// person () �� person �̴� ( �ڽ��� �θ�� )
			Person ps = new Student();	// ��ĳ���� , student �� person �̴� 
			// Student sp = new Person();	person �� student (	x )
			Person pw = new Worker();	// ��ĳ����, worker�� person�̴� 
			// Worker wp = new Person();	// person �� worker ( x )
			
			Student_sub sub1 = new Student_sub();
			sub1.name = " �Ż��Ӵ� ";
			sub1.age = 50 ;
			sub1.eat();
			sub1.sleep();
			
			sub1.studentID = 20220310;
			sub1.goToSchool();
			sub1.sub1=" ";
			sub1.sub1();
			
		Person ps1 = new Student_sub();
			ps1.name = "BTS";
			ps1.age = 30;
			ps1.eat();
			ps1.sleep();
			
			
		Student ss1 = new Student_sub();		// ��ĳ���� : student_sub�� studentŸ������ ��ĳ���� 
				// person�� student�� �ʵ�� �޼ҵ带 ��밡�� 
			ss1.name = "SES";
			ss1.age=30;
			ss1.eat();
			ss1.sleep();
		Student_sub ss2 = new Student_sub();
			ss2.name = "�����������ܿ� ";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			
			ss2.studentID = 20220310;
			ss2.goToSchool();
			
			ss2.sub1 = "�ڽ��� �ڽ� Ŭ���� ";
			ss2.sub1();
			
		Person ps4 = new Student_sub();
		// Student_sub ��ü ������ person Ÿ������ ��ĳ���� , student_sub�� person �� student�� student_sub�� ��� �ʵ�� �޼ҵ带 �����Ѵ�.
			// �� �߿��� person Ŭ������ �ʵ�� �޼ҵ常 ���� ���� 
		
		Student ss4 = new Student_sub();
		// Student_sub ��ü ������ person Ÿ������ ��ĳ���� , student_sub�� person �� student�� student_sub�� ��� �ʵ�� �޼ҵ带 �����Ѵ�.
					// �� �߿��� person , student Ŭ������ �ʵ�� �޼ҵ常 ���� ���� 
		Student_sub ss5 = new Student_sub();
		// Student_sub ��ü ������ person Ÿ������ ��ĳ���� , student_sub�� person �� student�� student_sub�� ��� �ʵ�� �޼ҵ带 �����Ѵ�.
		// �� �߿��� person , student , student_sub Ŭ������ �ʵ�� �޼ҵ常 ���� ���� 
		
	// �ٿ� ĳ���� : �θ� ������ Ÿ������ ��ĳ���� �Ȱ��� �ڽĵ�����Ÿ������ ��ȯ (�������� ��ȯ)
		
		Student ps5 = (Student)ps4;	// ps4( person , student , student_sub )�� ������Ÿ���� person 
			// ps5 �� person, student�� �ʵ�� �޼ҵ� ���ٰ��� 
		ps5.name="�ٿ�ĳ���� ";
		ps5.age = 30;
		ps5.studentID = 20220310;	// student �ʵ�� �޼ҵ� ��밡�� 
		ps5.goToSchool();			// student �޼ҵ� ��� 
		
		Student_sub ps6 = (Student_sub) ps4 ;	//ps4�� person������Ÿ�Կ��� student_sub�� �ٿ� ĳ���� 
			//student_sub�� �ٿ�ĳ���õ� (person, student, student_sub �� �ʵ�� �޼ҵ� ��� ���� )
		ps6.name = " �� �� �� "; 	// person
		ps6.studentID = 20220310 ;
		ps6.goToSchool();
		ps6.sub1 = "�ڽ��� �ڽ�Ŭ����";
		
		
 		
		
		
		
		
		
		
	}

}
