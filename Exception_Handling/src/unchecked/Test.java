package unchecked;

public class Test {

	public static void method1() {
		method2();
	}
	
	public static void method2() {
		method3();
	}
	
	public static void method3() {	// unchecked ���ܿ� 
		try {						
		int a = 12 / 0;
		System.out.println(a);
		} catch (ArithmeticException e) {	// try ~ catch ���� ����Ͽ� ���� �ڵ鸵(���� ó�� ������ �ڵ鸵 x)
			System.out.println(e.getMessage());		// by zero ���
		}
	}
	
	public static void main(String[] args) {
		method1();									// method1() ����
		System.out.println("���� ����");
	}

}
