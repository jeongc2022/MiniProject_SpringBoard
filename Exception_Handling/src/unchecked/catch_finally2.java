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
		}catch (Exception e) {					// 1. 예욉 발생으로 catch 블록 실행
			System.out.println(e.getMessage());	
		}finally {								// 2. finally 블록 마지막 문장만 실행
			System.out.println("finally 블록 실행");
		}
		
		System.out.println("정상 종료");
	}

}
