package com.javaex.basics.Practice02;

public class Problem03 {

	public static void main(String[] args) {
		practice03();

	}
	private static void practice03() {
		char c[] = {'T', 'h', 'i', 's', ' ', 'i',
				's', ' ', 'a', ' ', 'p', 'e', 'n',
				'c', 'i', 'l'};
		for (char pen:c) {
			System.out.print(pen);
			
		}
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ' ) {
				c[i] = ',';
			}
		}
		for (char pen:c) {
			System.out.print(pen);
		
	}

}
}
