package unchecked;

public class Test3 {

	public static void method1() {					// ����1
		try {
			method2();								// method2()���� ȣ���� method3() ����
		}catch (ArithmeticException e) {			// ���� �߻� -> method1()���� catch
			System.out.println(e.getMessage());
		}
	}
	public static void method2() {					// ����2
		method3();					
	}
	
	public static void method3() {					// ����3
		int a = 12 / 0;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();									// catch �� method1() ����
		System.out.println("���� ����");				// ������ �� ����
	}

}
