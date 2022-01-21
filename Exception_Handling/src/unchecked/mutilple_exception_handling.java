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
		// catch 블록의 예외 클래스 타입이 나중에 나오는 catch 블록의 예외 클래스 타입보다 계층 구조에서 상위에 있다면, 나중에 나오는 catch 블록은 실행될 수 없다. (컴파일러 감지 후 실행)
		try {
			method1();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally 블록 실행");
		}
		
		System.out.println("정상 종료");
	}

}
