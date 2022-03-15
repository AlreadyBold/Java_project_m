package Chap10.EX01;

public class Person {		// 상속 : 부모 클래스의 ( 필드, 메소드 , 내부클래스 ) 를 자식클래스에게 상속 
							// 상속의 잇점 : 1. 중복된 코드의 제거( 코드의 재사용 )
										// 2. 코드가 간결해진다. 3. 다형성 ( 메소드 오버라이딩 )
	String name;
	int age;
	void eat() {
		System.out.println(" 부모 클래스의 eat () 메소드 ");
	}
	void sleep () {
		System.out.println(" 부모 클래스의 sleep() 메소드 ");
	}
}
class Student extends Person	{// 대학생 클래스 , person : 부모 , student : 자식 
		// 자식 클래스는 부모 클래스의 필드, 메소드 , 이너클래스를 그대로 상속 받는다. 
	int studentID ;
	void goToSchool () {
		System.out.println(" 자식클래스의 student 메소드 goToSchool 호출 ");
	}
	
	
}
class Student_sub extends Student {
	String sub1 ;
	void sub1() {
		System.out.println(" 서브 클래스의sub1메소드 호출");
	}
}
	

class Worker extends Person{		// 직장인 클래스
	int workerID ; // 사번 
	void goToWork() {
		System.out.println(" 직장인 클래스의 gotowokr 메소드 호출 ");
	}
	public static void main(String[] args) {
		// 1. person 객체 생성
		
		Person p = new Person();
		
		p.name = " 홍 길동 ";
		p.age = 11;
		p.eat();
		p.sleep();
		System.out.println("==========");
		// 2. student 객체 생성 
		Student s = new Student();		// person 클래스를 상속 , person 클래스의 필드와 메소드를 사용 
		// person 클래스의 필드 및 메소
		s.name = " 이순신 ";
		s.age = 54;
		s.eat();
		s.sleep();
		// student 클래스의 필드 및 메소드 
		s.studentID = 20200310;			// 
		s.goToSchool();
		
		
		System.out.println("======worker 클래스=====");
		// 3. worker 객체 생성 
		Worker w = new Worker();		// person클래스를 상속한다. person 클래스의 필드와 메소드 사용 
		// person 클래스의 필드 및 메소드 
				w.name = " 세종대왕 ";
				w.age = 60;
				w.eat();
				w.sleep();
		
				// worker 클래스의 필드 및 메소드 
				w.workerID = 20220310;			// 
				w.goToWork();
		
			System.out.println("=====객체생성시 타입 변환 =======");
			
			Person p1 = new Person();	// person () 은 person 이다 ( 자식은 부모다 )
			Person ps = new Student();	// 업캐스팅 , student 는 person 이다 
			// Student sp = new Person();	person 은 student (	x )
			Person pw = new Worker();	// 업캐스팅, worker는 person이다 
			// Worker wp = new Person();	// person 은 worker ( x )
			
			Student_sub sub1 = new Student_sub();
			sub1.name = " 신사임당 ";
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
			
			
		Student ss1 = new Student_sub();		// 업캐스팅 : student_sub를 student타입으로 업캐스팅 
				// person과 student의 필드와 메소드를 사용가능 
			ss1.name = "SES";
			ss1.age=30;
			ss1.eat();
			ss1.sleep();
		Student_sub ss2 = new Student_sub();
			ss2.name = "봄여름가을겨울 ";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			
			ss2.studentID = 20220310;
			ss2.goToSchool();
			
			ss2.sub1 = "자식의 자식 클래스 ";
			ss2.sub1();
			
		Person ps4 = new Student_sub();
		// Student_sub 객체 생성시 person 타입으로 업캐스팅 , student_sub는 person 과 student와 student_sub의 모든 필드와 메소드를 포함한다.
			// 그 중에서 person 클래스의 필드와 메소드만 접근 가능 
		
		Student ss4 = new Student_sub();
		// Student_sub 객체 생성시 person 타입으로 업캐스팅 , student_sub는 person 과 student와 student_sub의 모든 필드와 메소드를 포함한다.
					// 그 중에서 person , student 클래스의 필드와 메소드만 접근 가능 
		Student_sub ss5 = new Student_sub();
		// Student_sub 객체 생성시 person 타입으로 업캐스팅 , student_sub는 person 과 student와 student_sub의 모든 필드와 메소드를 포함한다.
		// 그 중에서 person , student , student_sub 클래스의 필드와 메소드만 접근 가능 
		
	// 다운 캐스팅 : 부모 데이터 타입으로 업캐스팅 된것을 자식데이터타입으로 변환 (수동으로 변환)
		
		Student ps5 = (Student)ps4;	// ps4( person , student , student_sub )의 데이터타입은 person 
			// ps5 는 person, student의 필드와 메소드 접근가능 
		ps5.name="다운캐스팅 ";
		ps5.age = 30;
		ps5.studentID = 20220310;	// student 필드와 메소드 사용가능 
		ps5.goToSchool();			// student 메소드 사용 
		
		Student_sub ps6 = (Student_sub) ps4 ;	//ps4는 person데이터타입에서 student_sub로 다운 캐스팅 
			//student_sub로 다운캐스팅됨 (person, student, student_sub 의 필드와 메소드 사용 가능 )
		ps6.name = " 이 용 식 "; 	// person
		ps6.studentID = 20220310 ;
		ps6.goToSchool();
		ps6.sub1 = "자식의 자식클래스";
		
		
 		
		
		
		
		
		
		
	}

}
