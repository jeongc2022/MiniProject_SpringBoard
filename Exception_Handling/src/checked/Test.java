package checked;

public class Test {
	private static void method1() throws ClassNotFoundException {
		method2();
	}
	
	private static void method2() throws ClassNotFoundException {
		method3();

	}

	private static void method3() throws ClassNotFoundException {
		Class.forName("java.lang.Boolean2");
		
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		method1();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally  {
			// TODO: handle exception
			System.out.println("finally 블록 실행");
		}
		System.out.println("정상종료");
	}

}
