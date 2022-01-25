package java_io.stream;

import java.io.FileWriter;
import java.io.IOException;

public class OutputTest {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:/java/output.txt", true);
			fw.write("테스트");
			fw.flush();
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
