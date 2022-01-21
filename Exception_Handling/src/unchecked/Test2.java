package unchecked;

public class Test2 {
	
	public static void method1() {
		method2();
	}
	
	public static void method2() {		
		try {
		method3();									// method3() 에서 발생한 예외 객체는 method2()에 전달, 
		}catch (ArithmeticException e) {			
			System.out.println(e.getMessage());		// method2()의 catch 블록이 실행되어 method2(0가 종료
		}
	}
	
	public static void method3() {					// 에러
		int a = 12 / 0;
		System.out.println(a);
	}
	public static void main(String[] args) {
		method1();									// 종료
		System.out.println("정상 종료");				// main의 마지막 줄 실행
		
	}

}
