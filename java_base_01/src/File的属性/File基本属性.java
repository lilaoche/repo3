package File的属性;

import java.io.File;

public class File基本属性 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// File基本属性
		File file = new File("E://1.txt");
		boolean exists = file.exists();
		System.out.println(exists);
		String name = file.getName();
		System.out.println(name);
	}

}
