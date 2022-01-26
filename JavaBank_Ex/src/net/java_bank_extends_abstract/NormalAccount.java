package net.java_bank_extends_abstract;

import java.util.Calendar;
import java.util.Date;

public class NormalAccount extends Account {
	static final String KIND = "일반";
	
	public NormalAccount() {}
	
	public NormalAccount(String accountNo, String name) {
		super(accountNo, name);
	}
	
	public NormalAccount(String accountNo, String name, double balance) {
		super(accountNo, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount > balance) {
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
		balance = balance - amount;
		Transaction transaction = new Transaction();
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		transaction.setTransactionDate(Account.DATE_FORMAT.format(date));
		transaction.setTransactionTime(Account.TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setBalance(balance);
		transaction.setKind(Account.WITHDRAW);
		transactions.add(transaction);
	}

	@Override
	public String getKind() {
		return KIND;
	}

}
