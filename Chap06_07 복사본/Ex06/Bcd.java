package Chap06_07.Ex06;

public class Bcd {	// �ܺ� Ŭ���� : public �����ڸ� ��� �� �Ѵ�. default �⺻���� ���� 
					// class : public , default 
					// ���� �����ڰ� ���� �� �ִ� Ű���� : class ��, �ʵ� , �޼ҵ� , ������	
					// �ݵ�� ���������ڰ� �Ҵ��� �Ǿ� �ִ�. ���� �Ǿ������� default
					// ���������� :
						// 1. public : �ٸ� ��Ű������ ������ ���� 
						// 2. protected : �ٸ� ��Ű������ ���� ���� ( ��ӱ����� �Ǿ��־�� )
						// 3. default : ���� ��Ű������ ���� ���� , ���� ��Ű���� �����ϴ� Ŭ������ import ���� ���  
						// 4. private : ���� Ŭ���� ���ο����� ��� ���� 
		public int a = 10;
		protected int b = 20;
		int c = 30;
		private int d = 40;
		
		public void print1 () {
			System.out.println(" �ٸ� ��Ű������ ���� ���� : public ");
		}
		protected void print2 () {
			System.out.println(" �ٸ� ��Ű������ ���� ���� ( ��Ӱ��谡 ���� �Ǿ����� ) : protected ");
			}
		void print3 () {
			System.out.println(" ���� ��Ű�������� ���� ���� : default ");
		}
		private void print4() {
			System.out.println(" ���� Ŭ�������� ���� ���� ");
		}
		
		// Static �ʵ��� ���� �����ϸ� ��� ��ü���� ��� ���� 
		




}



