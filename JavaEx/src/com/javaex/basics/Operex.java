package com.javaex.basics;

public class Operex {
	public static void main(String[] args) {
//		arithOperEx();
//		logicOper();
//		bitOper();
//		bitShift();
		conditionalOper();
	}
	// 3항연산자 : 조건부 연산자
	private static void  conditionalOper() {
		int a = 10;
		
		// a가 짝수(2의배수)면 짝수 출력, 아니면 홀수 출력
		String message;
		// 조건식 ? 참일 때의 값: 거짓일 때의 
		message = a % 2 == 0? "짝수": "홀수";
		System.out.println(message);
		
		int score = 70;
		
		// 80점 이상이면 Good
		// 80~50 이면 Pass
		// 그 이하면 Fail
		message = score >= 80 ? "Good":
							score >= 50 ? "Pass": "Fail";
		System.out.println("점수:" + score + ", 결과:" + message);
		
	}
	// 비트 시프트 연산자
	// 비트 단위 이동
	private static void bitShift() {
		int data = 1;
		System.out.println(data);
		
		System.out.println("1비트 왼쪽 시프트: " + 
				Integer.toBinaryString(data << 1));
		System.out.println("4비트 왼쪽 시프트: " + 
				Integer.toBinaryString(data << 4));
		
		data = 0b1000;
		System.out.println("원본:" +
				Integer.toBinaryString(data));
		System.out.println("1비트 우측 시프트: " + 
				Integer.toBinaryString(data >> 1));
		System.out.println("4비트 우측 시프트: " + 
				Integer.toBinaryString(data >> 3));
	}
	// 비트 연산자
	// 비트단위로 미세한 조작이 필요할 때 사용
	// 하드웨어 제어, 이미지 프로세싱
	private static void bitOper() {
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println("b1 : " +Integer.toBinaryString(b1));
		System.out.println("b2 : " +Integer.toBinaryString(b2));
		int result = b1 & b2; // 비트 논리 곱 : 둘다 1이어야 1비트로 세팅
		System.out.println("b1&b2: " + Integer.toBinaryString(result));
		result = b1 | b2; // 비트 논리 합: 둘 중 한 개만 1이면 1비트로 세팅
		System.out.println("b1|b2: " + Integer.toBinaryString(result));
		result = ~b1; // 비트 논리 부정 : 1 <-> 0
		System.out.println("~b1: " + Integer.toBinaryString(result));
		// ~b1: 11111111111111111111111111110010 8자리씩 끊어서 4자리(비트는 8단위로 끊고 4칸으로 표현)
		
	}
	
	// 비교연산, 논리연산
	// 결과로 boolean 반환, 논리값으로 프로그램의 흐름제어 - > 중요
	private static void logicOper() {
		// 비교 연산자 >, >=, <, <=, ==, !=
		int n1 = 7;
		int n2 = 3;
		
		System.out.println("a가 b와 같은가?" + (n1 == n2));
		System.out.println("a가 b와 같지 않은가? " + (n1 != n2));
		
		// 논리 연산 : AND(논리곱:&&),OR(논리합:||),NOT(논리부정: !)
		// -> 집합을 떠올리자
		int n3 = 5;
		
		// n3는 0초과, 10미만의 값인가?
		// 	조건 1: n3 > 0
		//	조건 2: n3 < 10
		//  -> 조건 1 and 조건 2 : 교집합 영역
		boolean r1 = n3 > 0;
		boolean r2 = n3 < 10;
		boolean r1andr2 = r1 && r2;
		System.out.println("n3가 0 초과 10미만 영역에 있는가?" + r1andr2);
		
		// n3는 0이하이거나 10 이상의 값인가?
		// 	조건 1: n3 <= 0
		// 	조건 2: n3 >= 10
		r1 = n3 <= 0;  // 조건 1
		r2 = n3 >= 10; // 조건 2
		boolean r1orr2 = r1 || r2;
		System.out.println("n3가 0이하 10이상 영역에 있는가?" + r1orr2);
		
		// not 논리 부정 -> true <-> false 반전
		boolean rNot = !(n3 > 0 && n3 < 10); // 여집합 영역
		// -> n3 <= 0 || n3 >= 10
		System.out.println("논리부정: " + rNot);
		
		
	}
	
	// 산술연산자
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		// 부호연산자:+, -, 
		System.out.println(-a); //a * -1
	
		// 사칙연산 : +,-,/,*
		System.out.println(a + "/" + b + "=" + (a / b));	// 정수 나눗셈의 몫
		System.out.println("a를 b로 나눈 나머지:" + (a % b)); // 정수 나눗셈의 나머지
		
		// 정수 / 정수 -> 정수
		
		// 실제 나눗셈의 결과는?
		
		System.out.println((float)a / (float)b); // int -> float 변환
		System.out.println((float)a / b); // b는 float으로 자동 변환 
		
		System.out.println("---------");
		// 증감연산자 ++, --
		// 위치에 따라 연산순서가 달라진다
		a = 7;
		System.out.println("a:" + a);
		System.out.println("전위 증감연산:" + (++a));
		System.out.println("최종 a:" + a);
		
		a = 7;
		System.out.println("a:" + a);
		System.out.println("후위 증감연산:" + (a++));
		System.out.println("최종 a:" + a);
		
		
		// 나눗셈 보충
		a = 7;
//		System.out.println(a / 0); -> 정수를 0으로 나누면 ArithmeticException
		System.out.println((float)a / 0); // Infinity
		
		// Infinity 가 포함된 연산식은 항상 Infinity
		// Infinity의 체크
		System.out.println("7.0 / 0 은 유한수인가? " + Double.isFinite(7.0/0));
		// Infinity가 포함된 연산식 -> Infinity
		
		System.out.println("0.0 / 0.0? " + (0.0 / 0.0)); // NaN(Not a Number)
		//NaN가 포함된 연산식 -> NaN : 연산불가의 의미
		System.out.println("0.0 / 0.0 is NaN? " + Double.isNaN(0.0 / 0.0));
		System.out.println(0.0 / 0.0 + 10);
	}
}
