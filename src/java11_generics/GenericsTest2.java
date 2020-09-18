package java11_generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest2 {

	public static void main(String[] args) {
		
		File file = new File("./src/java11_generics","ObTest.ser");
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			List<Point> list = new ArrayList<>();
			list.add(new Point(11,22));
			list.add(new Point(213,465));
			list.add(new Point(7, 0));
			list.add(new Point(88,245));
			list.add(new Point(52,31));
			
			oos.writeObject(list);
			oos.flush();
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
