package java_io.stream;

import java.io.FileReader;
import java.io.FileWriter;

public class Test2 {

	public static void main(String[] args)  throws Exception {
		int n = 0;
		FileReader fr = new FileReader("C:/java/javaApp/테스트.txt");
		FileWriter fw = new FileWriter("C:/java/javaApp/테스트카피.txt", false);
		while ((n = fr.read()) != -1) {
			fw.write(n);
		}
		fr.close();
		fw.close();
	}

}
