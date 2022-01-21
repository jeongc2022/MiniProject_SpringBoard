package unchecked;

public class Test3 {

	public static void method1() {					// 실행1
		try {
			method2();								// method2()에서 호출한 method3() 실행
		}catch (ArithmeticException e) {			// 에러 발생 -> method1()에서 catch
			System.out.println(e.getMessage());
		}
	}
	public static void method2() {					// 실행2
		method3();					
	}
	
	public static void method3() {					// 실행3
		int a = 12 / 0;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();									// catch 후 method1() 종료
		System.out.println("정상 종료");				// 마지막 줄 실행
	}

}
