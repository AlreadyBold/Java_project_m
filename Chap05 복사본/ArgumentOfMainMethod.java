package Chap05;

public class ArgumentOfMainMethod {
	public static void main(String[] ar) {   // ���� �޼ҵ�[�Լ�]
		/* �޼ҵ��� �⺻���� 
		 *  void main(String[] args){ void : ���ϰ��� ������ ���� // main : �޼ҵ��  // ( ��ǲ �Ű����� )
		 * 		�޼ҵ带 ȣ��� ������ �ڵ�; }
		 */
		String a = ar[0];
		String b = ar[1];
		String c = ar[2];
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		// main �޼ҵ忡 ���ڰ����� ������ �Ǽ��� �Ѱ� �ٶ� String���� ��ȯ 
		System.out.println(b+1);
		System.out.println(c+1);
	
		//String�� ������ ���� ������ ��ȯ�ؼ� ����
		
		int d = Integer.parseInt(b);  // b(String)  ==> Integer Ÿ������ ��ȯ 
		double e = Double.parseDouble(c);  //c(String) ==> Double ������ ��ȯ 
		
		System.out.println(d+1);
		System.out.println(e+1);
	
	}
}
