package Chap06_07.Ex06;

public class Bcd {	// 외부 클래스 : public 제어자를 사용 못 한다. default 기본으로 적용 
					// class : public , default 
					// 접근 제어자가 붙을 수 있는 키워드 : class 앞, 필드 , 메소드 , 생성자	
					// 반드시 접근제어자가 할당이 되어 있다. 생략 되어있으면 default
					// 접근제어자 :
						// 1. public : 다른 패키지에서 접근이 가능 
						// 2. protected : 다른 패키지에서 접근 가능 ( 상속구현이 되어있어야 )
						// 3. default : 같은 패키지에서 접근 가능 , 같은 패키지에 존재하는 클래스는 import 없이 사용  
						// 4. private : 같은 클래스 내부에서만 사용 가능 
		public int a = 10;
		protected int b = 20;
		int c = 30;
		private int d = 40;
		
		public void print1 () {
			System.out.println(" 다른 패키지에서 접근 가능 : public ");
		}
		protected void print2 () {
			System.out.println(" 다른 패키지에서 접근 가능 ( 상속관계가 구성 되어있음 ) : protected ");
			}
		void print3 () {
			System.out.println(" 같은 패키지에서만 접근 가능 : default ");
		}
		private void print4() {
			System.out.println(" 같은 클래스에서 접근 가능 ");
		}
		
		// Static 필드의 값을 변경하면 모든 객체에서 모두 변경 
		




}



