package com.javaex.basics.Practice01;

public class Problem01 {

	public static void main(String[] args) {
		practice01();

	}
	private static void practice01() {
		for (int num = 1; num < 101; num++) {
			if ( num % 5 == 0 && num % 7 ==0) {
				System.out.print(num + "\n");
			}
		}
	}

}
