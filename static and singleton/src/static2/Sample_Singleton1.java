package static2;

class Singleton {
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return new Singleton();	// ���� Ŭ�����̹Ƿ� ������ ȣ���� �����ϴ�.
	}
}
public class Sample_Singleton1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
	}

}
