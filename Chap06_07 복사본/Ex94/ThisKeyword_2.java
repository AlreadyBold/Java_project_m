package Chap06_07.Ex94;
// 명시적 this 키워드 추가 : 반드시 this key를 사용해야 되는경우 
class Aa{		//this key 를 사용하지 않는 경우 : 지역변수로 인식 
	int m, n;
	void init (int m, int n) {
		m = m ; n = n;		// this 키를 사용하지 않는 경우 m/n<== 지역변수 m/n
	}	
}
class Bb{
	int m , n;
	void init(int m, int n) {
		this.m=m;			// this 키를 명시적으로 반드시 사용해서 m이 필드의 m이라고 알려줘야한다.
		this.n=n;
	}
}
public class ThisKeyword_2 {

	public static void main(String[] args) {
		// 1. 필드 명과 지역변수 명이 같은 경우 ( this 키워드를 사용하지 않는 경우 )
		Aa aa = new Aa();
		aa.init(2,3);
		System.out.println(aa.m);	//0
		System.out.println(aa.n);	//0
		// 2. 필드 명과 지역변수 명이 가은 경우 ( this 키워드를 사용하는 경우 : 필드 변수에 저장 )
		Bb bb = new Bb();
		bb.init(2, 1);
		System.out.println(bb.m);	//2
		System.out.println(bb.n);	//1

	}

}
