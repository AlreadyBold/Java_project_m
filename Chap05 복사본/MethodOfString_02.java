package Chap05;

public class MethodOfString_02 {

	public static void main(String[] args) {
				// 5. ���ڿ� ����
				// toLowerCase() : �ҹ��ڷ� ��ȯ /  toUpperCase() : �빮�ڷ� ��ȯ 
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println();
		
				// replace(old,new) : old�� new�� �ٲ� 
		System.out.println(str1.replace("Study", " ���� "));
		
				// substring( ����index(���ȣ) , ���ڸ� �ڸ� ������index�ձ��� ) : ���ڿ��� �߶� ���
		
		System.out.println(str1.substring(0, 4));
		System.out.println(str1.substring(6, 8));
		
				//	split() : Ư�����ڸ� �������� �߶� String[] �迭�� ���� 
		String str11= "abc/def-ghi";
		
		
		
				
				
				
				
				
				// 6. ���ڿ��� ���� �� (.equals() : ��ҹ��� �����ϸ鼭 ���� �� // .equalsIgnoreCase () : ��ҹ��� ���� ���� ���� ��
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
				// �޸��� �ּҰ� �� ( == )
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str4==str2);
		
				// �޸��� ���� �� ( equals() / equalsIgnoreCase() )
		System.out.println(str2.equals(str4));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str4));
		
		
		
	}

}
