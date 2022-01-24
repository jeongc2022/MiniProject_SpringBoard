package java_io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1_1 {

	public static void main(String[] args) throws IOException {
		int n = 0;
		FileInputStream fis = new FileInputStream("C:/java/javaApp/test.txt");
		FileOutputStream fos = new FileOutputStream("C:/java/javaApp/testCopy.txt", false);
		
		while ((n = fis.available()) > 0) {
			byte[] b = new byte[n];
			int result = fis.read(b);
			if (result == -1) {
				break;
			}
			fos.write(b);
		}
		fis.close();
		fos.close();

	}

}
