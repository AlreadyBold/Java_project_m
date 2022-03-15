package Chap10.Ex04;


class Animal2 {
	void run() {
		
	}
}

class Tiger extends Animal2 {
	@Override
	void run() {
		System.out.println(" 호랑이는 네발로 달립니다. ");
	}
	void tigerEat() {
		System.out.println(" 호랑이는 동물을 먹습니다. ");
	}
	
}
class Eagle extends Animal2 {
	@Override
	void run () {
		System.out.println(" 독수리는 하늘을 납니다. ");
	}
	void eagleEat() {
		System.out.println(" 독수리는 다른 새를 잡아 먹습니다. ");
	}
}
class Snake extends Animal2 {
	@Override
	void run () {
		System.out.println(" 뱀은 기어다닙니다. ");
	}
}



public class MethodOverriding_2 {

	public static void main(String[] args) {
		// 모든 객체는 animal 타입으로 업캐스팅해서 생성 .
		// Animal2 배열에 각 객체를 저장 
		// for문으로 배열의 객체를 출력 .
		// enhanced for 문을 사용해서 객체의 run 메소드 출력 
		
		
		Animal2 aa = new Tiger ();
		Animal2 bb = new Eagle ();
		Animal2 cc = new Snake ();
		
		Animal2 [] animal2 = {aa,bb,cc};
		System.out.println("========== for ===========");
		for (int i = 0 ; i<animal2.length; i++) {
			animal2[i].run();
		}
		System.out.println("===== enhanced for =======");
		for (Animal2 i : animal2) {
			i.run();
		}
		Tiger aa2 = (Tiger)aa ;
		Eagle bb2 = (Eagle)bb ;
		
		
			Tiger aaa = (Tiger)aa;
			Eagle bbb = (Eagle)bb;
	}
	
}
