package net.java_bank_extends_abstract;

public class DuplicateAccountException extends RuntimeException {

//	public DuplicateAccountException() {
//		super();
//	}
//
//	public DuplicateAccountException(String message, Throwable cause, boolean enableSuppression,
//			boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//	}
//
//	public DuplicateAccountException(String message, Throwable cause) {
//		super(message, cause);
//	}

	public DuplicateAccountException(String message) {	// 예제에서 문자열 인자를 가지는 생성자만 사용하기 때문에 간단히 만들 수도 있다. 
		super(message);
	}

//	public DuplicateAccountException(Throwable cause) {
//		super(cause);
//	}
	
	

}
