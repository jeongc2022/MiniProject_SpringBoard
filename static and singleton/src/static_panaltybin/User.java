package static_panaltybin;

public class User {
	
	public static int total;	// �� ȸ�� ��
	private String id;
	
	public User(String id) {
		this.id = id;
		total++;
	}
	
	public static void main(String[] args) {
		User user1 = new User("hong1440");
		User user2 = new User("im1562");
		User user3 = new User("jang1692");
		
		System.out.println("�� ȸ�� �� : " + User.total);
	}

}
