package unchecked;

public class Test4 {

	public static void method1() {	// 1		
		method2();						
	}
	
	private static void method2() {	// 2
		method3();
		
	}

	private static void method3() {	// 3
		int a = 12 / 0;
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		try {									
		method1();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("정상 종료");
	}

}
