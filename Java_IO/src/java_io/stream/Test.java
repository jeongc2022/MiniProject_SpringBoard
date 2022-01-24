package java_io.stream;

import java.io.FileInputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		int n = 0;
		FileInputStream fis = new FileInputStream("C:/java/javaApp/test.txt");
		while ((n = fis.available()) > 0) {
			byte[] b = new byte[n];
			int result = fis.read(b);
			if (result == -1) {
				break;
			}
			String s = new String(b);
			System.out.println(s);
		}
		fis.close();
	}

}
