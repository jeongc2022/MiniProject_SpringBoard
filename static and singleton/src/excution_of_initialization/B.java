package excution_of_initialization;

public class B {

	private A a = new A();	// 3,8,13
	
	{
		System.out.println("B 인스턴스 블록 실행");// 5,10,15
	}
	
	static {
		System.out.println("B static 블록 실행");	//1
	}
	
	private static B b = new B(); //2
	
	private B() {
		System.out.println("B() 생성자 실행"); //6, 11
	}
	
	public B(int a) {
		System.out.println("B(int) 생성자 실행");
	}
	public static void main(String[] args) {
		new B();	// 7
		new B(1); 	// 12
		
	}
}
