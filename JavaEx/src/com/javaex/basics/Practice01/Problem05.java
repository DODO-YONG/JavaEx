package com.javaex.basics.Practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		practice05();

	}
	private static void practice05() {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);

		int max = 0;
		for (int i = 1; i < 6; i++) {
			System.out.print("숫자: ");
			int num = scanner.nextInt();
			if (num >= max) {
				max = num;
			}
		}
		System.out.printf("최대값은 %d입니다.", max);
	}
	
}