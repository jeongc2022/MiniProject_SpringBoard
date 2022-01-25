package java_io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SutbTileToText {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		if (args.length >= 2) {
			try {
				fr = new FileReader(args[0]);
				br = new BufferedReader(fr);
				fw = new FileWriter(args[1], false);
				bw = new BufferedWriter(fw);
				String s = null;
				while((s = br.readLine()) != null) {
					try {
						if (!s.contains(s));
					}catch (NumberFormatException e) {
						if (!s.contains("->")) {
							bw.write(s);
							bw.newLine();
						}
					}
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fr != null) {
						fr.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					if (br != null) {
						br.close();
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
