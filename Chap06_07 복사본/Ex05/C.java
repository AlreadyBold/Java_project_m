package Chap06_07.Ex05;

public class C {	// 다른 패키지에서 import 가능
	
	// 필드에 부여 되는 접근제어자 
	private String company = " HYUNDAI "; 	// 회사명
	String model = " " ; 	// 모델 , default
	protected String color ; // 색상 
	public int maxspeed ;	// 최대 속력 
	
	
	
	
	
	
	
	public void setModel(String model) {
		this.model = model;
	}







	public void setColor(String color) {
		this.color = color;
	}







	public void print() {
		System.out.println( "company : "+company + " model : "+model + " color : "+ color + " maxspeed : " + maxspeed);
	}
	

	
		

	}


