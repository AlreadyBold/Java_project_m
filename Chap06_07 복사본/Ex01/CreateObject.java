package Chap06_07.Ex01;
 	class AA {							// �ʵ�( ��� ) : �ν��Ͻ�ȭ ���Ѿ� ����� ���� (Heap ������ ���� ����) 
	String name;
	int age;
	String email;
	
	AA() {} // �⺻ ������, ������ ���� / �ٸ� �����ڰ� ������ ��� , �⺻�����ڴ� �����ϸ� �ȵȴ� 
	public String getName() {		//�޼ҵ� (�ɹ�) : �ν��Ͻ�ȭ ���Ѿ� ��밡�� 
		return name;				// Heap ������ �ּҸ� ����, Ŭ������������ �޼ҵ念���� ���� 
	}								// return : �޼ҵ带 ȣ���ϴ� ������ ������ ���� �����ش� 
	public void setName(String name) { 	//void : ���ϰ��� ���ٸ� �˷��ִ� �ĺ���
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}





public class CreateObject {

	public static void main(String[] args) {
		AA aa = new AA();		//AAŬ����( ���赵 )�� aa( ��ü )�� ���� 
		// AA : Ŭ�����̸� , aa : ��ü�� ( �ν��Ͻ��� ) , new : Heap ������ �ʵ�� �޼ҵ�
		// AA() : ������ : ��ü�� �ʵ尪�� �ʱ�ȭ, �����ڵ� �ϳ��� �޼� ,
						// 1. ������ �̸��� Ŭ���� �̸��� ���� �޼ҵ� 
						// 2. ����Ÿ���� ���� 
						// 3. ������ �߿� �Ű������� ���� �����ڸ� �⺻ �����ڶ�� �θ� 
						// 4. �⺻ �����ڴ� ������ �����ϴ� 
						// 5. ��ü�� ���� �� �� �ݵ�� �����ڸ� ȣ�� 
		// ��ü�� �޼ҵ� ȣ�� 
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		System.out.println(aa.getName());
		// ��ü�� �ʵ� ȣ�� 
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//===============================
		
		// �޼ҵ� ȣ�� 
		aa.setName(" ȫ�浿 ");		// ��ü�� ������ ���� �Ҵ� 
		aa.setAge(29);
		aa.setEmail("aaa@aaa.com");
		
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		
		AA bb = new AA();
		bb.setName(" �� �� �� ");
		bb.setAge(50);
		bb.setEmail("bb@Bbb.bb");
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		
		AA cc= new AA();
		cc.setName(" �Ż��Ӵ� " );
		cc.setAge(40);
		cc.setEmail("ccc@ccc.com");
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
