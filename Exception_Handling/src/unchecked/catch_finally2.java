package unchecked;

public class catch_finally2 {

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
		try {
			method1();
		}catch (Exception e) {					// 1. ���� �߻����� catch ��� ����
			System.out.println(e.getMessage());	
		}finally {								// 2. finally ��� ������ ���常 ����
			System.out.println("finally ��� ����");
		}
		
		System.out.println("���� ����");
	}

}
