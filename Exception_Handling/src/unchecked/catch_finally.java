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
		}finally {								// catch 블록이 없으므로 예외 객체는 잡을 수 없음, 마지막 문장만 실행
			System.out.println("finally 블록 실행");
		}
		
		System.out.println("정상 종료");
	}

}
