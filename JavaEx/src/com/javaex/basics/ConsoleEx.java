package com.javaex.basics;

public class ConsoleEx {

	public static void main(String[] args) {
		consoleOutputEx();

	}
	
	private static void consoleOutputEx() { 
		// 콘솔 출력
		// System.out -> 표준출력
		// System.err -> 표준에러
		
		// print 메서드 -> 출력 후 개행 안함
		// println 매서드 -> 출력 후 개행 함
		System.out.print("Hello ");
		System.out.println("Java");
		
		// 이스케이프 문자: 특수한 의미를 가진 문자
		System.out.println("Hello\nJava"); // \n -> 강제개행
		System.out.println("Hello\tJava"); // \t -> 탭문자 
		
//		Hello, "Java"
		System.out.println("Hello, \"Java\""); // \" -> "
		// \자체를 표기하고자 할때
		String dir = "C:\\Windows\\System"; // \\ -> \
		System.out.println(dir);
		
		System.err.println("표준 에러 출력!");
	}

}
