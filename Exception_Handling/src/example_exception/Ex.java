package example_exception;

public class Ex {
	private static void displayHowToUse() {
		System.out.println("사용법 1000원 입금 : java example_exception d 1000");
		System.out.println("사용법 1000원 출금 : java example_exception w 1000");
	}
	
	public static void main(String[] args) {
		int MAX_BALANCE = 3000;	// 최대 잔액
		int balance = 1000;		// 잔액
		int amount = 0;			// 입금액 또는 출금액
		
		if (args.length < 2) {
			displayHowToUse();
			return;
		}
		
		amount = Integer.parseInt(args[1]);
		
		if (args[0].equals("d")) {
			if (balance + amount > MAX_BALANCE) {
				System.out.println("최대 잔액을 넘게 입금할 수 없습니다.");
			} else {
				balance = balance + amount;
				System.out.println(amount + "원이 입금되었습니다.");
			}
		} else if (args[0].equals("w")) {
			if (balance - amount < 0) {
				System.out.println("잔액이 부족하여 출금할 수 없습니다.");
			} else {
				balance = balance - amount;
				System.out.println(amount + "원이 출금되었습니다.");
			}
		} else {
			displayHowToUse();
			return;
		}
		
		System.out.println("잔액 " + balance);
		
	}	//main method end

}
