package com.javaex.basics.Practice01;

public class Problem03 {

	public static void main(String[] args) {
		practice03();

	}
	private static void practice03() {
		for (int num1 = 1; num1 < 10; num1++) {
			for (int num2 = 2; num2 < 10; num2++) {
				System.out.print(num2 + "*" + num1 + "=" + num1 * num2 + "\t");
			}
			System.out.println();
		}
	}

}
