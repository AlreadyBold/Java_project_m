package Chap05;

public class CreateStringObject {

	public static void main(String[] args) {
		// 1. String ��ü ���� 1 : new Ű�� ����ؼ� ��ü ���� ==> Heap ������ ������ ������ ����
			// RAM�� ���� ���� �������� �ʴ´�.
		String str1 = new String (" �� �� ") ;  // new Ű�� ��ü�� �����϶�. (Heap �޸𸮿� ����)
		System.out.println(str1);  	// String�� ��ü�� ������� ��ü�� ���� ��� // String�� ������ Ư���� ��� 
									// ��ü��ü�� ����ϸ�, Heap�޸𸮿� �������� ��� // ��ü�� ���� ����Ҷ��� ��ü��.toString() ������ 
		String str11= new String(" �� �� "); // str1 �� str11 �� ������ �޸� ������ ����ȴ�. (Heap)
				
		if (str1 == str11) {System.out.println(true);  // == : �����ڷ����� ��� �����ϴ� �ּҸ� ���Ѵ�. 
		}else {
			System.out.println(false);
		}
		
		
		
		// ���ͷ��� ���� �ٷ� �Ҵ� : ���� ���� ��� RAM�� ���� �����ϰ� �ȴ�. 
		String str2 = " �� �� �� �� �� ! ";  		 
		String str22 = " �� �� �� �� �� ! "; 	// ������ �޸� ������ ���� �ϰ� �ȴ�. 
		
		if (str2 == str22) {
			System.out.println(true);  		// true : ���� �ּҸ� ����Ų��. 
		} else {
			System.out.println(false);
		}
			
		
		

	}

}
