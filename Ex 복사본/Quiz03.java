package Ex;
class Student{
	String name;			// �л��̸� 
	int studentID;			// �й� 
	int kor ;				// ��������	 
	int eng ; 				// �������� 
	int math ; 				// �������� 
	
	
	int sum 			;	// �հ�
	double avg;			// ��� 
	
	void hobby () {
		System.out.println(" �� �л��� ��̴� �Դϴ�. ");
	}

	@Override
	public String toString() {
	
		return " �̸��� : " + name +", �й� : "+studentID+" , �������� : "+kor+" �������� : "+eng+" �������� : "+math+" �հ� : "+sum+" ��� : "+avg+" �Դϴ�. ";
	}
	
}
class S_ö�� extends Student {
	@Override
	void hobby() {
		System.out.println( "ö���� ��̴� ���� �Դϴ�. ");
	}
}
class S_���� extends Student {
	@Override
	void hobby() {
		System.out.println( "������ ��̴� ���� �Դϴ�. ");
	}
}
class S_���� extends Student {
	@Override
	void hobby() {
		System.out.println( "�������� ��̴� ���� �Դϴ�. ");
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new S_ö��();
		a.name = " ö�� ";
		a.studentID = 1111;
		a.kor = 10;
		a.eng = 10;
		a.math = 10 ;
		a.sum=a.kor+a.eng+a.math;
		a.avg = a.sum/3;
		a.hobby();
		
		
		
		Student b = new S_����();
		b.name = " ���� ";
		b.studentID = 2222;
		b.kor = 20 ;
		b.eng = 20;
		b.math = 20;
		b.sum = b.kor+b.eng+b.math;
		b.avg = b.sum/3;
		b.hobby();
		
		Student c = new S_����();
		c.name = " ���� ";
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
