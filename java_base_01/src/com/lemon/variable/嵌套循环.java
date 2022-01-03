package com.lemon.variable;

public class 嵌套循环 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 外层循环执行一次,里层循环执行全部
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
