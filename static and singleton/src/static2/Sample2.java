package static2;

class Counter2 {
	static int count = 0;
	Counter2() {
		count++;	// count�� �� �̻� ��ü������ �ƴϹǷ� this�� �������ϴ� ���� ����.
		System.out.println(count);	// this ����
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter2 c1 = new Counter2();
		Counter2 c2 = new Counter2();
	}

}
