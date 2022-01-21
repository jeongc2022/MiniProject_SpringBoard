package static2;

class Counter3 {
	static int count = 0;
	Counter3() {
		count++;
		System.out.println(count);
	}
	
	public static int getCount() {
		return count;
	}
}
public class Sample3 {

	public static void main(String[] args) {
		Counter3 c1 = new Counter3();
		Counter3 c2 = new Counter3();

		System.out.println(Counter3.getCount()); // 스태틱 메서드는 클래스를 이용하여 호출
	}

}
