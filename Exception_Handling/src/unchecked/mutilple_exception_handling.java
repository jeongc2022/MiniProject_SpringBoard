package unchecked;

public class mutilple_exception_handling {
	
	private static void method1() {
		method2();
	}
	
	private static void method2() {
		method3();
		
	}

	private static void method3() {
		int a = 12 / 0;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// catch ����� ���� Ŭ���� Ÿ���� ���߿� ������ catch ����� ���� Ŭ���� Ÿ�Ժ��� ���� �������� ������ �ִٸ�, ���߿� ������ catch ����� ����� �� ����. (�����Ϸ� ���� �� ����)
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally ��� ����");
		}
		
		System.out.println("���� ����");
	}

}
