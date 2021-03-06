package java11_generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class GenericsTest2_2 {

	public static void main(String[] args) {
		
		File file = new File("./src/java11_generics","ObTest.ser");
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			
			List<Point> list = (List<Point>) ois.readObject();
			System.out.println(list);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {			
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
