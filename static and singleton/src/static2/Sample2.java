package static2;

class Counter2 {
	static int count = 0;
	Counter2() {
		count++;	// count는 더 이상 객체변수가 아니므로 this는 제ㅐ거하는 것이 좋다.
		System.out.println(count);	// this 제거
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter2 c1 = new Counter2();
		Counter2 c2 = new Counter2();
	}

}
