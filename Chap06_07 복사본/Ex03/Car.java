package Chap06_07.Ex03;

public class Car {
	String company ; 
	String model ;
	String color;
	int maxSpeed;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {	// RAM의 값을 부여할때 setter
		this.company = company;					// this : 자신의 객
	}											// 메소드에 인풋되는 변수명 , 인풋된 변수를 받는 변수명, 메모리에 로드할 변수명 (this.
	public String getModel() {
		return model;
	}
	public void setModel(String model) {		// 인풋 , 인풋을 받는 변수, 메모리에 로드할 변수명이 같을경우 = this // 아닐 경우 생략가
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	

}
