package java_io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;

public class Test2_1 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:/java/javawork/테스트.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = null;
		FileWriter fw = new FileWriter("C:/java/javawork/테스크카피2.txt", false);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();
			fr.close();
			br.close();
			bw.close();
			fw.close();
		}
	}

}
