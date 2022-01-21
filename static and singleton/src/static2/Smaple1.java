package static2;

class Counter1 {
	int count = 0;
	Counter1() {
		this.count++;
		System.out.println(this.count);
	}
}

public class Smaple1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter1 c1 = new Counter1();
		Counter1 c2 = new Counter1();
	}

}
