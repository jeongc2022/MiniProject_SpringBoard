package unchecked;

public class Test2 {
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {		
		try {
		method3();									// method3() ���� �߻��� ���� ��ü�� method2()�� ����, 
		}catch (ArithmeticException e) {			
			System.out.println(e.getMessage());		// method2()�� catch ����� ����Ǿ� method2(0�� ����
		}
	}
	
	public static void method3() {					// ����
		int a = 12 / 0;
		System.out.println(a);
	}
	public static void main(String[] args) {
		method1();									// ����
		System.out.println("���� ����");				// main�� ������ �� ����
		
	}

}
