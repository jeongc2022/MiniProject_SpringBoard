package java_io.serialize;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Recovery {

	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("address.txt"));
			while(true) {
				Address addr = (Address) in.readObject();
				System.out.println(addr.getMobile());
				System.out.println(addr.getAddress());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
        } catch (EOFException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
