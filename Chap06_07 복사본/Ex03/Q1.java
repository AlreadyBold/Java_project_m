package Chap06_07.Ex03;
class Cars {
	String company;		// 필드( 인스턴스 필드 )의 company를 알려주는 this , Heap 메모리에 저
	String model;		// 인스턴스 : 객체화를 했을 때 사용 가능한 필드 
	String color;		// [ 필드명 : 필드의 값 ]은 Heap 영역에 저장 
	double maxspeed;
	Cars(String a , String b, String color, double d){
		company = a ;
		model = b ; 	
		this.color = color ; 	// 3개의 변수 모두가 동일할 경우 객체의 필드의 변수를 알려주는 역할 / this 키는 객체의 필드의 변수를 뜻한다.
		maxspeed =d;			// this 키워드가 생략된 상태 
	}
	void work () { // 메소드 (인스턴스메소드) : Heap 영역의 메소드명과 포인터를 저장 / 메소드의 전체구문은 클래스 영역의 메소드 영역에 저장
		System.out.println("제조사는 : "+company+" 모델명은 : "+model+" 차량색상은 : "+color+" 최고 속력은 : "+maxspeed);
	
	}
}
public class Q1 {

	public static void main(String[] args) {
		//생성자를 통해서 기본값을 할당 후 메모리에 내용을 work() 메소드를 사용해서 출력해보기 
	Cars aa = new Cars(" 현대 "," 아반떼 "," black ",232.2);
	aa.work();
	}

}
