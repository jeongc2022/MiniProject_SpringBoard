package net.java_bank_extends_abstract;

public class InsufficientBalanceException extends RuntimeException {
	
//	public InsufficientBalanceException() {
//		super();
//	}
//	
//	public InsufficientBalanceException(String message, Throwable cause) {
//		super(message, cause);
//	}
	
	public InsufficientBalanceException(String message) {	// 예제에서 문자열 인자를 가지는 생성자만 사용하기 때문에 간단히 만들 수도 있다. 
		super(message);
	}
	
//	public InsufficientBalanceException(Throwable cause) {
//		super(cause);
//	}

}
