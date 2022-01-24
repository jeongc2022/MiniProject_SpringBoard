package excution_of_initialization;

public class B {

	private A a = new A();	// 3,8,13
	
	{
		System.out.println("B �ν��Ͻ� ��� ����");// 5,10,15
	}
	
	static {
		System.out.println("B static ��� ����");	//1
	}
	
	private static B b = new B(); //2
	
	private B() {
		System.out.println("B() ������ ����"); //6, 11
	}
	
	public B(int a) {
		System.out.println("B(int) ������ ����");
	}
	public static void main(String[] args) {
		new B();	// 7
		new B(1); 	// 12
		
	}
}
