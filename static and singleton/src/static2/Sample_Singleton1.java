package static2;

class Singleton {
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return new Singleton();	// 같은 클래스이므로 생성자 호출이 가능하다.
	}
}
public class Sample_Singleton1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
	}

}
