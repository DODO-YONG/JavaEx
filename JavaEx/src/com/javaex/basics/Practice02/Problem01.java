package com.javaex.basics.Practice02;

public class Problem01 {

	public static void main(String[] args) {
		practice01();

	}

	private static void practice01() {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19,
				18, 20, 30, 33, 31 };
		int thrSum = 0;
		int thrCount = 0;
		for (int datas:data) {
			if (datas % 3 == 0) {
				thrCount++;
				thrSum += datas;
			}
			
		}
		System.out.printf("주어진 배열에서 3의 배수의 개수=>%d%n", thrCount);
		System.out.printf("주어진 배열에서 3의 배수의 합=>%d", thrSum);
	}
}
