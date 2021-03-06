package com.javaex.basics;

import java.util.Scanner;

public class LoppEx {

	public static void main(String[] args) {
//		whileEx();
//		whileGugu();
//		whileInfinity();
//		doWhileEx();
//		forLoopEx();
//		continueEx();
//		breakEx();
//		randomEx();
		practiceEx();
	}
	private static void practiceEx() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("구구단 숫자를 입력하세요");
//		int dan = scanner.nextInt();
//		for(int num = 1; num < 10; num++) {
//			System.out.println(dan + "*" + num + "=" + (dan * num));
//		}
		for(int num = 1; num < 10; num++) {
			for(int num2 = 2; num2 < 10; num2++) {
				System.out.print(num2 + "*" + num + "=" + (num * num2) + " ");
			}
			System.out.println();
		}
		for (int num = 1; num < 7; num++) {
			for (int num2 = 1; num2 <= num; num2++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	private static void randomEx() {
		//	1부터 45까지의 난수 6개 출력
		// for문 버전
		for (int i = 0; i < 6; i++) {
			int randnum = (int)(Math.random() * 45) + 1;
			System.out.print(randnum + " " );
		}
		System.out.println(); // 개행
		
		//	while문 버전
		int i = 0;
		
		while(i < 6) {
			System.out.print((int)(Math.random() * 45) + 1);
			System.out.print(" ");
			i++;
		}
		System.out.println();
	}
	private static void breakEx() {
		//	6과 14로 동시에 나누어 떨어지는 수 찾아보자
		//	어디까지 루프를 돌려야할 지 판단이 어려움
		// 	while 루프가 적합
		int num = 1;
		
		while(true) {
			if (num % 6 ==0 && num % 14 == 0) break;
			System.out.print(".");
			num ++;
		}
		System.out.println("\n" + num);
	}
	private static void continueEx() {
		//	1부터 20 수 중	 2의 배수, 3의 배수를 제외한 나머지를 출력
		for (int i = 1; i <= 20; i++) {
			if(i % 2 == 0 || i % 3 == 0) continue;	
//			2의 배수, 3의 배수이면 아래코드는 수행하지 않고 다음번 루프 수
			System.out.println(i);
		}
	}
	private static void forLoopEx() {
		//	구구표 출력 (for문 버전) -> whileGugu와 비교
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		//	for(제어변수초기화; 반복조건체크; 증감식)	
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + "*" + num + "=" + (dan * num));
		}
		scanner.close();
	}
	private static void doWhileEx() {
		// while 문의 반복 조건을 뒤에서 확인
		//	최소 1회는 실행해야 하는 경우 do ~ while 문 사용
		//	사용자에게 숫자 입력 받아 모두 합산하는 코드
		// 사용자가 0을 입력하면 반복 종료
		int total = 0; //	합산변수
		int value = 0; //	제어변수
		
		Scanner scanner = new Scanner(System.in);
		
		do {	//	일단 실행 후 뒤에서 체크
			System.out.print("숫자를 입력하세요: [0이면 종료]");
			value = scanner.nextInt();
			total += value;
		} while (value != 0); // 0이 아니면 반복
		
		System.out.println("합계:" + total);
		scanner.close();
	}
	private static void whileInfinity() {
		//	while문은 반복 조건을 개발 세팅해야
		//	-> 무한 루프에 빠질 위험
		//	경우에 따라 의도적으로 무한 루프를 만들기도 한다
		//	반복 조건이 항상 true여야 한다
		while(true) {
			System.out.println("Ctrl+C to quit");
			
		}
	}
	private static void whileGugu() {
		// while 문을 이용한 구구표 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단을 입력해주세요:");
		int dan = scanner.nextInt();
		
		int i = 1; // 루프 제어 변수
		
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
			// 제어변수 증가
			i++;
		}
		scanner.close();
	}
	private static void whileEx() {
		// 1부터 10까지 반복하면서 합산 후 결과 출력
		// 제어 변수
//break point
		int num = 1;
		int total = 0; //	합산 변수
		
		//	루프
		while(num <= 10) {
			total += num; //	확장 할당 연산자
			//	while 문은 무한 루프에 빠지기 쉬우므로
			//	제어변수를 적절히 변경해 줘야한다.
			num++;
		}
		
		System.out.println("합산값: " + total);
	}

}
