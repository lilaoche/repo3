package 数组列表;

import java.util.ArrayList;

public class 数组 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("abc");
		list.add("123");
		list.add("true");
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println("=====");
		list.remove("abc");
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
		System.out.println(list.size());
		
	}

}
