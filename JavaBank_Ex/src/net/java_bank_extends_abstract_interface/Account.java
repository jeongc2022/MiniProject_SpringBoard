package net.java_bank_extends_abstract_interface;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Account {
	private String accountNo;
	private String name;
	protected double balance;
	protected List<Transaction> transactions = new ArrayList<Transaction>();
	
	static final String KIND = "일반"; // 일반계좌
	static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
	static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
	static final String DEPOSIT = "입금";
	static final String WITHDRAW = "출금";
	static final NumberFormat NUMBER_FORMAT = NumberFormat.getInstance();
	
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
		transactions.add(transaction);
	}

	public abstract void withdraw(double amount);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public List<Transaction> getTransactions() {
		return transactions;
	}
	
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	public abstract String getKind();
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(accountNo);
		sb.append("|");
		sb.append(name);
		sb.append("|");
		sb.append(NUMBER_FORMAT.format(balance));
		sb.append("|");
		sb.append(getKind());
		
		return sb.toString();
	}
	
}
