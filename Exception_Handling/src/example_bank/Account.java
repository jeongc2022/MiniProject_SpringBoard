package example_bank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Account {
	private String accountNo;
	private String name;
	private double balance;
	private Transaction[] transactions = new Transaction[100];
	private int totalTransaction;
	
	static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
	static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
	static final String DEPOSIT = "입금";
	static final String WITHDRAW = "출금";
	
	public Account() {}
	
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}
	
	public Account(String accountNo, String name, double balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		Transaction transaction = new Transaction();
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		transaction.setTransactionDate(DATE_FORMAT.format(date));
		transaction.setTransactionTime(TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setBalance(balance);
		transaction.setKind(DEPOSIT);
		transactions[totalTransaction++] = transaction;
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			return;
		}
		balance = balance - amount;
		Transaction transaction = new Transaction();
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		transaction.setTransactionDate(DATE_FORMAT.format(date));
		transaction.setTransactionTime(TIME_FORMAT.format(date));
		transaction.setAmount(amount);
		transaction.setBalance(balance);
		transaction.setKind(WITHDRAW);
		transactions[totalTransaction++] = transaction;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Transaction[] getTransactions() {
		return transactions;
	}

	public void setTransactions(Transaction[] transactions) {
		this.transactions = transactions;
	}

	public int getTotalTransaction() {
		return totalTransaction;
	}

	public void setTotalTransaction(int totalTransaction) {
		this.totalTransaction = totalTransaction;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(accountNo);
		sb.append("|");
		sb.append(name);
		sb.append("|");
		sb.append(balance);
		
		return sb.toString();
	}
	
	
}
