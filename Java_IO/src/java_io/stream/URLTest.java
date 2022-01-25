package java_io.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;


public class URLTest {

	public static void main(String[] args) {
		String url = "http://www.java-school.net";
		String file = "index html";
		InputStream in = null;
		
		BufferedReader br = null;
		FileOutputStream fos = null;
		BufferedWriter bw = null;
		
		try {
			in = (new URL(url)).openStream();
			br = new BufferedReader(new InputStreamReader(in));
			fos = new FileOutputStream(file);
			bw = new BufferedWriter(new OutputStreamWriter(fos));
			String str = null;
			while ((str = br.readLine()) != null) {
				bw.write(str);
				bw.newLine();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
