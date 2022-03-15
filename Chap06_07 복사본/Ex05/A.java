package Chap06_07.Ex05;
// 필드의 기본 접근 제어자는 public , protected, default , private
// 클래스 이름, 필드명, 메소드명, 생성자명 <== 접근제어자가 반드시 할당이 되어있습니다.
public class A {
	int m = 3;		// 필드의 기본 접근 제어자는 default : 생략됨 , 같은패키지 내에서만 접
	int n = 4;		// default : 같은 패키지 내의 다른 클래스 에서 접근가능 , 다른 패키지의 클래스에서는 접근 불가 
					// private : 외부 클래스에서 접근 불가 
	public int k = 10; 	// public : 다른 패키지에서 접근이 가능 				
	void print () {		// default : 같은 패키지내의 클래스에서만 사용 가능 
		System.out.println(" 임포트 성공 " + m + " , "+ n);
	}
	public void print2 () {
		System.out.println(" 외부 패키지의 다른 클래스에서 접근 가능 " +k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
