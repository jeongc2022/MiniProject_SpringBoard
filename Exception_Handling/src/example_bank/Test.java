package example_bank;

public class Test {
	
	static final String ACCOUNTS_HEADING = "���¹�ȣ|�����ڸ�|�ܾ�";
	static final String TRANSACTIONS_HEADING = "�ŷ���|�ŷ��ð�|��/���|�ŷ��ݾ�|�ܾ�";
	
	public static void main(String[] args) {
		
		// �׽�Ʈ ��ݸ� �߰��Ѵ�.
		Bank bank = new Bank();
		bank.addAccount("101", "ȫ�浿");
		bank.addAccount("202", "�Ӳ���");
		bank.addAccount("303", "����");
		bank.addAccount("404", "ȫ�浿");
		
		//1. �Ѱ��� ����� ����Ѵ�.
		System.out.println("1. �Ѱ��¸���� ����Ѵ�.");
		Account[] accounts = bank.getAccounts();
		int totalAccount = bank.getTotalAccount();
		System.out.println(ACCOUNTS_HEADING);
		for (int i = 0; i < totalAccount; i++) {
			System.out.println(accounts[i]);
		}
		
		System.out.println();
		
		//2. 101���¿� 10,000���� �Ա��Ѵ�.
		System.out.println("2. 101rPwhkdp 10,000���� �Ա��Ѵ�.");
		Account hong = bank.getAccount("101");
		hong.deposit(10000);
		System.out.println(ACCOUNTS_HEADING);
		System.out.println(hong);
		
		System.out.println();
		
		//3. 101 ���¿� 5,000���� ����Ѵ�.
		System.out.println("3. 101���¿��� 5,000���� ����Ѵ�.");
		hong.withdraw(5000);
		System.out.println(ACCOUNTS_HEADING);
		System.out.println(hong);
		
		System.out.println();
		
		//4. 101���� �ŷ� ������ ����Ѵ�.
		System.out.println("4. 101���� �ŷ� ������ ����Ѵ�.");
		Transaction[] transactions = hong.getTransactions();
		int totalTransaction = hong.getTotalTransaction();
		System.out.println(TRANSACTIONS_HEADING);
		for (int i = 0; i < totalTransaction; i++) {
			System.out.println(transactions[i]);
		}
		
		System.out.println();
		
		//5. �������� ���¸� ã�´�.
		System.out.println("5. �������� ���¸� ã�´�.");
		Account[] matched = bank.findAccountByName("ȫ�浿");
		System.out.println(ACCOUNTS_HEADING);
		for (Account account : matched) {
			System.out.println(account);
		}
		
	}

}
