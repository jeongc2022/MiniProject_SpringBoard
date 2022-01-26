package net.java_bank_extends_abstract_interface;

import java.util.ArrayList;
import java.util.List;

public interface Bank {	// 인터페이스는 컴포넌트 기능을 정의한다. Bank 클래스를 은행 컴포넌트 기능을 정의하는 인터페이스로 수정

	//계좌를 생성한다.
	public void addAccount(String accountNo, String name);
	
	// 계좌를 생성한다.
	public void addAccount(String accountNo, String name, double balance);
	
	// 계좌를 생성한다.
	public void addAccount(String accountNo, String name, String kind);
	
	// 계좌를 생성한다.
	public void addAccount(String accountNo, String name, double balance, String kind);
	
	// 계좌번호로 계좌를 찾는다.
	public Account getAccount(String accountNo);
	
	// 소유자 명으로 계좌를 찾는다.
	public List<Account> findAccountByName(String name);
	
	// 모든 계좌를 반환한다.
	public List<Account> getAccounts();

}
