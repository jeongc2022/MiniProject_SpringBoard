package example_bank;

public class Test {
	
	static final String ACCOUNTS_HEADING = "계좌번호|소유자명|잔액";
	static final String TRANSACTIONS_HEADING = "거래일|거래시간|입/출금|거래금액|잔액";
	
	public static void main(String[] args) {
		
		// 테스트 계솨를 추가한다.
		Bank bank = new Bank();
		bank.addAccount("101", "홍길동");
		bank.addAccount("202", "임꺽정");
		bank.addAccount("303", "장길산");
		bank.addAccount("404", "홍길동");
		
		//1. 총계좌 목록을 출력한다.
		System.out.println("1. 총계좌목록을 출력한다.");
		Account[] accounts = bank.getAccounts();
		int totalAccount = bank.getTotalAccount();
		System.out.println(ACCOUNTS_HEADING);
		for (int i = 0; i < totalAccount; i++) {
			System.out.println(accounts[i]);
		}
		
		System.out.println();
		
		//2. 101계좌에 10,000원을 입금한다.
		System.out.println("2. 101rPwhkdp 10,000원을 입금한다.");
		Account hong = bank.getAccount("101");
		hong.deposit(10000);
		System.out.println(ACCOUNTS_HEADING);
		System.out.println(hong);
		
		System.out.println();
		
		//3. 101 계좌에 5,000원을 출금한다.
		System.out.println("3. 101계좌에서 5,000원을 출금한다.");
		hong.withdraw(5000);
		System.out.println(ACCOUNTS_HEADING);
		System.out.println(hong);
		
		System.out.println();
		
		//4. 101계좌 거래 내용을 출력한다.
		System.out.println("4. 101계좌 거래 내용을 출력한다.");
		Transaction[] transactions = hong.getTransactions();
		int totalTransaction = hong.getTotalTransaction();
		System.out.println(TRANSACTIONS_HEADING);
		for (int i = 0; i < totalTransaction; i++) {
			System.out.println(transactions[i]);
		}
		
		System.out.println();
		
		//5. 고객명으로 계좌를 찾는다.
		System.out.println("5. 고객명으로 계좌를 찾는다.");
		Account[] matched = bank.findAccountByName("홍길동");
		System.out.println(ACCOUNTS_HEADING);
		for (Account account : matched) {
			System.out.println(account);
		}
		
	}

}
