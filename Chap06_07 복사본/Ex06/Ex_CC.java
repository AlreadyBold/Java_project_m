package Chap06_07.Ex06;

import Chap06_07.Ex05.C;	// ctrl + shift + o
							// class의 접근 제한자가 public 

public class Ex_CC {

	public static void main(String[] args) {
		// 다른 클래스에 존재함 / public만 접근 / model, color 메모리로 접근 불가 
		C c= new C();				// 다른 패키지 이므로 import 
		// setter 를 통해서 메모리 값을 부여 
		c.setColor("black");
		c.setModel("VelosterN");
		// company, model, color는 다른패키지에서 접근 불가, setter를 통해서 메모리 값을 할당하도록 구성 
		
		c.maxspeed=280;	// 다른 패키지의 클래스에서는 public , protected ( 상속 설정 ) 
		c.print();
	}

}
