package example_exception;

public class Ex {
	private static void displayHowToUse() {
		System.out.println("���� 1000�� �Ա� : java example_exception d 1000");
		System.out.println("���� 1000�� ��� : java example_exception w 1000");
	}
	
	public static void main(String[] args) {
		int MAX_BALANCE = 3000;	// �ִ� �ܾ�
		int balance = 1000;		// �ܾ�
		int amount = 0;			// �Աݾ� �Ǵ� ��ݾ�
		
		if (args.length < 2) {
			displayHowToUse();
			return;
		}
		
		amount = Integer.parseInt(args[1]);
		
		if (args[0].equals("d")) {
			if (balance + amount > MAX_BALANCE) {
				System.out.println("�ִ� �ܾ��� �Ѱ� �Ա��� �� �����ϴ�.");
			} else {
				balance = balance + amount;
				System.out.println(amount + "���� �ԱݵǾ����ϴ�.");
			}
		} else if (args[0].equals("w")) {
			if (balance - amount < 0) {
				System.out.println("�ܾ��� �����Ͽ� ����� �� �����ϴ�.");
			} else {
				balance = balance - amount;
				System.out.println(amount + "���� ��ݵǾ����ϴ�.");
			}
		} else {
			displayHowToUse();
			return;
		}
		
		System.out.println("�ܾ� " + balance);
		
	}	//main method end

}
