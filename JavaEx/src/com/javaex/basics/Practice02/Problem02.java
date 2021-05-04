package com.javaex.basics.Practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		practice02();

	}
	private static void practice02() {
		Scanner scanner = new Scanner(System.in);
		float total = 0.0F;
		for (int i = 1; i < 6; i++) {
			int num = scanner.nextInt();
			total += num;
			
		}
		System.out.printf("평균은 %.1f 입니다.", total/5);
		
	}

}
