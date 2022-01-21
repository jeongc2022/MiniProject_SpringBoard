package singleton;

public class CookTable {
	
	private static CookTable instance = new CookTable();	// 클래스가 로딜될 때 초기화
	
	public static CookTable getInstance() {
		return instance;
	}
	
	private CookTable() {}
	
}
