package Chap06_07.Ex03;

import java.util.Arrays;

public class ArrayArgumentMethod {
	// static Ű�� �����鼭 ���� Ŭ������ �����ϴ� �޼ҵ� == > ��ü�������� �޼ҵ��̸����� �ٷ�ȣ���� �����ϴ�. 
	// �ٸ���Ű������ ���� �����ϵ��� ���� : ���� ������ (public , protected , default , private)
	// ���������ڰ� ���� �Ǿ� ������ : default ( ���� ��Ű������ ���� ���� )
	public static void printArray (int[]a) { 	
		//System.out.println(Arrays.toString(a));
		// for��������ؼ� ���
		// ����for���� ����ؼ� ���
	for(int i=0 ; i<a.length ; i++) {
		System.out.print(a[i]+" "); 
		}
	
	for(int k : a) {
		System.out.print(k + " ");}
		}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// �迭�� �Ű������� ������ �޼ҵ� ȣ��
		int [] a = new int[] {1,2,3};
		printArray(a); 
		printArray(new int [] {4,5,6,7,8,9});
		//printArray(new int[] {4,5,6,7,8});
		
		
		
	}

}
