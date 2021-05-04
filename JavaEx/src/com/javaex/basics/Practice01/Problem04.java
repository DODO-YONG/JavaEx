package com.javaex.basics.Practice01;

public class Problem04 {

	public static void main(String[] args) {
		practice04();

	}
	private static void practice04() {
		for (int num1 = 0; num1 <= 9; num1++) {
			for (int num2 = 1; num2 <11; num2++) {
				System.out.print(num2 + num1 + "\t");
			}
			System.out.println();
		}
	}

}
