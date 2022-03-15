package Chap06_07.Ex05;

public class EX_C {

	public static void main(String[] args) {
		// 같은 클래스에 존재함	 	
	C c = new C() ;
	c.model = " 소나타 ";
	c.maxspeed = 250;
	c.color = "black";
	
	
	c.print();
	
	//	다른클래스에 존재 / public만 접근 / model, color 메모리로 접근 불가 
	// model과 color는 setter를 public 통해서 할당 후 출

	}

}
