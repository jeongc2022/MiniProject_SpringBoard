package singleton;

public class CookTable {
	
	private static CookTable instance = new CookTable();	// Ŭ������ �ε��� �� �ʱ�ȭ
	
	public static CookTable getInstance() {
		return instance;
	}
	
	private CookTable() {}
	
}
