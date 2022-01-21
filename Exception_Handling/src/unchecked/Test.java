package unchecked;

public class Test {

	public static void method1() {
		method2();
	}
	
	public static void method2() {
		method3();
	}
	
	public static void method3() {	// unchecked 예외에 
		try {						
		int a = 12 / 0;
		System.out.println(a);
		} catch (ArithmeticException e) {	// try ~ catch 문을 상요하여 예외 핸들링(예외 처리 없으면 핸들링 x)
			System.out.println(e.getMessage());		// by zero 출력
		}
	}
	
	public static void main(String[] args) {
		method1();									// method1() 종료
		System.out.println("정상 종료");
	}

}
