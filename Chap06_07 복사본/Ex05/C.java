package Chap06_07.Ex05;

public class C {	// �ٸ� ��Ű������ import ����
	
	// �ʵ忡 �ο� �Ǵ� ���������� 
	private String company = " HYUNDAI "; 	// ȸ���
	String model = " " ; 	// �� , default
	protected String color ; // ���� 
	public int maxspeed ;	// �ִ� �ӷ� 
	
	
	
	
	
	
	
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


