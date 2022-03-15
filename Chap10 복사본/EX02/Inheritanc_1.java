package Chap10.EX02;

class Aa{
	int m ;
	void abc() {
		System.out.println(" 부모 메소드 ");
	}
}
class Bb extends Aa{
	int n ;
	void bcd() {
		System.out.println(" 자식 메소드 ");
	}
}

public class Inheritanc_1 {

	public static void main(String[] args) {
		// 타입 캐스팅을 하지 않는 경우 
		Bb b = new Bb(); 	// b는 Aa, Bb
		b.m= 10;	//	부모필드 
		b.n=20;		//	자식필드 
		b.abc();	// 	부모 메소드 
		b.bcd();	// 	자식 메소드 
		
		// 업캐스팅 : 자식 => 부모 
		Aa a = new Bb();
		
		a.m = 100;
		// a.n = 200; 
		
		Bb bb6 = (Bb) a ; 	//Aa[a] --> Bb[bb6] 타입으로 다운캐스팅 
		bb6.m = 100;
		bb6.n= 200;
		
		
		
		
	}

}
