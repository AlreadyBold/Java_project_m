package Chap06_07.Ex03;

import java.util.Scanner;

public class Example_Car {

	public static void main(String[] args) {
		// private 변수명 : 캡슐화 , 직접 변수의 값을 할당하지 못하도록 한다.
		// setter를 통해서 값을 부여 : 변수 입력되는 값을 제어 할 수 있다. 
		
		
		
		// car class 를 객체화 해서 5개의 객체를 생성해서 값을 할당해서 출력해 보세요 
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		Car d = new Car();
		Car e = new Car();
		a.setCompany("HYUNDAI");
		a.setColor("Black");
		a.setMaxSpeed(230);
		a.setModel("SONATA");
		
		b.setColor("Racing-grey");
		b.setCompany("Genesis");
		b.setMaxSpeed(275);
		b.setModel("G70");
		
		c.setColor("blueice");
		c.setCompany("Chevrolet");
		c.setMaxSpeed(232);
		c.setModel("Malibu");
		
		d.setColor("grey");
		d.setCompany("Porsche");
		d.setMaxSpeed(330);
		d.setModel("911");
		
		e.setColor("Performance blue");
		e.setCompany("HYUNDAI N");
		e.setMaxSpeed(280);
		e.setModel("VelosterN");
		System.out.println("======1 번 자동차 =======");
		System.out.println(a.getCompany());
		System.out.println(a.getModel());
		System.out.println(a.getColor());
		System.out.println(a.getMaxSpeed());
		System.out.println("======2 번 자동차 =======");
		System.out.println(b.getCompany());
		System.out.println(b.getModel());
		System.out.println(b.getColor());
		System.out.println(b.getMaxSpeed());
		System.out.println("======3 번 자동차 =======");
		System.out.println(c.getCompany());
		System.out.println(c.getModel());
		System.out.println(c.getColor());
		System.out.println(c.getMaxSpeed());
		System.out.println("======4 번 자동차 =======");
		System.out.println(d.getCompany());
		System.out.println(d.getModel());
		System.out.println(d.getColor());
		System.out.println(d.getMaxSpeed());
		System.out.println("======5 번 자동차 =======");
		System.out.println(e.getCompany());
		System.out.println(e.getModel());
		System.out.println(e.getColor());
		System.out.println(e.getMaxSpeed());
		
		System.out.println(" 정수값을 입력하세요 ");

		
		
	}
	
	
	
	
	
	
	
	

}
