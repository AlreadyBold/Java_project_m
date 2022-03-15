package Chap10.Ex04;
// 메소드 오버라이딩과 접근 지정자와의 관계 
// 자식의 클래스에서 부모의 메소드를 재정의 할경우 접근 지정자는 부모와 같거나 넓어야 된다. 
public class MethodOverriding_3 {

class Aaa {
	protected void abc() {
		
	}
}
class B1 extends Aaa{
	@Override
	public void abc() {
		
	}
}
class B2 extends Aaa{
	@Override
	protected void abc() {
		
	}
}
class B3 extends Aaa{
	//@Override
	// void abc() {	// 오류발생 : 오버라이딩할 메소드의 접근 지정자 문제 
}
class B4 extends Aaa{
//	@Override
	//private void abc() {오류발생 : 오버라이딩할 메소드의 접근 지정자 문제
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
