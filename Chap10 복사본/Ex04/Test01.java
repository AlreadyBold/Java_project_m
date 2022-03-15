package Chap10.Ex04;
class Human{	// 부모 클래스 
	
	String name; 	// 인스턴스 필드 : 객체화 시켜야 사용 , Heap에 저장  
	int age ;		// 인스턴스 필드 
	
	void eat() {	// 인스턴스 메소드 : 객체화 시켜야 사용가능 , Heap(pointer: 주소값), 클래스영역내의 인스턴스 메소드 영역에 실제 메소드의 코드가 저장 
		System.out.println( " 사람은 먹습니다. ");
	}
	void sleep() {
		System.out.println(" 사람은 잠을 잡니다. ");
	}
}
class Student extends Human{
	int studentID;
	
	void goToschool() {
		System.out.println(" 학생은 학교에 갑니다. ");
	}
}
class Worker extends Human {
	int workerID;
	
	void goToCompany() {
		System.out.println( " 회사원은 직장에 갑니다. ");
	}
}
public class Test01 {

	public static void main(String[] args) {
		Human h = new Human();		// 부모 클래스  
		h.name = " 홍 길동 ";			// 
		h.age = 30;
		h.eat();
		h.sleep();
		
		
		Student s = new Student();	// 자식 클래스 : 부모클래스의 필드와 메소드를 상속 받는다. 
		s.name = " 신사임당 ";	// 부모클래스의 필드 
		s.eat();			// 부모클래스의 메소드 
		s.studentID = 1111; // 자식클래스의 필드 
		s.goToschool(); 	// 자식클래스의 메소드 
		
		Worker w = new Worker();	// 자식클래스 
		w.name = " BTS ";	// 부모클래스의 필드 
		w.eat();			// 부모클래스의 메소드 
		w.workerID = 2222;	// 자식클래스의 필드 
		w.goToCompany();	// 자식클래스의 메소드 
		
		Human h1 = new Student();	// 업캐스팅 : 자식 -> 부모 타입으로 형태변환 / h1 = human, student 타입이 모두 저장 , human만 접근가능 
		h1.name = " 이순신 ";
		h1.eat();
		
			// 다운캐스팅 : 부모 -> 자식 타입으로 형태변환  / if 조건을 사용해서 instanceof를 사용해서 처리 ( 런타임오류 방지 ) 
		System.out.println(h1 instanceof Student );
		System.out.println(h1 instanceof Human);
		
		
			
		if (h1 instanceof Student) {	// 다운캐스팅할때 런타임오류를 방지하기 위해 객체의 다운캐스팅할 데이터 타입이 존재할때 
			Student s2 = (Student)h1 ;
			s2.studentID=3333;
			s2.goToschool();
		}
		if (h1 instanceof Worker ) {
			Worker w4 = (Worker)h1 ;
		}
		Worker w4 = (Worker)h1 ;		// 오류가 발생하지 않는다. 실행시 오류 발생 == 런타임 오류 
		System.out.println( h1 instanceof Worker );		// false 
		
		
		
		

	}

}
