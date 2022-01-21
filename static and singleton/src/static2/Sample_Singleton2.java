package static2;

class Singleton2 {
	private static Singleton2 one;
	private Singleton2() {
	}
	
	public static Singleton2 getInstance() {
		if(one==null) {
			one = new Singleton2();
		}
		return one;
	}
}

public class Sample_Singleton2 {

	public static void main(String[] args) {
		Singleton2 singleton1 = Singleton2.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		System.out.println(singleton1 == singleton2); // true Ãâ·Â

	}

}
