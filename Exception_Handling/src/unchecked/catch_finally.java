package unchecked;

public class catch_finally {

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
		}finally {								// catch ����� �����Ƿ� ���� ��ü�� ���� �� ����, ������ ���常 ����
			System.out.println("finally ��� ����");
		}
		
		System.out.println("���� ����");
	}

}
