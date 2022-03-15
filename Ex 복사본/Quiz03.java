package Ex;
class Student{
	String name;			// 학생이름 
	int studentID;			// 학번 
	int kor ;				// 국어점수	 
	int eng ; 				// 영어점수 
	int math ; 				// 수학점수 
	
	
	int sum 			;	// 합계
	double avg;			// 평균 
	
	void hobby () {
		System.out.println(" 각 학생의 취미는 입니다. ");
	}

	@Override
	public String toString() {
	
		return " 이름은 : " + name +", 학번 : "+studentID+" , 국어점수 : "+kor+" 영어점수 : "+eng+" 수학점수 : "+math+" 합계 : "+sum+" 평균 : "+avg+" 입니다. ";
	}
	
}
class S_철수 extends Student {
	@Override
	void hobby() {
		System.out.println( "철수의 취미는 낚시 입니다. ");
	}
}
class S_영희 extends Student {
	@Override
	void hobby() {
		System.out.println( "영희의 취미는 낚시 입니다. ");
	}
}
class S_영식 extends Student {
	@Override
	void hobby() {
		System.out.println( "영식이의 취미는 낚시 입니다. ");
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new S_철수();
		a.name = " 철수 ";
		a.studentID = 1111;
		a.kor = 10;
		a.eng = 10;
		a.math = 10 ;
		a.sum=a.kor+a.eng+a.math;
		a.avg = a.sum/3;
		a.hobby();
		
		
		
		Student b = new S_영희();
		b.name = " 영희 ";
		b.studentID = 2222;
		b.kor = 20 ;
		b.eng = 20;
		b.math = 20;
		b.sum = b.kor+b.eng+b.math;
		b.avg = b.sum/3;
		b.hobby();
		
		Student c = new S_영식();
		c.name = " 영식 ";
		c.studentID = 3333;
		c.kor = 100;
		c.eng = 80;
		c.math = 99;
		c.sum = c.kor+c.eng+c.math;
		c.avg = c.sum /3 ;
		c.hobby();
		
		Student arr1 [] = {a,b,c};
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("====================");
		for ( int i = 0 ; i <arr1.length; i++) {
			System.out.print(arr1[i]);
			System.out.print(" ");
			arr1[i].hobby();
		}
		
	}

}
