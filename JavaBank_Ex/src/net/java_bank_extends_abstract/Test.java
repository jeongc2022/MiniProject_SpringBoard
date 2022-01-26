package net.java_bank_extends_abstract;

import java.util.List;

public class Test {
	static final String ACCOUNTS_HEADING = "계좌번호|소유자명|잔액|계좌종류";
	static final String TRANSACTIONS_HEADING = "거래일|거래시간|입/출금|거래금액|전액";

	public static void main(String[] args) {
		
		// 테스트 계좌를 추가한다.
		Bank bank = new Bank();
		bank.addAccount("101", "홍길동");
		bank.addAccount("202", "임꺽정");
		bank.addAccount("303", "장길산");
		bank.addAccount("404", "홍길동");
		
		//1. 총계좌목록을 출력한다.
		System.out.println("1. 총계좌목록을 출력한다.");
		List<Account> accounts = bank.getAccounts();
		//int totalAccount = bank.getTotalAccount();
		System.out.println(ACCOUNTS_HEADING);
		for (int i = 0; i < accounts.size(); i++) {
			System.out.println(accounts.get(1));
		}
		
		System.out.println();
		
		//2. 101 계좌에 10,000원을 입금한다.
		System.out.println("2. 101계좌에 10,000원을 입금한다.");
		Account hong = bank.getAccount("101");
		hong.deposit(10000); 
		System.out.println(ACCOUNTS_HEADING);
		System.out.println(hong);
		
		System.out.println();
		
		//3. 101계좌에 5,000원을 출금한다.
		System.out.println("3. 101 계좌에서 5,000원을 출금한다.");
		hong.withdraw(5000);
		System.out.println(ACCOUNTS_HEADING);
		System.out.println(hong);
		
		System.out.println();
		
		//4. 101계좌 거래 내용을 출력한다.
		System.out.println("4. 101계좌 거래용을 출력한다.");
		List<Transaction> transactions = hong.getTransactions();
		List<Transaction> totalTransaction = hong.getTransactions();
		System.out.println(TRANSACTIONS_HEADING);
		for (int i = 0; i < totalTransaction.size(); i++) {
			System.out.println(transactions.get(i));
		}
			
		System.out.println();
		
		// 5. 고객명으로 계좌를 찾는다.
		System.out.println("5. 고객명으로 계좌를 찾는다.");
		List<Account> matched = bank.findAccountByName("홍길동");
		System.out.println(ACCOUNTS_HEADING);
		for (Account account : matched) {
			System.out.println(account);
		}
		
		System.out.println();
		
		// 6. 마이너스 계좌 404에 5000원을 출금한다.
		System.out.println("6. 마이너스 계좌 404에서 5000원을 출금한다.");
		Account minus = bank.getAccount("404");
		minus.withdraw(5000);
		System.out.println(ACCOUNTS_HEADING);
		System.out.println(minus);
	}

}
